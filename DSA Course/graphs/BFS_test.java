package graphs;

public class BFS_test {

	public static void main(String[] args) {
		Graph_mat g=new Graph_mat(7);
		g.add_undirected_edge(0, 1);
		g.add_undirected_edge(0, 6);
		g.add_undirected_edge(1, 2);
		g.add_undirected_edge(1, 5);
		g.add_undirected_edge(2, 3);
		g.add_undirected_edge(3, 4);
		g.add_undirected_edge(4, 5);
		g.show();
		BFS.BFS_mat(g, 0);
		BFS.BFS_mat(g, 1);
		
		Graph_list g1=new Graph_list(g);
		g1.show();
		BFS.BFS_list(g1, 0);
		BFS.BFS_list(g1, 1);
		
		
		g.clear();
		g1.clear();
	}

}
