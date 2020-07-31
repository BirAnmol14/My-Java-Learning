package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph_mat {
	private Set<Integer> vertice_set;
	private int [] [] mat;
	private int v;
	public Map<Integer,int[][]> getInfo(){
		Map<Integer,int[][]> m=new HashMap<Integer,int[][]>();
		int [][] tmp=new int [v][v];
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				tmp[i][j]=mat[i][j];
			}
		}
		m.put(v, tmp);
		return m;
	}
	public Graph_mat(int num_vertices) {
		this.v=num_vertices;
		mat=new int [v] [v] ;
		vertice_set=new HashSet<Integer>();
		for(int i=0;i<mat.length;i++) {
			vertice_set.add(i);
		}
	}
	public Graph_mat(int[][] grid) {
		this.v=grid.length;
		mat=grid;
		vertice_set=new HashSet<Integer>();
		for(int i=0;i<mat.length;i++) {
			vertice_set.add(i);
		}
	}
	public void add_directed_edge(int v1,int v2) {
		if(mat==null) {
			System.out.println("Error, no graph exists"); return;
		}
		if(v1>=v||v2>=v) {
			System.out.println("Not added, since edge not present in graph");return;
		}
		mat[v1][v2]=1;
	}
	public void add_undirected_edge(int v1,int v2) {
		if(mat==null) {
			System.out.println("Error, no graph exists"); return;
		}
		if(v1>=v||v2>=v) {
			System.out.println("Not added, since edge not present in graph");return;
		}
		mat[v1][v2]=1;mat[v2][v1]=1;
	}
	public void show() {
		if(mat==null) {
			System.out.println("Error, no graph exists"); return;
		}
		System.out.print("    ");
		for(int i=0;i<v;i++) {
			System.out.print(i+"  ");
		}
		System.out.println("");
		System.out.print("    ");
		for(int i=0;i<v;i++) {
			System.out.print("-  ");
		}
		System.out.println("");
		for(int i=0;i<mat.length;i++) {
			System.out.print(i+" | ");
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println("");
		}
	}
	public boolean hasDirectedEdge(int v1,int v2) {
		if(mat==null) {
			return false;
		}
		if((mat[v1][v2]==1 && mat[v2][v1]==0) ) {
			return true;
		}
		return false;
	}
	public boolean hasUndirectedEdge(int v1,int v2) {
		if(mat==null) {
			return false;
		}
		if((mat[v1][v2]==1 && mat[v2][v1]==1)) {
			return true;
		}
		return false;
	}
	public void clear() {
		mat=null;v=0;
	}
	public Set<Integer> getVertices(){
		Set<Integer> tmp=new HashSet<Integer>();
		for(int i:vertice_set) {
			tmp.add(i);
		}
		return tmp;
	}
}
