
public class CustomLinkedList {

	static Nodes head;

	public static void main(String[] args) {
		add(1);
		add(12);
		// add(31);
		add(41);
		print();
		addBeginning(5);
		;
		print();
		System.out.println(">>>>> ");
		addMiddle(6);
		;
		System.out.println("");
		print();
	}

	private static void add(int i) {
		Nodes temp = new Nodes(i);
		if (head == null) {
			head = temp;
		} else {
			Nodes curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
		}
	}

	private static void print() {
		Nodes curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

	private static void addBeginning(int i) {
		Nodes temp = new Nodes(i);
		if (head == null) {
			head = temp;
		} else {
			Nodes temps = head.next;
			temp.next = head;
			head = temp;
		}
	}

	private static void addMiddle(int i) {
		Nodes temp = new Nodes(i);
		if (head == null) {
			head = temp;
		} else {
			Nodes fast = head.next;
			Nodes slow = head;
			while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			Nodes sample = slow.next;
			temp.next = sample;
			slow.next = temp;
		}
	}
}

class Nodes {
	int data;
	Nodes next;

	Nodes(int d) {
		data = d;
		next = null;
	}
}