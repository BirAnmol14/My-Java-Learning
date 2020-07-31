package tries;

public class Trie {
	private Node root;
	public Trie() {
		root=null;
	}
	public void insert(String s) {
		char [] tmp=s.toCharArray();//It does not have \0 at end in JAVA
		root=insert(root, tmp,0);
	}
	private Node insert(Node n,char[]arr,int index) {
		if(n==null) {
			n=new Node();			
		}
		if(arr.length==index) {
			n.setEnd_of_word(true);
			return n;
		}
		boolean flag=false;
		int max=n.getLast_index();
		for(int i=0;i<=max;i++) {
			if(n.getC_arr()[i]==arr[index]) {
				n.getL_arr()[i]=insert(n.getL_arr()[i], arr, index+1);
				flag=true;break;
			}
		}
		if(!flag) {
			n.setLast_index(n.getLast_index()+1);
			n.getC_arr()[n.getLast_index()]=arr[index];
			n.getL_arr()[n.getLast_index()]=insert(n.getL_arr()[n.getLast_index()], arr, index+1);
		}
		return n;
	}
	public void print_all() {
		if(root==null) {
			System.out.println("Empty");return;
		}
		for(int i=0;i<=root.getLast_index();i++) {
			String s=""+root.getC_arr()[i];
			print_all(root.getL_arr()[i],s);
		}
	}
	private void print_all(Node n,String s) {
		if(n==null) {
			System.out.println(s);return;
		}
		if(n.isEnd_of_word()&&n.getLast_index()==-1) {
			System.out.println(s);return;
		}
		if(n.isEnd_of_word()) {
			System.out.println(s);
		}
		for(int i=0;i<=n.getLast_index();i++) {
			String tmp=s+n.getC_arr()[i];
			print_all(n.getL_arr()[i],tmp);
		}
		return;
	}
	public boolean find(String s) {
		char [] arr=s.toCharArray();
		return find(root,arr,0);
	}
	private boolean find(Node n,char [] arr,int index) {
		if(n==null) {
			return false;
		}
		if(index==arr.length&&!n.isEnd_of_word()) {
			return false;
		}
		if(index==arr.length&&n.isEnd_of_word()) {
			return true;
		}
		if(n.getLast_index()==-1&&index!=arr.length&&n.isEnd_of_word()) {
			return false;
		}
		for(int i=0;i<=n.getLast_index();i++) {
			if(arr[index]==n.getC_arr()[i]) {
				return find(n.getL_arr()[i],arr,index+1);
			}
		}
		return false;
	}
}
class Node{
	private char [] c_arr=new char [100];
	private Node [] l_arr=new Node [100];
	private int last_index=-1;
	private boolean end_of_word=false;
	public char[] getC_arr() {
		return c_arr;
	}
	public void setC_arr(char[] c_arr) {
		this.c_arr = c_arr;
	}
	public Node[] getL_arr() {
		return l_arr;
	}
	public void setL_arr(Node[] l_arr) {
		this.l_arr = l_arr;
	}
	public boolean isEnd_of_word() {
		return end_of_word;
	}
	public void setEnd_of_word(boolean end_of_word) {
		this.end_of_word = end_of_word;
	}
	public int getLast_index() {
		return last_index;
	}
	public void setLast_index(int last_index) {
		this.last_index = last_index;
	}
}