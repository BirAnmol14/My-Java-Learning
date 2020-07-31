package Doubly_LinkedList;

public class Dll {
	private Node head;
	private Node tail;

	public Dll() {
		head = null;
		tail = null;
	}

	public Node create(int data) {
		return new Node(data);
	}

	public void add(int data) {
		if (head == null) {
			head = create(data);
			tail = head;
			return;
		}
		tail.setNext(create(data));
		tail.getNext().setPrevious(tail);
		tail = tail.getNext();
		return;
	}

	public void add_head(int data) {
		if (head == null) {
			head = create(data);
			tail = head;
			return;
		}
		head.setPrevious(create(data));
		head.getPrevious().setNext(head);
		head = head.getPrevious();
		return;
	}

	public void add_after(int data, int value) {
		if (!isPresent(value)) {
			return;
		}
		if (tail.getData() == value) {
			add(data);
			return;
		}
		Node tmp = head;
		while (tmp != tail) {
			if (tmp.getData() == value) {
				Node n = create(data);
				n.setNext(tmp.getNext());
				n.setPrevious(tmp);
				tmp.getNext().setPrevious(n);
				tmp.setNext(n);
				return;
			}
			tmp = tmp.getNext();
		}
	}

	public void add_before(int data, int value) {
		if (!isPresent(value)) {
			return;
		}
		if (head.getData() == value) {
			add_head(data);
			return;
		}
		Node tmp = tail;
		while (tmp != head) {
			if(tmp.getData()==value) {
				Node n=create(data);
				n.setNext(tmp);
				n.setPrevious(tmp.getPrevious());
				tmp.getPrevious().setNext(n);
				tmp.setPrevious(n);
				return;
			}
			tmp=tmp.getPrevious();
		}
	}

	public void display_f() {
		if (head == null) {
			System.out.println("Empty List!");
			return;
		}
		Node tmp = head;
		System.out.print("||");
		while (tmp != null) {
			if (tmp != tail) {
				System.out.print(tmp.getData() + "\t");
			} else {
				System.out.print(tmp.getData());
			}
			tmp = tmp.getNext();
		}
		System.out.println("||");
		return;
	}

	public void display_b() {
		if (tail == null) {
			System.out.println("Empty List!");
			return;
		}
		Node tmp = tail;
		System.out.print("||");
		while (tmp != null) {
			if (tmp != head) {
				System.out.print(tmp.getData() + "\t");
			} else {
				System.out.print(tmp.getData());
			}
			tmp = tmp.getPrevious();
		}
		System.out.println("||");
		return;
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

	public boolean isPresent(int value) {
		if (head == null) {
			return false;
		}
		Node tmp = head;
		while (tmp != null) {
			if (tmp.getData() == value) {
				return true;
			}
			tmp = tmp.getNext();
		}
		return false;
	}

	public int get_head_value() {
		if (head == null) {
			return Integer.MIN_VALUE;
		}
		return head.getData();
	}

	public int get_tail_value() {
		if (tail == null) {
			return Integer.MIN_VALUE;
		}
		return tail.getData();
	}
	public void delete_head() {
		if(head==null) {
			System.out.println("Invalid! List empty");
			return;
		}
		if(head.getNext()==null) {
			head=null;tail=null;return;
		}
		Node tmp=head;
		head=head.getNext();
		head.setPrevious(null);
		tmp.setNext(null);		
	}
	public void delete_tail() {
		if(tail==null) {
			System.out.println("Invalid! List empty");
			return;
		}
		if(tail.getPrevious()==null) {
			head=null;tail=null;return;
		}
		Node temp=tail;
		tail=tail.getPrevious();
		tail.setNext(null);
		temp.setPrevious(null);
	}
	public void delete(int val) {
		if(!isPresent(val)) {
			System.out.println("Not Present");return;
		}
		if(head.getData()==val) {
			delete_head();return;
		}
		if(tail.getData()==val) {
			delete_tail();return;
		}
		Node tmp=head.getNext();
		while(tmp!=tail) {
			if(tmp.getData()==val) {
				tmp.getPrevious().setNext(tmp.getNext());
				tmp.getNext().setPrevious(tmp.getPrevious());
				tmp.setNext(null);
				tmp.setPrevious(null);
				return;
			}
			tmp=tmp.getNext();
		}
	}
	public void display() {
		display_f();
		display_b();
	}
	public void delete_all() {
		Node tmp=head;
		while(tmp!=null) {
			tmp.setPrevious(null);
			tmp=tmp.getNext();
		}
		head=null;
		tail=null;
	}
}

class Node {
	private int data;
	private Node next;
	private Node previous;

	public Node(int data) {
		this.data = data;
		next = null;
		previous = null;
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

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
}