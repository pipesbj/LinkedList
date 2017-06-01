/*	Author: Benjamin Pipes
 * 
 * 	The purpose of this program is to implement a simple linked list data structure.
 * 	The main program demonstrates test runs of the operations that the structure
 * 	handles.
 * 
 */

public class LinkedList<T> {
	private ListNode head;	//initial node of the list. The beginning
	private int size; 		//count of the number of elements in the list
	private int index;		//an abstract index to call to specific elements
	
	/*	constructor
	 * 
	 */
	public LinkedList(){
		size = 0;
		index = 0;
		head = null;
	}
	
	/*	returns the status of the list's capacity
	 * 
	 */
	public boolean isEmpty(){
		return size == 0;
	}
	
	/*	returns the size of the list
	 * 
	 */
	public int size(){
		return size;
	}
	
	/*	returns the node at its abstract index
	 * 	input:	int index
	 * 	output:	the node found at the abstract index
	 */
	public ListNode get(int n){
		ListNode req = head;
		for(int i = 0; i < n; i++){
			req = req.next;
		}
		return req;
	}
	
	/*	returns the node at the end of the list
	 * 	input:	none
	 * 	output:	the node found at the end of the list
	 */
	public ListNode tail(){
		ListNode curr = head; //start traversal at head
		while(curr.next != null){
			curr = curr.next; //move down the list
		}
		return curr;
	}
	
	/*	adds a node containing the object to the list
	 * 	input:	Object item
	 * 	output:	none, creates a node with the item, attaches to tail end of list
	 * 
	 */
	public void add(Object o){
		
		//check if we are at beginning of list
		if(index == 0){
			ListNode node = new ListNode(o);
			head = node; //assign head of list to first node given
			index++; size++; //increment index count
		}
		else{
				ListNode node = new ListNode(o);
				node.prev = tail();
				tail().next = node;			
				index++; size++;		
		}
	}
	
	/*	displays all elements in the list
	 * 
	 */
	public void displayAll(){
		System.out.println("\nElements in List: ");
		ListNode curr = head;
		System.out.print(head.item + " ");
		while(curr.next != null){
			System.out.print(curr.next.item + " ");
			curr = curr.next;
		}

	}
	
	/*	returns an array that represents the elements in the list
	 * 	in their respective order
	 */
	public ListNode[] arrRep(){
		ListNode[] nodes = new ListNode[size];

		//load the original node order into array
		for (int i = 0; i < size; i++){
			nodes[i] = get(i);	
			}
		
		return nodes;
		
	}
	
	/*	removes the node at its abstract index
	 * 	input: 	int index
	 * 	output:	none, removes reference to requested node, links prev and next
	 * 
	 */
	public void remove(int n){
		
		ListNode req = head;
		for(int i = 0; i < n; i++){
			req = req.next;
		}
		ListNode tmp = req.next;
		tmp.prev = req.prev;
		req.prev.next = tmp;
		size--;
	}
	
	/*	Reverse the order of the list, a common problem that is asked
	 * 
	 */
	public void reverse(){

		ListNode curr = head;
		ListNode next = null;
		ListNode prev = null;
		
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		head = prev;

	}
}
