/*	Author: Benjamin Pipes
 * 
 * 	The purpose of this program is to implement a simple linked list data structure.
 * 	The main program demonstrates test runs of the operations that the structure
 * 	handles.
 * 
 */
public class ListNode {
	
	public Object item;		//the element this node will hold
	public ListNode next; 	//reference to the next node
	public ListNode prev; 	//reference to the previous node
	
	public ListNode(Object o){
		item = o;
		next = null;
	}
	
	public ListNode(Object o, ListNode n){
		item = o;
		next = n;
	}

}
