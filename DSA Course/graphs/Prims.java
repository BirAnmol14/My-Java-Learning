package graphs;

import java.util.Set;
import java.util.Vector;

public class Prims {
	// For weighted Undirected graph
	public static void exe(Weighted_Graph g, int start) {
		Set<Integer> vertices = g.getVertices();
		int[][] grid = g.getGrid();
		int[][] edgeWeights = g.getWeights();
		PriorityQueue q = new PriorityQueue(vertices.size());
		pqNode[] arr = new pqNode[vertices.size()];
		for (int i : vertices) {
			if (i != start) {
				arr[i] = new pqNode(i);
			} else {
				arr[i] = new pqNode(i, 0);
			}
			q.insert(arr[i]);
		}
		Vector<Integer> visited = new Vector<Integer>();
		while (!q.isEmpty()) {
			pqNode curr = q.getMin();
			for (int v : vertices) {
				if (grid[curr.getVertice()][v] == 1 && !visited.contains(v)) {
					if (arr[v].getWeight() > edgeWeights[curr.getVertice()][v]) {
						arr[v].setWeight(edgeWeights[curr.getVertice()][v]);
						arr[v].setParent(curr);
					}
				}
			}
			visited.add(curr.getVertice());
			q.buildHeap();
		}
		System.out.println("MST: ");
		for (int i=0; i<visited.size(); i++) {
			if (i!=visited.size()-1) {
				System.out.print(i+"("+arr[i].getWeight()+")"+"->");
			}else {
				System.out.println(i+"("+arr[i].getWeight()+")");
			}
		}
		System.out.println("");
		int total_cost = 0;
		for (pqNode p : arr) {
			total_cost += p.getWeight();
			System.out.println(p.getVertice() + " " + p.getWeight());
		}
		System.out.println("Total Cost: " + total_cost);
	}
}

class PriorityQueue {
	// Basically Min Heap
	private pqNode[] arr;
	private int last;
	private int size;

	public PriorityQueue(int size) {
		this.size = size + 1;
		last = 0;
		arr = new pqNode[this.size];
	}

	public boolean isEmpty() {
		if (last == 0) {
			return true;
		}
		return false;
	}

	public void insert(pqNode n) {
		if (last == size - 1) {
			pqNode[] tmp = new pqNode[2 * size];
			for (int i = 0; i < size; i++) {
				tmp[i] = arr[i];
			}
			arr = tmp;
			size = 2 * size;
		}
		last++;
		arr[last] = n;
		heapify_up(last / 2);
	}

	private void heapify_up(int index) {
		if (index < 1 || index > last) {
			return;
		}
		int l = index * 2;
		int r = index * 2 + 1;
		if (r <= last) {
			if (arr[l].getWeight() < arr[index].getWeight() || arr[r].getWeight() < arr[index].getWeight()) {
				if (arr[l].getWeight() < arr[r].getWeight()) {
					pqNode tmp = arr[index];
					arr[index] = arr[l];
					arr[l] = tmp;

				} else {
					pqNode tmp = arr[index];
					arr[index] = arr[r];
					arr[r] = tmp;

				}
				heapify_up(index / 2);
				return;
			}
			return;
		} else {
			if (arr[l].getWeight() < arr[index].getWeight()) {
				pqNode tmp = arr[index];
				arr[index] = arr[l];
				arr[l] = tmp;
				heapify_up(index / 2);
				return;
			}
		}
	}

	private void heapify(int index) {
		if (index < 1 || index > last) {
			return;
		}
		int curr = index;
		int l = 2 * curr;
		int r = 2 * curr + 1;
		if (r <= last) {
			if (arr[l].getWeight() < arr[index].getWeight() || arr[r].getWeight() < arr[index].getWeight()) {
				if (arr[l].getWeight() < arr[r].getWeight()) {
					pqNode tmp = arr[index];
					arr[index] = arr[l];
					arr[l] = tmp;
					heapify(l);

				} else {
					pqNode tmp = arr[index];
					arr[index] = arr[r];
					arr[r] = tmp;
					heapify(r);
				}

				return;
			}
			return;
		} else if (l <= last) {
			if (arr[l].getWeight() < arr[index].getWeight()) {
				pqNode tmp = arr[index];
				arr[index] = arr[l];
				arr[l] = tmp;
				heapify(l);
				return;
			}
		}
	}

	public void buildHeap() {
		for (int i = last; i >= 1; i--) {
			heapify(i);
		}
	}

	public pqNode getMin() {
		if (last == 0) {
			return null;
		}
		pqNode tmp = arr[1];
		arr[1] = arr[last];
		last--;
		heapify(1);
		return tmp;
	}
}

class pqNode {
	private int vertice;
	private int weight;
	private pqNode parent;

	public pqNode(int vertice) {
		this.vertice = vertice;
		weight = Integer.MAX_VALUE;
		parent = null;
	}

	public pqNode(int vertice, int weight) {
		this.vertice = vertice;
		this.weight = weight;
		parent = null;
	}

	public int getVertice() {
		return vertice;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public pqNode getParent() {
		return parent;
	}

	public void setParent(pqNode parent) {
		this.parent = parent;
	}
}