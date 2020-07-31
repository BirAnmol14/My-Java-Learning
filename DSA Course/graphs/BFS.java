package graphs;

import java.util.ArrayList;

public class BFS {
	public static void BFS_mat(Graph_mat g,int start) {
		//Making only for undirected graphs
		System.out.println("BFS");
		int [][] arr=g.getInfo().get(g.getInfo().keySet().toArray()[0]);
		ArrayList<Integer> visited=new ArrayList<Integer>();
		while(!allVisited(arr)) {
			Queue q=new Queue();
			q.enqueue(start);
			while(!q.isEmpty()) {
				int v=q.dequeue();
				if(!visited.contains(v)) {
					visited.add(v);
					System.out.print(v+" ");
				}
				for(int i=0;i<arr[v].length;i++) {
					if(arr[v][i]==1) {
						q.enqueue(i);
						arr[v][i]=0;arr[i][v]=0;
					}
				}
			}
		}
		System.out.println("\n--------------------------------------------------------------");
	}
	public static void BFS_list(Graph_list g,int start) {
		BFS_mat(new Graph_mat(g.getGrid()), start);
	}
	private static boolean allVisited(int [][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==1) {
					return false;
				}
			}
		}
		return true;
	}
	public static boolean BFS_search(Graph_mat g,int key){
		double t1=System.nanoTime();
		int [][] arr=g.getInfo().get(g.getInfo().keySet().toArray()[0]);
		ArrayList<Integer> visited=new ArrayList<Integer>();
		while(!allVisited(arr)) {
			Queue q=new Queue();
			q.enqueue(0);
			while(!q.isEmpty()) {
				int v=q.dequeue();
				if(!visited.contains(v)) {
					visited.add(v);
					if(v==key) {
						double t2=System.nanoTime();
						System.out.println("Time to search BFS(ns): "+(t2-t1));
						return true;
					}
				}
				for(int i=0;i<arr[v].length;i++) {
					if(arr[v][i]==1) {
						q.enqueue(i);
						arr[v][i]=0;arr[i][v]=0;
					}
				}
			}
		}
		double t2=System.nanoTime();
		System.out.println("Time to search BFS(ns): "+(t2-t1));
		return false;
	}
}
class Queue{
	private qnode head;
	private qnode tail;
	public Queue() {
		head=null;tail=null;
	}
	public void enqueue(int val) {
		if(isEmpty()) {
			head=new qnode(val);
			tail=head;
			return;
		}
		tail.setNext(new qnode(val));
		tail=tail.getNext();
	}
	public int dequeue() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		if(head==tail) {
			int k=head.getData();
			clear();
			return k;
		}
		int k=head.getData();
		head=head.getNext();
		return k;
	}
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}
	public void clear() {
		head=null;tail=null;
	}
}
class qnode{
	private int data;
	private qnode next;
	public qnode(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public qnode getNext() {
		return next;
	}
	public void setNext(qnode next) {
		this.next = next;
	}
}