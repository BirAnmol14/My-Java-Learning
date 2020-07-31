package graphs;

import java.util.ArrayList;


public class DFS {
	public static void DFS_mat(Graph_mat g, int start) {
		int[][] grid = g.getInfo().get(g.getInfo().keySet().toArray()[0]);
		// Making only for undirected graphs
		System.out.println("DFS");
		ArrayList<Integer> visited = new ArrayList<Integer>();
		while (!allVisited(grid)) {
			Stack s = new Stack(grid.length);
			s.push(start);
			while (!s.isEmpty()) {
				int v = s.pop();
				if (!visited.contains(v)) {
					visited.add(v);
					System.out.print(v + " ");
				}
				for (int i = grid[v].length-1;i>=0; i--) {
					if (grid[v][i] == 1 && !visited.contains(i)) {
						s.push(i);
						grid[v][i] = 0;
						grid[i][v] = 0;
					}
				}
			}
		}
		System.out.println("\n--------------------------------------------------------------");
	}

	public static void DFS_list(Graph_list g, int start) {
		DFS_mat(new Graph_mat(g.getGrid()), start);
	}

	private static boolean allVisited(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					return false;
				}
			}
		}
		return true;
	}
	public static boolean DFS_search(Graph_mat g,int key){
		double t1=System.nanoTime();
		int[][] grid = g.getInfo().get(g.getInfo().keySet().toArray()[0]);
		ArrayList<Integer> visited = new ArrayList<Integer>();
		while (!allVisited(grid)) {
			Stack s = new Stack(grid.length);
			s.push(0);
			while (!s.isEmpty()) {
				int v = s.pop();
				if (!visited.contains(v)) {
					visited.add(v);
					if(v==key) {
						double t2=System.nanoTime();
						System.out.println("Time to search DFS(ns): "+ (t2-t1));
						return true;
					}
				}
				for (int i = grid[v].length-1;i>=0; i--) {
					if (grid[v][i] == 1 && !visited.contains(i)) {
						s.push(i);
						grid[v][i] = 0;
						grid[i][v] = 0;
					}
				}
			}
		}
		double t2=System.nanoTime();
		System.out.println("Time to search DFS(ns): "+(t2-t1));
		return false;
	}
}

class Stack {
	private int top;
	private int[] arr;
	private int size;
	public void printStack() {
		System.out.print("[ ");
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" " );
		}
		System.out.println(" ]");
	}
	public Stack(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
	}

	public void push(int val) {
		if (top == size - 1) {
			int[] temp = new int[2 * size];
			for (int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
			size *= 2;
			arr = temp;
			temp = null;
		}
		top++;
		arr[top] = val;
	}

	public int pop() {
		if (!isEmpty()) {
			top--;
			return arr[top + 1];
		}
		return Integer.MIN_VALUE;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}
}