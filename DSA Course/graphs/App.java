package graphs;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph_mat g1=new Graph_mat(3);
		g1.add_directed_edge(0, 1);
		g1.add_undirected_edge(0, 2);
		g1.show();
		System.out.println(g1.hasDirectedEdge(0, 1));
		System.out.println(g1.hasDirectedEdge(1, 0));
		System.out.println(g1.hasUndirectedEdge(0, 2));
		System.out.println(g1.hasUndirectedEdge(2, 0));
		System.out.println(g1.hasUndirectedEdge(1, 2));
		
		System.out.println("");
//		Graph_list g2=new Graph_list(3);
//		g2.add_undirectedEdge(0, 2);
//		g2.add_directedEdge(0, 1);
		Graph_list g2=new Graph_list(g1);
		g2.show();
		System.out.println(g2.hasDirectedEdge(0, 1));
		System.out.println(g2.hasDirectedEdge(1, 0));
		System.out.println(g2.hasUnDirectedEdge(0, 2));
		System.out.println(g2.hasUnDirectedEdge(2, 0));
		System.out.println(g2.hasUnDirectedEdge(1, 2));
		
		g1.clear();
		g2.clear();
		
		Weighted_Graph g=new Weighted_Graph(4);
		g.addEdge(1,2, 10);
		g.addEdge(0, 3,-90);
		g.addEdge(0, 2, 1);
		g.addEdge(3, 1,5);
		g.show();
		g.clear();
	}

}
