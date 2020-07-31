package graphs;

public class PrimsTest {

	public static void main(String[] args) {
		Weighted_Graph g=new Weighted_Graph(5);
		g.addUndirectedEdge(0, 1, 10);
		g.addUndirectedEdge(0, 3, 20);
		g.addUndirectedEdge(1, 2, 30);
		g.addUndirectedEdge(1, 3, 5);
		g.addUndirectedEdge(2, 3, 15);
		g.addUndirectedEdge(2, 4, 6);
		g.addUndirectedEdge(3, 4 , 8);
		System.out.println(g);
		Prims.exe(g, 0);
	}

}
