package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BFS_SSSP {
	public static void SSSP_mat(Graph_mat g,int start) {
		int [][]grid=g.getInfo().get(g.getInfo().keySet().toArray()[0]);
		Queue q=new Queue();
		Set<Integer> vertices=g.getVertices();
		Set<Integer> visited=new HashSet<Integer>();
		znode []zarr=new znode[vertices.size()];
		for(int i=0;i<zarr.length;i++) {
			zarr[i]=new znode(new qnode((int) vertices.toArray()[i]),null);
		}
		q.enqueue(start);
		while(!q.isEmpty()) {
			int curr=q.dequeue();
			for(int i=0;i<grid[curr].length;i++) {
				if(grid[curr][i]==1) {
					if(!visited.contains(i)) {
						q.enqueue(i);
						if(zarr[i].getParent()==null) {
						zarr[i].setParent(zarr[curr]);
						}
						visited.add(curr);
					}
				}
			}
		}
		show(zarr, vertices, start);
	}
	private static void show(znode [] zarr,Set<Integer> vertices,int start) {
		for(int i:vertices) {
			System.out.print(start+" to "+i+" : ");
			ArrayList<znode> list=new ArrayList<znode>();
			znode tmp=zarr[i];
			while(tmp!=null) {
				list.add(tmp);
				tmp=tmp.getParent();
			}
			for(int j=list.size()-1;j>=0;j--) {
				System.out.print(list.get(j).getCurr().getData()+" ");
			}
			System.out.println("");
		}
	}
	public static void SSSP_list(Graph_list g,int start) {
		SSSP_mat(new Graph_mat(g.getGrid()), start);
	}
}

class znode{
	private qnode curr;
	private znode parent;
	public znode(qnode t,znode p) {
		curr=t;parent=p;
	}
	public qnode getCurr() {
		return curr;
	}
	public void setCurr(qnode curr) {
		this.curr = curr;
	}
	public znode getParent() {
		return parent;
	}
	public void setParent(znode parent) {
		this.parent = parent;
	}
	
}