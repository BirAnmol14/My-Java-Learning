package graphs;

public class BFS_SSSP_test {

	public static void main(String[] args) {
		Graph_mat g=new Graph_mat(10);
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
		BFS.BFS_mat(g, 2);
		System.out.println("");
		BFS_SSSP.SSSP_mat(g, 2);
	}

}
