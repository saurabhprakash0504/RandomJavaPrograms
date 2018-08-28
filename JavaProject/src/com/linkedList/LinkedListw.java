package com.linkedList;

public class LinkedListw {

	Node root;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		LinkedListw linkedList = new LinkedListw();
		linkedList.add(10);
		linkedList.add(30);
		linkedList.add(20);
		linkedList.add(40);
		linkedList.print(linkedList.root);
		System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
		linkedList.add(50);
		linkedList.print(linkedList.root);
		System.out.println("value removed >>> " + linkedList.removebeginning());
		linkedList.print(linkedList.root);
		linkedList.removingEnd();
		System.out.println("after removing from endd");
		linkedList.print(linkedList.root);

		System.out.println("size >>> " + linkedList.size());

	}

	void add(int data) {
		Node temp = new Node(data);
		if (root == null) {
			root = temp;
		} else {
			Node curr = root;
			while (null != curr.next) {
				curr = curr.next;
			}
			curr.next = temp;
		}
	}

	int removebeginning() {
		if (root == null) {
			return -1;
		} else if (size() == 1) {
			int val = root.data;
			root = null;
			return val;
		} else {
			Node second = root.next;
			int val = root.data;
			root = second;
			return val;
		}
	}

	int removingEnd() {
		if (root == null) {
			return -1;
		} else if (size() == 1) {
			int val = root.data;
			root = null;
			return val;
		} else {
			Node curr = root;
			while (curr.next.next != null) {
				curr = curr.next;
			}
			int temp = curr.next.data;
			curr.next = null;
			return temp;
		}
	}

	int size() {
		if (root == null) {
			return 0;
		} else {
			Node curr = root;
			int length = 0;
			while (curr != null) {
				length = length + 1;
				curr = curr.next;
			}
			return length;
		}
	}

	void print(Node root) {
		Node curr = root;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

}
