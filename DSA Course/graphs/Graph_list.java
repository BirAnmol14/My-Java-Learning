package graphs;

import java.util.Map;

public class Graph_list {
	private List [] arr;
	private int v;
	public Graph_list(int vertices) {
		v=vertices;
		arr=new List[v];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new List(i);
		}
	}
	public Graph_list(Graph_mat g) {
		
		Map<Integer,int[][]> map=g.getInfo();
		for(int i:map.keySet()) {
			this.v=i;
			break;
		}
		int [] [] grid=map.get(this.v);
		arr=new List[v];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new List(i);
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j]==1) {
					arr[i].add(j);
				}
			}
		}
	}
	public void clear() {
		for(int i=0;i<arr.length;i++) {
			arr[i].clear();
		}
		arr=null;
	}
	public void add_directedEdge(int v1 , int v2) {
		//Assuming vertices start at 0
		if(v1>=arr.length||v2>=arr.length) {
			System.out.println("Vertice Out of bounds, Not added");
			return;
		}
		arr[v1].add(v2);
	}
	public void add_undirectedEdge(int v1 , int v2) {
		//Assuming vertices start at 0
		if(v1>=arr.length||v2>=arr.length) {
			System.out.println("Vertice Out of bounds, Not added");
			return;
		}
		arr[v1].add(v2);
		arr[v2].add(v1);
	}
	public void show() {
		if(arr==null) {
			return;
		}
		for(int i=0;i<arr.length;i++) {
			arr[i].showList();
		}
	}
	public boolean hasDirectedEdge(int v1,int v2) {
		if(arr==null) {
			return false;
		}
		return arr[v1].search(v2);
	}
	public boolean hasUnDirectedEdge(int v1,int v2) {
		if(arr==null) {
			return false;
		}
		return (arr[v1].search(v2)&&arr[v2].search(v1));
	}
	public int [] [] getGrid(){
		int [][] grid=new int[v][v];
		for(int i=0;i<v;i++) {
			Node l=arr[i].getList();
			while(l!=null) {
				grid[i][l.getData()]=1;
				l=l.getNext();
			}
		}
		return grid;
	}
}
class List{
	private int v;
	private Node n;
	private Node tail;
	public List(int v) {
		this.v=v;
		n=null;
	}
	public List(int v,Node n) {
		this.v=v;
		this.n=n;
	}
	public Node getList() {
		return n; 
	}
	public int getvertice() {
		return v;
	}
	public void add(int v) {
		if(n==null) {
			n=new Node(v);
			tail=n;
			return;
		}
		tail.setNext(new Node(v));
		tail=tail.getNext();
	}
	public void showList() {
		System.out.print(v+" : ");
		if(n==null) {
			System.out.println("Nothing");
			return;
		}
		Node tmp=n;
		while(tmp.getNext()!=null) {
			System.out.print(tmp.getData()+" -> ");tmp=tmp.getNext();
		}
		System.out.println(tmp.getData());
	}
	public boolean search(int key) {
		Node tmp=n;
		if(n==null) {
			return false;
		}
		while(tmp!=null) {
			if(tmp.getData()==key) {
				return true;
			}
			tmp=tmp.getNext();
		}
		return false;
	}
	public void clear() {
		v=0;n=null;tail=null;
	}
}
class Node{
	private int data;
	private Node next;
	public Node(int val) {
		data=val;
		next=null;
	}
	public int getData() {
		return data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node n) {
		next=n;
	}
}
