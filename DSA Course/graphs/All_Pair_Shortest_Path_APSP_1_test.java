package graphs;

public class All_Pair_Shortest_Path_APSP_1_test {

	public static void main(String[] args) {
		testBFS();
		testDijkstra();
		testBellmanFord();
	}

	private static void testBFS() {
		Graph_mat g = new Graph_mat(10);
		g.add_undirected_edge(0, 8);
		g.add_undirected_edge(8, 9);
		g.add_undirected_edge(2, 8);
		g.add_undirected_edge(2, 1);
		g.add_undirected_edge(1, 9);
		g.add_undirected_edge(2, 4);
		g.add_undirected_edge(4, 3);
		g.add_undirected_edge(3, 1);
		g.add_undirected_edge(1, 7);
		g.add_undirected_edge(7, 6);
		g.add_undirected_edge(6, 5);
		g.add_undirected_edge(5, 3);
		g.show();
		System.out.println("");
		APSP1.BFS_run(g);
		g.clear();
		System.out.println("*******************************");
	}

	private static void testDijkstra() {
		Weighted_Graph g = new Weighted_Graph(5);
		g.addEdge(0, 1, 4);
		g.addEdge(0, 2, 2);
		g.addEdge(1, 3, 3);
		g.addEdge(2, 1, 1);
		g.addEdge(3, 2, 6);
		g.addEdge(3, 4, 6);
		g.addEdge(2, 4, 1);
		g.addEdge(4, 2, 2);
		g.show();
		System.out.println("----------------------------------");
		APSP1.Dijkstra_run(g);
		g.clear();
	}
	private static void testBellmanFord() {
		Weighted_Graph g = new Weighted_Graph(5);
		g.addEdge(0, 1, 4);
		g.addEdge(0, 2, 2);
		g.addEdge(1, 3, 3);
		g.addEdge(2, 1, 1);
		g.addEdge(3, 2, 6);
		g.addEdge(3, 4, 6);
		g.addEdge(2, 4, 1);
		g.addEdge(4, 2, 2);
		g.show();
		System.out.println("----------------------------------");
		APSP1.Bellmanford_run(g);
		g.clear();
		
		g = new Weighted_Graph(5);
		g.addEdge(0, 1, 4);
		g.addEdge(0, 2, 2);
		g.addEdge(1, 3, 3);
		g.addEdge(2, 1, 1);
		g.addEdge(3, 2, -6);
		g.addEdge(3, 4, 6);
		g.addEdge(2, 4, 1);
		g.addEdge(4, 2, 2);
		g.show();
		System.out.println("----------------------------------");
		APSP1.Bellmanford_run(g);
		g.clear();
		
	}
}
