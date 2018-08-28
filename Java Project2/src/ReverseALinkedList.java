
public class ReverseALinkedList {
	
	Node root;
	public ReverseALinkedList() {
		root=null;
	}
	
	public static void main(String[] args) {
		ReverseALinkedList ll=new ReverseALinkedList();
		ll.root=new Node(2);
		ll.root.next=new Node(5);
		ll.root.next.next=new Node(3);
		ll.root.next.next.next=new Node(6);
		print(ll.root);
		Node head=printRev(ll.root);
		System.out.println("after reversing ");
		print(head);
	}

	private static void print(Node root) {
		Node curr=root;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
		
	}

	private static Node printRev(Node root) {
		Node prev=null;
		Node next=null;
		Node curr=root;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	
}
