package stack;

import java.util.Random;

public class Stack_ll {
	public static void main(String[] args) {
		Ll_stack s1 = new Ll_stack();
		Random r = new Random();
		for (int j = 0; j <= 5; j++) {
			s1.push(r.nextInt(101));
			s1.display();
		}
		int l = s1.len();
		for (int j = 0; j <= l; j++) {
			s1.pop();
			s1.display();
		}
		s1.push(r.nextInt(11));
		s1.display();
		s1.push(r.nextInt(78));
		s1.display();
		System.out.println(s1.peek());
		s1.display();
		s1.clear();
	}
}

class Ll_stack {
	private Ll list;

	public Ll_stack() {
		list = new Ll();
	}

	public void push(int val) {
		if (list == null) {
			System.out.println("Stack not existing");
			return;
		}
		list.add_head(val);
	}

	public void pop() {
		if (list == null) {
			System.out.println("Stack not existing");
			return;
		}
		list.delete_head();
	}

	public void display() {
		if (list == null) {
			System.out.println("Stack not existing");
		}
		list.show();
	}

	public int len() {
		if (list == null) {
			System.out.println("Stack not existing");

			return Integer.MIN_VALUE;
		}
		return list.size();
	}

	public int peek() {
		if (list == null) {
			System.out.println("Stack not existing");
			return Integer.MIN_VALUE;
		}
		return list.get_head_value();
	}

	public void clear() {
		if(list==null) {
			System.out.println("Stack not existing");return;
		}
		list.delete_all();
		list = null;
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