package graphs;

public class Test_topo_sort {

	public static void main(String[] args) {

		int [][]grid2=new int [8][8];
		grid2[0][2]=1;grid2[1][2]=1;grid2[1][3]=1;grid2[2][4]=1;grid2[3][6]=1;grid2[4][6]=1;grid2[4][5]=1;grid2[6][7]=1;
		Graph_mat g=new Graph_mat(grid2);
		g.show();
		TopologicalSort.sort_mat(g, 1);
		g.clear();
	}
}
