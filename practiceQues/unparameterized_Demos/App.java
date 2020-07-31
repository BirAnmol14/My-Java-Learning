package unparameterized_Demos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("Bir");
		s.add(4);
		s.add(9.9);
		System.out.println(s);
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			if(o instanceof String) {
				String tmp=(String)o;
				System.out.println(tmp);
			}else if(o instanceof Integer) {
				Integer i=(Integer)o;
				if(i==4) {
					it.remove();
				}
			}
		}
		System.out.println(s);
		
	}

}
