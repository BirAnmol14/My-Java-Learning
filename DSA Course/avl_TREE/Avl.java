package avl_TREE;

public class Avl {
	private A_node root;
	public Avl() {
		root=null;
	}
	public void insert(int i) {
		root=add(root,i);//Just like BST with modified add so that it balances all the current nodes
	}
	private int check_balance(A_node left,A_node right) {
		if(left==null&&right==null) {
			return 0;
		}
		else if(left==null) {
			return -1*(calc_height(right)+1);
		}
		else if(right==null) {return calc_height(left)+1;}
		return calc_height(left)-calc_height(right);
	}
	private A_node right_rotate(A_node disbalanced) {
		A_node tmp=disbalanced.getLeft();
		disbalanced.setLeft(disbalanced.getLeft().getRight());
		tmp.setRight(disbalanced);
		disbalanced.height=calc_height(disbalanced);
		tmp.height=calc_height(tmp);
		return tmp; 
	}
	private A_node left_rotate(A_node dbn) {
		A_node tmp=dbn.getRight();
		dbn.setRight(dbn.getRight().getLeft());
		tmp.setLeft(dbn);
		dbn.height=calc_height(dbn);
		tmp.height=calc_height(tmp);
		return tmp;
	}
	private A_node add(A_node n,int i) {
		if(n==null) {
			return new A_node(i);
		}
		else if(i>n.getData()) {
			n.setRight(add(n.getRight(),i));
		}
		else {
		n.setLeft(add(n.getLeft(),i));
		}
		int balance=check_balance(n.getLeft(), n.getRight());
		if(balance>1) {
			if(check_balance(n.getLeft().getLeft(), n.getLeft().getRight())>0) {
				//LL condition
				n=right_rotate(n);
			}else {
				//LR
				n.setLeft(left_rotate(n.getLeft()));
				n=right_rotate(n);
			}
		}else if(balance<-1) {
			if (check_balance(n.getRight().getRight(), n.getRight().getLeft()) > 0) {
				n = left_rotate(n);// RR Condition

			} else {
				n.setRight(right_rotate(n.getRight()));// RL Condition
				n = left_rotate(n);
			}
		}
		if (n.getLeft() != null) {
			n.getLeft().height=calc_height(n.getLeft());
		}
		if (n.getRight() != null) {
			n.getRight().height=calc_height(n.getRight());
		}
		n.height=calc_height(n);
		return n;
	}
	private int calc_height(A_node n) {
		if(n==null) {
			return -1;
		}
		return 1+Integer.max(calc_height(n.getLeft()), calc_height(n.getRight()));
	}
	public boolean find(int key) {
		return find(root, key);
	}
	private boolean find(A_node n,int key) {
		if(n==null) {
			return false;
		}
		if(n.getData()==key) {
			System.out.println(n.getData());
			return true;
		}
		System.out.print(n.getData()+"-->");
		if(n.getData()<key) {
			return find(n.getRight(),key);
		}
		return find(n.getLeft(),key);
	}
	public void pre_order() {
		System.out.println("Pre-Order");
		pre_order(root);
		System.out.println("\n");
	}
	private void pre_order(A_node n) {
		if(n==null) {
			return;
		}
		System.out.print(n.getData()+"\t");
		pre_order(n.getLeft());
		pre_order(n.getRight());
	}
	public void in_order() {
		System.out.println("In-Order");
		in_order(root);
		System.out.println("\n");
	}
	private void in_order(A_node n) {
		if(n==null) {
			return;
		}
		in_order(n.getLeft());
		System.out.print(n.getData()+"\t");
		in_order(n.getRight());
	}
	public void post_order() {
		System.out.println("Post-Order");
		post_order(root);
		System.out.println("\n");
	}
	private void post_order(A_node n) {
		if(n==null) {
			return;
		}
		post_order(n.getLeft());
		post_order(n.getRight());
		System.out.print(n.getData()+"\t");
	}
	public void level_order() {
		System.out.println("Level-order");
		level_order(root);
		System.out.println("\n");
	}
	private void level_order(A_node n) {
		if(n==null) {
			return;
		}
		Queue q=new Queue();
		q.join(n);
		while(!q.isEmpty()) {
			A_node tmp=q.peek();
			if(tmp!=null) {
			q.join(tmp.getLeft());
			q.join(tmp.getRight());
			tmp=q.leave();
			System.out.print(tmp.getData()+"\t");
			}
			else {
				q.leave();
			}
		}
	}
	public void delete(int i) {
		root=delete(root, i);
	}
	private A_node delete(A_node n,int i) {
		if(n==null) {
			return n;
		}
		if(n.getData()<i) {
			n.setRight(delete(n.getRight(), i));
		}
		else if(n.getData()>i) {
			n.setLeft(delete(n.getLeft(), i));
		}
		else {
			//Current node is to be deleted
			if (n.getLeft() != null && n.getRight() != null) {
				A_node temp = n;
				A_node minNodeForRight = minimumElement(temp.getRight());// Finding minimum element from right subtree
				n.setData(minNodeForRight.getData()); // Replacing current node with minimum node from right subtree
				delete(n.getRight(), minNodeForRight.getData());// Deleting minimum node from right now
			} else if (n.getLeft() != null) {// if nodeToBeDeleted has only left child
				n = n.getLeft();
			} else if (n.getRight() != null) {// if nodeToBeDeleted has only right child
				n = n.getRight();
			} 
			else if(n.getLeft()==null&&n.getRight()==null) {
				n=null;
			}
			return n;
		}
		int balance=check_balance(n.getLeft(), n.getRight());
		if(balance>1) {
			if(check_balance(n.getLeft().getLeft(), n.getLeft().getRight())>0) {
				//LL condition
				n=right_rotate(n);
			}else {
				//LR
				n.setLeft(left_rotate(n.getLeft()));
				n=right_rotate(n);
			}
		}else if(balance<-1) {
			if (check_balance(n.getRight().getRight(), n.getRight().getLeft()) > 0) {
				n = left_rotate(n);// RR Condition

			} else {
				n.setRight(right_rotate(n.getRight()));// RL Condition
				n = left_rotate(n);
			}
		}
		if (n.getLeft() != null) {
			n.getLeft().height=calc_height(n.getLeft());
		}
		if (n.getRight() != null) {
			n.getRight().height=calc_height(n.getRight());
		}
		n.height=calc_height(n);
		return n;
	}
	private A_node minimumElement(A_node n) {
		if (n.getLeft() == null)
			return n;
		else {
			return minimumElement(n.getLeft());
		}
	}
	public void clear() {
		root=null;
	}
}
class A_node{
	private int data;
	private A_node left;
	private A_node right;
	public int height;
	public A_node(int i) {
		data=i;
		left=null;
		right=null;
		height=0;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public A_node getLeft() {
		return left;
	}
	public void setLeft(A_node left) {
		this.left = left;
	}
	public A_node getRight() {
		return right;
	}
	public void setRight(A_node right) {
		this.right = right;
	}
	
}
class Queue{
	private Node head;
	private Node tail;
	public Queue() {
		head=null;
		tail=null;
	}
	public void join(A_node i) {
		if(head==null) {
			head=new Node(i);
			tail=head;
			return ;
		}
		tail.setNext(new Node(i));
		tail=tail.getNext();
	}
	public A_node leave() {
		if(head==null) {
			return null;
		}
		Node tmp=head;
		head=head.getNext();
		return tmp.getData();
	}
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}
	public A_node peek() {
		if(head==null) {
			return null;
		}
		return head.getData();
	}
}
class Node{
	private A_node data;
	private Node next;
	public Node(A_node i) {
		data=i;
		next=null;
	}
	public A_node getData() {
		return data;
	}
	public void setData(A_node data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}