package graphs;

public class KruskalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weighted_Graph g=new Weighted_Graph(5);
		g.addUndirectedEdge(0, 1, 15);
		g.addUndirectedEdge(0, 2, 20);
		g.addUndirectedEdge(2, 1, 13);
		g.addUndirectedEdge(1, 3, 5);
		g.addUndirectedEdge(2, 3, 10);
		g.addUndirectedEdge(2, 4, 6);
		g.addUndirectedEdge(3, 4, 8);
		System.out.println(g);
		Kruskal.exe(g);
	}

}
