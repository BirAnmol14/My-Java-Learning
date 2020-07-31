package binary_search_tree_BST;

public class BST {
	private BST_node root;
	public BST() {
		root=null;
	}
	private BST_node create(int i) {
		return new BST_node(i);
	}
	public void add(int i) {
		if(root==null) {
			root=create(i);return;
		}
		if(i>root.getData()) {
			root.setRight(add(root.getRight(),i));return;
		}
		root.setLeft(add(root.getLeft(),i));return;
	}
	public int height() {
		return height(root);
	}
	private int height(BST_node n) {
		if(n==null) {
			return -1;
		}
		return 1+Integer.max(height(n.getLeft()), height(n.getRight()));
	}
	private BST_node add(BST_node n,int i) {
		if(n==null) {
			return create(i);
		}
		if(i>n.getData()) {
			n.setRight(add(n.getRight(),i));return n;
		}
		n.setLeft(add(n.getLeft(),i));return n;
	}
	public boolean find(int key) {
		if(root==null) {
			return false;
		}
		if(root.getData()==key) {
			System.out.print(root.getData()+"\t");
			return true;
		}
		if(key>root.getData()) {
			System.out.print(root.getData()+"-->\t");
			return find(root.getRight(), key);
		}
		System.out.print(root.getData()+"-->\t");
		return find(root.getLeft(),key);
	}
	private boolean find(BST_node n,int key) {
		if(n==null) {
			return false;
		}
		if(n.getData()==key) {
			System.out.print(n.getData()+"\t");
			return true;
		}
		if(key>n.getData()) {
			System.out.print(n.getData()+"-->\t");
			return find(n.getRight(), key);
		}
		System.out.print(n.getData()+"-->\t");
		return find(n.getLeft(),key);
	}
	public void in_order() {
		if(root==null) {
			return;
		}
		in_order(root.getLeft());
		System.out.print(root.getData()+"\t");
		in_order(root.getRight());
	}
	private void in_order(BST_node n) {
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
	private void pre_order(BST_node n) {
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
	private void post_order(BST_node n) {
		if(n==null) {
			return;
		}
		post_order(n.getLeft());
		post_order(n.getRight());
		System.out.print(n.getData()+"\t");
	}
	public void clear() {
		root=null;
	}
}
class BST_node{
	private int data;
	private BST_node left;
	private BST_node right;
	public BST_node(int data) {
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
	public BST_node getLeft() {
		return left;
	}
	public void setLeft(BST_node left) {
		this.left = left;
	}
	public BST_node getRight() {
		return right;
	}
	public void setRight(BST_node right) {
		this.right = right;
	}
	
}