package graphs;

import java.util.Set;

public class APSP1 {
	public static void BFS_run(Graph_mat g){
		Set <Integer> vertices=g.getVertices();
		for(int v:vertices) {
			BFS_SSSP.SSSP_mat(g, v);
			System.out.println("------------------------------");
		}
	}
	public static void BFS_run(Graph_list g) {
		BFS_run(new Graph_mat(g.getGrid()));
	}
	public static void Dijkstra_run(Weighted_Graph g) {
		for(int v:g.getVertices()) {
			Dijkstra.run_mat(g, v);
			System.out.println("------------------------------");
		}
	}
	public static void Bellmanford_run(Weighted_Graph g) {
		for(int v:g.getVertices()) {
			BellmanFord.run(g, v);
			System.out.println("------------------------------");
		}
	}
}
