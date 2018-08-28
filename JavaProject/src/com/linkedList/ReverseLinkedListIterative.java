package com.linkedList;

import com.linkedList.LinkedListw.Node;

public class ReverseLinkedListIterative {

	public static void main(String[] args) {
		LinkedListw linkedList=new LinkedListw();
		System.out.println("Acutal Linked List");
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.print(linkedList.root);
		System.out.println("reverse LinkedList");
		ReverseLinkedListIterative rev=new ReverseLinkedListIterative();
		Node prev=rev.reverse(linkedList.root);
		linkedList.print(prev);
		
	}
	
	
	
	Node reverse(Node root) {
		
		if(root==null) {
			return null;
		}
		else if(root.next==null) {
			return root;
		}
		else {
			Node prev=null;
			Node curr=root;
			Node next=null;
			while(curr!=null) {
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
			return prev;
		}
		
	}
	
}
