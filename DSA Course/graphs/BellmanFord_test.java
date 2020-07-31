package graphs;

public class BellmanFord_test {

	public static void main(String[] args) {
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
		BellmanFord.run(g, 0);
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
		BellmanFord.run(g, 0);
		g.clear();

	}

}
