package unparameterized_Demos;

import java.util.ArrayList;
import java.util.ListIterator;

public class Practice {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(1);
		ls.add(3);
		ls.add(5.9f);
		ls.add("Bir");
		for(Object o:ls) {
			System.out.println(o);
		}
		/*
		ListIterator it=ls.listIterator(ls.size()); 
		while(it.hasPrevious()) {
			Object tmp=it.previous();
			if(tmp instanceof String) {
				String s=(String) tmp;
				if(s.equals("Bir")) {
					it.remove();
				}
			}
		}
		*/
		for(int i=0;i<ls.size();i++) {
			Object o=ls.get(i);
			if(o instanceof String) {
				String tmp=(String) o;
				if(tmp.equals("Bir")) {
					ls.remove(i);
				}
			}
		}
		System.out.println(ls);
	}

}
