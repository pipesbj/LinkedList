/*	Author: Benjamin Pipes
 * 
 * 	The purpose of this program is to implement a simple linked list data structure.
 * 	The main program demonstrates test runs of the operations that the structure
 * 	handles.
 * 
 */
public class ListTester {

	public static void main(String[] args) {
		
	System.out.println("Starting.");
	
	// create list of strings
	LinkedList<String> list = new LinkedList<String>();
	
	//fill list
	list.add("BEN");
	list.add("BOB");
	list.add("JOE");
	list.add("JEFF");
	
	System.out.println("Size: " + list.size()); //should be 4
					//										0	 1	  2    3
	list.remove(1); //removes element at the 1th position [BEN, BOB, JOE, JEFF]
					//											 ^
	list.displayAll();	//display the elements
	list.reverse(); 	//reverse the list
	list.displayAll();	//display the elements
	
	//create a list of integers
	LinkedList<Integer> list1 = new LinkedList<Integer>();
	
	//fill list
	for(int i = 0; i < 16; i++){
		list1.add(i);
	}
	
	
	list1.displayAll(); //display the elements
	
	ListNode[] listArr = new ListNode[16]; //create array structure to hold elements
	listArr = list1.arrRep(); //fill array with elements, giving a useable array
	
	//display array representation
	System.out.println("\nPrinting Array Representation: ");
	for(int i = 0; i < listArr.length; i++){
		System.out.print(listArr[i].item + " ");
	}
	
	list1.remove(6);//removes element at the 6th position
					//node with element '6' will be dereferenced
	
	list1.reverse(); //reverse the integer list
	listArr = list1.arrRep(); //copy the new array representation
	
	//display the new array representation
	System.out.println("\nPrinting Array Representation: ");
	for(int i = 0; i < listArr.length; i++){
		System.out.print(listArr[i].item + " ");
	}
	
	}
	
	

}
