package graphs;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Vector;

public class DisjointSet {
	private Vector <Set<Integer>> sets;
	public DisjointSet(Set<Integer> vertices) {
		makeSet(vertices);
	}
	public void makeSet(Set<Integer> vertices){
		Vector <Set <Integer>> v=new Vector<Set<Integer>>(vertices.size());
		for(int i:vertices) {
			Set<Integer> s=new LinkedHashSet<Integer>();
			s.add(i);
			v.add(s);
		}
		sets=v;
	}
	public void union(Set<Integer> x,Set<Integer> y) {
		if(x.size()>=y.size()) {
			sets.get(sets.indexOf(x)).addAll(y);
			sets.remove(y);
		}
		else {
			sets.get(sets.indexOf(y)).addAll(x);
			sets.remove(x);
		}
	}
	public Set<Integer> find(int x) {
		for(Set<Integer> s:sets) {
			if(s.contains(x)) {
				return s;
			}
		}
		System.out.println("Not found");
		return null;
	}
	public String toString() {
		return sets.toString();
	}
}
