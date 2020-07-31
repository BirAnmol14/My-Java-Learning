package graphs;

import java.util.Set;

public class Kruskal {
	//Only for connected undirected graph
	public static void exe(Weighted_Graph g) {
		Set<int[]> edges=g.getEdges();
		Set<Integer> vertices=g.getVertices();
		int [][] weights=g.getWeights();
		sort(edges, weights);
		DisjointSet t=new DisjointSet(vertices);
		int cost=0;
		System.out.println(t);
		for(int [] edge:edges) {
			
			if(t.find(edge[0])!=t.find(edge[1])) {
				t.union(t.find(edge[0]), t.find(edge[1]));
				cost+=weights[edge[0]][edge[1]];
				System.out.println(t);
			}
		}
		System.out.println("MST Cost: "+cost);
	}
	private static void sort(Set<int []>edges,int [][]weights) {
		//Can be sorted in (Elog(E)) but I am using an easier implementation
		Object [] arr=edges.toArray();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length;j++) {
				int [] edge1=(int [])arr[i];
				int [] edge2=(int [])arr[j];
				if(weights[edge1[0]][edge1[1]]>weights[edge2[0]][edge2[1]]) {
					Object tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		edges.clear();
		for(int i=0;i<arr.length;i++) {
			edges.add((int [])arr[i]);
		}
		return;
	}
}
