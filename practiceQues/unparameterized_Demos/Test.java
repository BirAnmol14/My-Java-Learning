package unparameterized_Demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String [] args) {
		Map m=new HashMap();
		m.put(1, "Bir");
		m.put("Singh", 5);
		m.put("Anmol", "Dhawan");
		System.out.println(m);
		Set s=m.keySet();
		Iterator it=s.iterator();
		boolean flag=false;String key=null;
		while(it.hasNext()) {
			Object o=it.next();
			if(o instanceof String) {
				String tmp=(String)o;
				if(tmp.equalsIgnoreCase("singh")) {
					key=tmp;
					flag=true;
				}
			}
		}
		m.remove(key);
		System.out.println("Map after changes: "+m);
	}
}
