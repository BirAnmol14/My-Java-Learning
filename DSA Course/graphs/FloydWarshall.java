package graphs;

import java.util.Set;

public class FloydWarshall {
	private static int [][]final_results;
	private static boolean was_run=false;
	public static void exe(Weighted_Graph g) {
		was_run=true;
		Set<Integer> vertices=g.getVertices();
		int [][] grid=g.getGrid();
		int [][] weights=g.getWeights();
		//Initializing to infinity
		for(int i=0;i<weights.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j]==0&&i!=j) {
					weights[i][j]=Integer.MAX_VALUE;
				}
				else if(grid[i][j]==0&&i==j) {
					weights[i][j]=0;
				}			
			}
		}
		for (int k:vertices) {
			for(int i=0;i<grid.length;i++) {
				for(int j=0;j<grid[i].length;j++) {
					if(weights[i][k]!=Integer.MAX_VALUE&&weights[k][j]!=Integer.MAX_VALUE&&weights[i][j]>weights[i][k]+weights[k][j]) {
						weights[i][j]=weights[i][k]+weights[k][j];
					}
				}
			}
		}
		show(weights);
		final_results=weights;
	}
	private static void show(int [][] weights) {
		System.out.println("Results of Floyd Warshall Algorithm...");
		for(int i=0;i<weights.length;i++) {
			for(int j=0;j<weights[i].length;j++) {
				System.out.print("Distance between "+i+" & "+j+": ");
				if(weights[i][j]!=Integer.MAX_VALUE) {
					System.out.println(weights[i][j]);
				}
				else {
					System.out.println("infinity");
				}
			}
		}
		System.out.println("-----------------------------------");
	}
	public static int [][] results(){
		if(was_run==false) {
			System.out.println("To get correct results kindly run once.....");return null;
		}
		was_run=false;
		return final_results;
	}
}
