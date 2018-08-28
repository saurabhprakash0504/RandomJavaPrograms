package com.linkedList;

import com.linkedList.LinkedListw.Node;

public class ReverseLinkedListInPair {

	public static void main(String[] args) {
		LinkedListw linkedList=new LinkedListw();
		System.out.println("Acutal Linked List");
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.print(linkedList.root);
		System.out.println("reverse LinkedList");
		ReverseLinkedListInPair rev=new ReverseLinkedListInPair();
		Node prev=rev.reverse(linkedList.root,2);
		linkedList.print(prev);
	}

	/*Node reverseInPair(Node root) {
		
		Node first=root;
		Node second=null;
		Node third=null;
		while(third!=null ) {
			third=first.next.next;
			second=first.next;
			first.next=third;
			second.next=first;
			first=third;
			//curr=third;
		}
		return first;
	}*/
	
	Node reverse(Node head, int k)
    {
       Node current = head;
       Node next = null;
       Node prev = null;
        
       int count = 0;
 
       /* Reverse first k nodes of linked list */
       while (count < k && current != null) 
       {
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
           count++;
           
           
       }
 
       /* next is now a pointer to (k+1)th node 
          Recursively call for the list starting from current.
          And make rest of the list as next of first node */
       if (next != null) 
          head.next = reverse(next, k);
 
       // prev is now head of input list
       return prev;
    }   
}
