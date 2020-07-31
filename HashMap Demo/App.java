import java.util.HashMap;
import java.util.Map;
/*
 * Mapping between keys and values
 */
public class App {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Bir");
		map.put(2,"Anmol");
		map.put(3,"Singh");
		System.out.println(map.get(1));//gets item with respect to key and not index
		System.out.println(map.get(5));//5 not a valid key thus returns null
		System.out.println("-----------------");
		for (int i:map.keySet()) {
			System.out.println(map.get(i));
		}
		//Key set returns set of all keys
		//Or
		System.out.println("-----------------");
		for(String s:map.values()) {
			System.out.println(s);
		}
		//For getting values of map
		//Hash Map is in no way sorted
	}
}
