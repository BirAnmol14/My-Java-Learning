package graphs;

import java.util.ArrayList;
import java.util.Set;

public class Dijkstra {
	public static void run_mat(Weighted_Graph g, int start) {
		Set<Integer> vertices = g.getVertices();
		int[][] grid = g.getGrid();
		int[][] weights = g.getWeights();
		Dij_node[] arr = new Dij_node[vertices.size()];
		MinHeap heap = new MinHeap(vertices.size());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Dij_node(i, Integer.MAX_VALUE);
			if (i == start) {
				arr[i].setCost(0);
			}
			heap.insert(arr[i]);
		}
		arr[start].setParent(null);
		while (!heap.isEmpty()) {
			Dij_node tmp = heap.ExtractMin();
			int v = tmp.getCurr();
			for (int i = 0; i < grid[v].length; i++) {
				if (grid[v][i] == 1) {
					if (tmp.getCost() != Integer.MAX_VALUE && tmp.getCost() + weights[v][i] < arr[i].getCost()) {
						arr[i].setCost(tmp.getCost() + weights[v][i]);
						arr[i].setParent(arr[v]);
					}
				}
			}
			heap.generateMinHeap();
		}
		show(vertices, arr, start);
	}

	private static void show(Set<Integer> vertices, Dij_node[] arr, int start) {
		System.out.println("Results after Dijkstra Algorithm");
		for (int i : vertices) {
			System.out.print(start + " to " + i + " : ");
			ArrayList<Dij_node> list = new ArrayList<Dij_node>();
			Dij_node tmp = arr[i];
			while (tmp != null) {
				list.add(tmp);
				tmp = tmp.getParent();

			}
			for (int j = list.size() - 1; j >= 0; j--) {
				System.out.print(list.get(j).getCurr() + " ");
			}
			if(arr[i].getCost()!=Integer.MAX_VALUE) {
			System.out.println("\nFinal Cost: " + arr[i].getCost()+"\n");
			}
			else {
				System.out.println("\nFinal Cost: infinity\n");
			}
		}
		System.out.println("----------------------------------");
	}
}

class Dij_node {
	private int curr;
	private int cost;
	private Dij_node parent;

	public Dij_node(int curr, int cost) {
		this.curr = curr;
		this.cost = cost;
		parent = null;
	}

	public Dij_node(int curr, int cost, Dij_node p) {
		this.curr = curr;
		this.cost = cost;
		parent = p;
	}

	public int getCurr() {
		return curr;
	}

	public void setCurr(int curr) {
		this.curr = curr;
	}

	public Dij_node getParent() {
		return parent;
	}

	public void setParent(Dij_node parent) {
		this.parent = parent;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}

class MinHeap {
	private Dij_node[] arr;
	private int last;
	private int size;

	public MinHeap(int size) {
		last = 0;
		this.size = size + 1;
		arr = new Dij_node[this.size];
	}

	public boolean isEmpty() {
		if (last == 0) {
			return true;
		}
		return false;
	}

	public void insert(Dij_node val) {
		if (last == size - 1) {
			System.out.println("Overflow");
			return;
		}
		last++;
		arr[last] = val;
		heapify_up(last);
	}

	private void heapify_up(int index) {
		if (index < 1 || index > last || last == 0) {
			return;
		}
		int p = index / 2;
		int l = index;
		if (p >= 1 && arr[l].getCost() < arr[p].getCost()) {
			Dij_node tmp = arr[p];
			arr[p] = arr[l];
			arr[l] = tmp;
			heapify_up(p);
			return;
		}
	}

	public Dij_node ExtractMin() {
		if (last == 0) {
			return null;
		}

		Dij_node tmp = arr[1];
		arr[1] = arr[last];
		last--;
		heapify_down(1);
		return tmp;
	}

	private void heapify_down(int index) {
		if (index < 1 || index > last || last == 0) {
			return;
		}
		int p = index;
		int l = index * 2;
		if (l <= last) {
			if (p * 2 + 1 <= last) {
				int r = 2 * p + 1;
				if (arr[l].getCost() < arr[p].getCost() || arr[r].getCost() < arr[p].getCost()) {
					if (arr[l].getCost() < arr[r].getCost()) {
						Dij_node tmp = arr[p];
						arr[p] = arr[l];
						arr[l] = tmp;
						heapify_down(l);
					} else {
						Dij_node tmp = arr[p];
						arr[p] = arr[r];
						arr[r] = tmp;
						heapify_down(r);
					}
					return;
				}
				return;
			}
			if (arr[l].getCost() < arr[p].getCost()) {
				Dij_node tmp = arr[p];
				arr[p] = arr[l];
				arr[l] = tmp;
				heapify_down(l);
				return;
			}
		}
		return;
	}

	public void generateMinHeap() {
		for (int i = last; i >= 1; i--) {
			heapify_down(i);
		}
	}
}