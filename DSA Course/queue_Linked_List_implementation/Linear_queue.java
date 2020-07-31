package queue_Linked_List_implementation;

public class Linear_queue {
	private Ll list;
	public Linear_queue() {
		list=new Ll();
	}
	public void enque(int data) {
		if(list==null) {
			System.out.println("No Queue Exists!");return;
		}
		list.add_tail(data);
	}
	public void deque() {
		if(list==null) {
			System.out.println("No Queue Exists!");return;
		}
		list.delete_head();
	}
	public void clear() {
		if(list==null) {
			return;
		}
		list.delete_all();
		list=null;
	}
	public int peek() {
		if(list==null) {
			System.out.println("No Queue Exists!");return Integer.MIN_VALUE;
		}
		return list.get_head_value();
	}
	public boolean isEmpty() {
		if(list==null) {
			return true;
		}
		return list.isEmpty();
	}
	public void display() {
		if(list==null) {
			System.out.println("No Queue Exists!");
			return;
		}
		list.show();
	}
}
class Ll {
	private Node head;
	private Node tail;

	public Ll() {
		head = null;
		tail = null;
	}

	public Node create(int data) {
		return new Node(data);
	}

	public void add_tail(int data) {
		if (head == null) {
			head = create(data);
			tail = head;
			return;
		}
		tail.setNext(create(data));
		tail = tail.getNext();
	}

	public void add_head(int data) {
		if (head == null) {
			head = create(data);
			tail = head;
			return;
		}
		Node n = create(data);
		n.setNext(head);
		head = n;
	}

	public void show() {
		if (head == null) {
			System.out.println("Underflow");
			return;
		}
		Node tmp = head;
		while (tmp != null) {
			System.out.print(tmp.getData() + "\t");
			tmp = tmp.getNext();
		}
		System.out.println("");
	}

	public void delete_head() {
		if (head == null) {
			return;
		}
		head = head.getNext();
	}

	public void delete_tail() {
		if (tail == null) {
			return;
		}
		Node tmp = head;
		while (tmp.getNext() != tail) {
			tmp = tmp.getNext();
		}
		tmp.setNext(null);
		tail = tmp;
	}

	public void delete_all() {
		head = null;
		tail = null;
	}

	public int size() {
		if (head == null) {
			return 0;
		}
		int count = 0;
		Node tmp = head;
		while (tmp != null) {
			count++;
			tmp = tmp.getNext();
		}
		return count;
	}

	public int get_tail_value() {
		if (tail == null) {
			return Integer.MIN_VALUE;
		}
		return tail.getData();
	}

	public int get_head_value() {
		if (head == null) {
			return Integer.MIN_VALUE;
		}
		return head.getData();
	}
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}
}

class Node {
	private int data;
	private Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

