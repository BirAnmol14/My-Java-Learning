package linked_list;

public class Sll {
	private Node head=null;
	private Node tail=null;
	public Node create_node(int data) {
		return new Node(data);
	}
	public void add_node(int data) {
		if(head==null) {
			head=create_node(data);tail=head;return;
		}
		tail.next=create_node(data);
		tail=tail.next;
		return;
	}
	public void add_node_head(int data) {
		if(head==null) {
			head=create_node(data);tail=head;return;
		}
		Node temp=new Node(data);
		temp.next=head;
		head=temp;
		return;
	}
	public void delete(int value) {
		if(!isPresent(value)) {
			System.out.println("Not Present");return;
		}
		if(head.data==value) {
			head=head.next;
			if(head==null) {
				tail=head;
			}
			return;
		}
		Node tmp=head.next;Node prev=head;
		while(tmp!=null) {
			if(tmp.data==value) {
				if(tmp==tail) {
					tail=prev;
					prev.next=null;
					return;
				}
				else {
					prev.next=tmp.next;
				}
				return;
			}
			prev=tmp;
			tmp=tmp.next;
		}
		return;
	}
	public void display() {
		if(head==null) {
			System.out.println("List does not exist");return;
		}
		Node tmp=head;
		System.out.print("||");
		while(tmp!=null) {
			if(tmp.next!=null) {
			System.out.print(tmp.data+"\t");
			}else {
				System.out.print(tmp.data);
			}
			tmp=tmp.next;
		}
		System.out.println("||");
	}
	public int size() {
		if(head==null) {
			System.out.println("Invalid");return 0;
		}
		int count=0;
		Node tmp=head;
		while(tmp!=null) {
			count++;tmp=tmp.next;
		}
		return count;
	}
	public void add_after(int data , int value) {
		if(head==null) {
			return;
		}
		if(tail.data==value) {
			Node n=create_node(data);
			tail.next=n;
			tail=tail.next;return;
		}
		Node tmp=head;
		while(tmp!=null) {
			if(tmp.data==value) {
				Node n=create_node(data);
				n.next=tmp.next;
				tmp.next=n;
				return;
			}
			tmp=tmp.next;
		}
	}
	public void add_before(int data,int value) {
		if(head==null) {
			return;
		}
		if(head.data==value) {
			Node n=create_node(data);
			n.next=head;
			head=n;
			return;
		}
		Node tmp=head.next;Node prev=head;
		while(tmp!=null) {
			if(tmp.data==value) {
				Node n=create_node(data);
				prev.next=n;
				n.next=tmp;
				return;
			}
			prev=tmp;
			tmp=tmp.next;
		}
	}
	public boolean isPresent(int value) {
		if(head==null) {
			return false;
		}
		Node tmp=head;
		while(tmp!=null) {
			if(tmp.data==value) {
				return true;
			}
			tmp=tmp.next;
		}
		return false;
	}
	public int get_head_value() {
		if(head==null) {
			return Integer.MIN_VALUE;
		}
		return head.data;
	}
	public int get_tail_value() {
		if(tail==null) {
			return Integer.MIN_VALUE;
		}
		return tail.data;
	}
	public void delete_all() {
		head=null;tail=null;
	}
	public static void main(String[] args) {
		Sll list=new Sll();
		list.add_node( 2);
		list.add_node( 4);
		list.add_node( 5);
		list.display();
		System.out.println("Size of List: "+list.size());
		list.add_node_head( 100);
		list.add_node_head(998);
		list.display();
		System.out.println("Size of List: "+list.size());
		list.add_after(1000, 5);
		list.add_node(89);
		list.add_after(26, 2);
		list.add_before(9900,998);
		list.add_node_head(65);
		list.add_before(77,100);
		list.display();
		System.out.println("Size of List: "+list.size());
		System.out.println("89 is present: "+list.isPresent(89));
		System.out.println("-54 is present: "+list.isPresent(-54));
		int size=list.size();
		System.out.println("-----------------------------");
		for(int i=0;i<size+1;i++) {
			System.out.println("Epoch: "+i);
			if(i%2==0) {
				list.delete(list.get_head_value());
			}
			else {
				list.delete(list.get_tail_value());
			}
			list.display();
			System.out.println("Size: "+list.size());
			System.out.println("###################");
		}
		System.out.println("--------------------");
		list.add_node_head(90);
		list.display();
		list.add_node(89);
		list.display();
		list.add_node_head(91);
		list.display();
		list.add_node(78);
		list.display();
		System.out.println("Size: "+list.size());
		list.delete(90);
		list.display();
		list.delete(list.get_tail_value());
		list.display();
		list.add_node(77);
		list.display();
		list.delete(list.get_head_value());
		list.display();
		list.add_node_head(54);
		list.display();
		System.out.println("Size: "+list.size());
		list.delete_all();
		list.display();
	}
}
class Node{
	int data;
	Node(int data){
		this.data=data;
	}
	Node next=null;
}