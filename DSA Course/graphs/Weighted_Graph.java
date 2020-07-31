package graphs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Weighted_Graph {
	private boolean directed=true;
	private int [][] grid;
	private int [][] weights;
	private Set<Integer> vertices;
	public Weighted_Graph(int num_v) {
		grid=new int[num_v][num_v];
		weights=new int[num_v][num_v];
		vertices=new HashSet<Integer>();
		for(int i=0;i<num_v;i++) {
			vertices.add(i);
		}
	}
	public void addEdge(int v1,int v2,int weight) {
		//directed
		if(!vertices.contains(v1)||!vertices.contains(v2)) {
			System.out.println("Error!");return;
		}
		grid[v1][v2]=1;
		weights[v1][v2]=weight;
	}
	public void addUndirectedEdge(int v1,int v2,int weight) {
		addEdge(v1, v2, weight);
		addEdge(v2, v1, weight);
		directed=false;
	}
	public void show() {
		if(directed) {
		System.out.println("Directed Graph:");
		}else {
			System.out.println("Undirected Graph:");
		}
		System.out.print("    ");
		for(int k:vertices) {
			System.out.print(k+" ");
		}
		System.out.print("\n    ");
		for(int k:vertices) {
			System.out.print("- ");
		}
		System.out.println("");
		for(int i:vertices) {
			System.out.print(i+" | ");
			for(int j:vertices) {
				
					System.out.print(grid[i][j]+" ");
				
			}
			System.out.println("");
		}
		System.out.println("\nWeigths:");
		System.out.print("    ");
		for(int k:vertices) {
			System.out.print(k+" ");
		}
		System.out.print("\n    ");
		for(int k:vertices) {
			System.out.print("- ");
		}
		System.out.println("");
		for(int i:vertices) {
			System.out.print(i+" | ");
			for(int j:vertices) {
					if(grid[i][j]==1) {
					System.out.print(weights[i][j]+" ");
					}else {
						System.out.print("* ");
					}
				
			}
			System.out.println("");
		}
	}
	public void clear() {
		grid=null;
		vertices=null;
		weights=null;
	}
	public int[][] getGrid() {
		int [][]tmp=new int [vertices.size()][vertices.size()];
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				tmp[i][j]=grid[i][j];
			}
		}
		return tmp;
	}

	public int[][] getWeights() {
		int [][]tmp=new int [vertices.size()][vertices.size()];
		for(int i=0;i<weights.length;i++) {
			for(int j=0;j<weights[i].length;j++) {
				tmp[i][j]=weights[i][j];
			}
		}
		return tmp;
	}
	public Set<Integer> getVertices() {
		Set<Integer> vertices2=new LinkedHashSet<Integer>();
		for(int i:vertices) {
			vertices2.add(i);
		}
		return vertices2;
	}
	public Set<int []> getEdges() {
		Set<int []> edges = new LinkedHashSet<int []>();
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				
				if (grid[i][j] == 1) {
					int[] s1 = new int [2];
					s1[0]=i;
					s1[1]=j;
					edges.add(s1);
				}
			}
		}
		return edges;
	}
	public String toString() {
		show();
		System.out.println("\nVertices: "+vertices);
		String s="\nEdges: [ ";
		for(int [] arr:getEdges()) {
			s+="<"+arr[0]+","+arr[1]+"("+weights[arr[0]][arr[1]]+")> ";
		}
		s+="]\n-----------------------------------------------------------------------------------------------\n";
		return s;
	}
}
