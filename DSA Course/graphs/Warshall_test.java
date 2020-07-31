package graphs;

public class Warshall_test {

	public static void main(String[] args) {
		Weighted_Graph g = new Weighted_Graph(4);
		g.addEdge(0, 1, 8);
		g.addEdge(0, 3, 1);
		g.addEdge(1, 2, 1);
		g.addEdge(2, 0, 4);
		g.addEdge(3, 1, 2);
		g.addEdge(3, 2, 9);
		System.out.println(g);
		FloydWarshall.exe(g);
		int [][] results=FloydWarshall.results();
		System.out.println("Distance between 0 and 3 is -> "+results[0][3]);
	}

}
