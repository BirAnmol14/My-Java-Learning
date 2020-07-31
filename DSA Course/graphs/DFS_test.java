package graphs;

public class DFS_test {
	public static void main(String[] args) {
		Graph_mat g=new Graph_mat(5);
		g.add_undirected_edge(0, 4);
		g.add_undirected_edge(0, 1);
		g.add_undirected_edge(1, 2);
		g.add_undirected_edge(2, 3);
		g.add_undirected_edge(2, 4);
		g.add_undirected_edge(3, 4);
		g.show();
		DFS.DFS_mat(g, 0);
		DFS.DFS_mat(g, 1);
		
		Graph_list g1=new Graph_list(g);
		g1.show();
		DFS.DFS_list(g1, 0);
		DFS.DFS_list(g1, 1);
		
		
		g.clear();
		g1.clear();
		
		g=new Graph_mat(15);
		g.add_undirected_edge(0, 1);
		g.add_undirected_edge(0, 2);
		g.add_undirected_edge(1, 3);
		g.add_undirected_edge(1,4);
		g.add_undirected_edge(2, 5);
		g.add_undirected_edge(2, 6);
		g.add_undirected_edge(3, 7);
		g.add_undirected_edge(3, 8);
		g.add_undirected_edge(4, 9);
		g.add_undirected_edge(4, 10);
		g.add_undirected_edge(5, 11);
		g.add_undirected_edge(5, 12);
		g.add_undirected_edge(6, 13);
		g.add_undirected_edge(6, 14);
		
		g.show();
		System.out.println("-------------------------");
		System.out.println(BFS.BFS_search(g, 19));
		System.out.println(BFS.BFS_search(g, 13));
		System.out.println(BFS.BFS_search(g, 3));
		System.out.println("-------------------------");
		System.out.println(DFS.DFS_search(g, 19));
		System.out.println(DFS.DFS_search(g, 13));
		System.out.println(DFS.DFS_search(g, 3));
		System.out.println("-------------------------");
		BFS.BFS_mat(g, 0);
		
		DFS.DFS_mat(g, 0);
		//BFS good for searching vertices closer to root
		//DFS good for searching vertices far away from root
		g.clear();
	}
}
