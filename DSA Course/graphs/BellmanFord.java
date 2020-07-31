package graphs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class BellmanFord {
	private static Set<Integer> vertices;
	private static int[][] grid;
	private static int[][] weights;
	private static Dij_node[] arr;
	private static int source;

	public static void run(Weighted_Graph g, int start) {
		source = start;
		vertices = g.getVertices();
		grid = g.getGrid();
		weights = g.getWeights();
		arr = new Dij_node[g.getVertices().size()];

		algo();
	}

	private static void algo() {
		// Set cost
		for (int i : vertices) {
			arr[i] = new Dij_node(i, Integer.MAX_VALUE);
			if (i == source) {
				arr[i].setCost(0);
			}
		}
		Set<int []> edgeSet = generateEdges();
		// Loop from 1 to v-1
		for (int i = 1; i <= vertices.size() - 1; i++) {

			for (int [] s : edgeSet) {
				// edge <u,v>
				int u = s[0];
				int v = s[1];
				if (arr[u].getCost() != Integer.MAX_VALUE && arr[v].getCost() > arr[u].getCost() + weights[u][v]) {
				
					arr[v].setCost(arr[u].getCost() + weights[u][v]);
					arr[v].setParent(arr[u]);
				
				}
			}
		}
		arr[source].setParent(null);
		boolean found = false;
		// -ve cycle
		for (int []s : edgeSet) {
			// edge <u,v>
			int u = s[0];
			int v = s[1];
			if (arr[u].getCost()!=Integer.MAX_VALUE&&arr[v].getCost() > arr[u].getCost() + weights[u][v]) {
				System.out.println("Negative Cycle Found");
				found = true;
				break;
			}
		}
		if (!found) {
			show();
		} else {
			System.out.println("Results after BellmanFord Algorithm");
			for (int v : vertices) {
				System.out.print(source + " to " + v + " : ");
				if(arr[v].getCost()!=Integer.MAX_VALUE) {
				System.out.println(arr[v].getCost());
				}else {
					System.out.println("infintiy");
				}
			}
		}
	}

	private static void show() {
		System.out.println("Results after BellmanFord Algorithm");
		for (int i : vertices) {
			System.out.print(source + " to " + i + " : ");
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
			System.out.println("\nFinal Cost: " + arr[i].getCost() + "\n");
			}else {
				System.out.println("\nFinal Cost: infintiy\n");
			}
		}
		System.out.println("----------------------------------");
	}

	private static Set<int []> generateEdges() {
		Set<int []> edges = new LinkedHashSet<int []>();
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				
				if (grid[i][j] == 1) {
					int[] s1 = new int [2];
					s1[0]=i;
					s1[1]=j;
					edges.add(s1);
				}
			}
		}
		return edges;
	}
}
