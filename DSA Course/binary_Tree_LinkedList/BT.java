package binary_Tree_LinkedList;


public class BT {
	private Tree_NODE root;
	public BT() {
		root=null;
	}
	public void clear() {
		root=null;
	}
	private Tree_NODE create_n(int data) {
		return new Tree_NODE(data);
	}
	public void in_order() {
		if(root==null) {
			return;
		}
		in_order(root.getLeft());
		System.out.print(root.getData()+"\t");
		in_order(root.getRight());
	}
	private void in_order(Tree_NODE n) {
		if(n==null) {
			return;
		}
		in_order(n.getLeft());
		System.out.print(n.getData()+"\t");
		in_order(n.getRight());
	}
	public void pre_order() {
		if(root==null) {
			return;
		}
		
		System.out.print(root.getData()+"\t");
		pre_order(root.getLeft());
		pre_order(root.getRight());
	}
	private void pre_order(Tree_NODE n) {
		if(n==null) {
			return;
		}
		
		System.out.print(n.getData()+"\t");
		pre_order(n.getLeft());
		pre_order(n.getRight());
	}
	public void post_order() {
		if(root==null) {
			return;
		}
		post_order(root.getLeft());
		post_order(root.getRight());
		System.out.print(root.getData()+"\t");
	}
	private void post_order(Tree_NODE n) {
		if(n==null) {
			return;
		}
		post_order(n.getLeft());
		post_order(n.getRight());
		System.out.print(n.getData()+"\t");
	}
	public void level_order() {
		if(root==null) {
			return;
		}
		Linear_queue q=new Linear_queue();
		q.enque(root);
		while(!q.isEmpty()) {
			Tree_NODE tmp=q.peek();
			if(tmp!=null) {
			q.enque(tmp.getLeft());
			q.enque(tmp.getRight());
			tmp=q.deque();
			System.out.print(tmp.getData()+"\t");
			}else {
				q.deque();
			}
		}
	}
	public boolean find(int i) {
		return level_order(i);
	}
	private boolean level_order(int i) {
		if(root==null) {
			return false;
		}
		Linear_queue q=new Linear_queue();
		q.enque(root);
		while(!q.isEmpty()) {
			Tree_NODE tmp=q.peek();
			if(tmp!=null) {
			q.enque(tmp.getLeft());
			q.enque(tmp.getRight());
			tmp=q.deque();
			if(tmp.getData()==i) {
				return true;
			}
			}else {
				q.deque();
			}
		}
		return false;
	}
	public void insert(int val) {
		if(root==null) {
			root=create_n(val);return;
		}
		level_order_add(val);
	}
	private void level_order_add(int i) {
		Linear_queue q=new Linear_queue();
		q.enque(root);
		while(!q.isEmpty()) {
			Tree_NODE tmp=q.peek();
			if(tmp!=null) {
			q.enque(tmp.getLeft());
			q.enque(tmp.getRight());
			Tree_NODE tmp1=q.deque();
			if(tmp1.getLeft()==null) {
				tmp1.setLeft(create_n(i));return;
			}
			if(tmp1.getRight()==null) {
				tmp1.setRight(create_n(i));return;
			}
			}else {
				q.deque();
			}
		}
		return;
	}
	
}
class Tree_NODE{
	private int data;
	private Tree_NODE left;
	private Tree_NODE right;
	public Tree_NODE(int data) {
		this.data=data;
		left=null;
		right=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Tree_NODE getLeft() {
		return left;
	}
	public void setLeft(Tree_NODE left) {
		this.left = left;
	}
	public Tree_NODE getRight() {
		return right;
	}
	public void setRight(Tree_NODE right) {
		this.right = right;
	}
	
}
class Linear_queue {
	private Ll list;
	public Linear_queue() {
		list=new Ll();
	}
	public void enque(Tree_NODE data) {
		if(list==null) {
			System.out.println("No Queue Exists!");return;
		}
		list.add_tail(data);
	}
	public Tree_NODE deque() {
		if(list==null) {
			System.out.println("No Queue Exists!");return null;
		}
		return list.delete_head();
	}
	public void clear() {
		if(list==null) {
			return;
		}
		list.delete_all();
		list=null;
	}
	public Tree_NODE peek() {
		if(list==null) {
			System.out.println("No Queue Exists!");return null;
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

	public Node create(Tree_NODE data) {
		return new Node(data);
	}

	public void add_tail(Tree_NODE data) {
		if (head == null) {
			head = create(data);
			tail = head;
			return;
		}
		tail.setNext(create(data));
		tail = tail.getNext();
	}

	public void add_head(Tree_NODE data) {
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

	public Tree_NODE delete_head() {
		if (head == null) {
			return null;
		}
		Node tmp=head;
		head = head.getNext();return tmp.getData();
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

	public Tree_NODE get_tail_value() {
		if (tail == null) {
			return null;
		}
		return tail.getData();
	}

	public Tree_NODE get_head_value() {
		if (head == null) {
			return null;
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
	private Tree_NODE data;
	private Node next;

	public Node(Tree_NODE data) {
		this.data = data;
		next = null;
	}

	public Tree_NODE getData() {
		return data;
	}

	public void setData(Tree_NODE data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

