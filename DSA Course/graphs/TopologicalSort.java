package graphs;

import java.util.HashSet;
import java.util.Set;

//For directed graphs only
public class TopologicalSort {
	public static void sort_mat(Graph_mat g,int start) {
		System.out.println("Topological Sort");
		Set<Integer> vertices=new HashSet<Integer>();
		int [][] grid=g.getInfo().get(g.getInfo().keySet().toArray()[0]);
		for(int i=0;i<grid.length;i++) {
			vertices.add(i);
		}
		Set<Integer> visited_vertices=new HashSet<Integer>();
		Stack s=new Stack(grid.length);
		visit(start,grid,visited_vertices,s);
		for(int i:vertices) {
			if(!visited_vertices.contains(i)) {
				visit(i, grid,visited_vertices,s);
			}
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
		System.out.println("\n----------------------------");
	}
	private static void visit(int i,int [][] grid,Set<Integer> visited,Stack s) {
		for(int j=0;j<grid[i].length;j++) {
			if(grid[i][j]==1&&!visited.contains(j)) {
				visit(j, grid, visited,s);
			}
		}
		visited.add(i);
		s.push(i);
	}
}
