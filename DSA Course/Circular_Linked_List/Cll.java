package Circular_Linked_List;

public class Cll {
	private Node head;
	private Node tail;

	public Cll() {
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
			head.setNext(head);
			return;
		}
		tail.setNext(create(data));
		tail = tail.getNext();
		tail.setNext(head);
		return;
	}
	public void add_at_head(int data) {
		if(head==null) {
			head = create(data);
			tail = head;
			head.setNext(head);
			return;
		}
		Node temp=create(data);
		temp.setNext(head);
		tail.setNext(temp);
		head=temp;
	}
	public void add_at_tail(int data) {
		if(tail==null) {
			head = create(data);
			tail = head;
			head.setNext(head);
			return;
		}
		tail.setNext(create(data));
		tail=tail.getNext();
		tail.setNext(head);
	}
	public void add_after(int data,int value) {
		if(!isPresent(value)) {
			return;
		}
		if(tail.getData()==value) {
			add_at_tail(data);return;
		}
		Node tmp=head;
		while(tmp!=tail) {
			if(tmp.getData()==value) {
				Node n=create(data);
				n.setNext(tmp.getNext());
				tmp.setNext(n);
				return;
			}
			tmp=tmp.getNext();
		}
	}
	public void add_before(int data, int value) {
		if(!isPresent(value)) {
			return;
		}
		if(head.getData()==value) {
			add_at_head(data);
			return;
		}
		Node tmp=head.getNext();Node prev=head;
		while(tmp!=head) {
			if(tmp.getData()==value) {
				prev.setNext(create(data));
				prev=prev.getNext();
				prev.setNext(tmp);
				return;
			}
			prev=tmp;
			tmp=tmp.getNext();
		}
		
	}
	public void display() {
		Node temp = head;
		if (temp == null) {
			System.out.println("Empty List");return;
		}
		System.out.print("||");
		do {
			if (temp != tail) {
				System.out.print(temp.getData() + "\t");
			} else {
				System.out.print(temp.getData());
			}
			temp = temp.getNext();
		} while (temp != head);
		System.out.println("||");
	}

	public boolean isPresent(int value) {
		if (head == null) {
			return false;
		}
		Node temp = head;
		do {
			if (temp.getData() == value) {
				return true;
			}
			temp = temp.getNext();
		} while (temp != head);
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
	public void delete(int data) {
		if(!isPresent(data)) {
			System.out.println("Not Present! Cannot Delete");
		}
		if(head.getData()==data) {
			delete_head();return;
		}
		if(tail.getData()==data) {
			delete_tail();return;
		}
		Node curr=head.getNext();
		Node prev=head;
		while(curr!=tail) {
			if(curr.getData()==data) {
				prev.setNext(curr.getNext());return;
			}
			prev=curr;
			curr=curr.getNext();
		}
	}
	public void delete_head() {
		if(head==null) {
			System.out.println("Invalid! List does not exist");return;
		}
		if(head.getNext()==head) {
			head=null;tail=null;return;
		}
		head=head.getNext();
		tail.setNext(head);
		return;
	}
	public void delete_tail() {
		if(head==null||tail==null) {
			System.out.println("Invalid! List does not exist");return;
		}
		if(tail==head) {
			head=null;tail=null;return;
		}
		Node temp=head;
		while(temp.getNext()!=tail) {
			temp=temp.getNext();
		}
		temp.setNext(tail.getNext());
		tail=temp;
	}
	public int size() {
		if(head==null) {
			return 0;
		}
		Node temp=head;
		int count=0;
		do{
			count++;temp=temp.getNext();
		}while(temp!=head);
		return count;
	}
	public void delete_all() {
		head=null;
		tail.setNext(null);
		tail=null;
	}
}

class Node {
	private int data;
	private Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
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