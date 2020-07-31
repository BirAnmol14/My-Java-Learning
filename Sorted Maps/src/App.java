import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
class Temp{
	
}
public class App {

	public static void main(String[] args) {
		//HashMap has no particular order of storing keys and values
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		//To keep Values sorted or in particular order
		LinkedHashMap<Integer,String> linkedhashmap=new LinkedHashMap<Integer,String>();
		//It has doubly linked list maps and the hash code associated with each entity
		TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
		//Using hierarchy order to store data by default for strings is the alphabetical order
		testMap(hashmap);
		//In HashMap keys sometimes end up in numerical order but order is not guaranteed
		System.out.println("-------------");
		testMap(linkedhashmap);
		//Keeps order as the way key-value pairs are inserted into the map
		System.out.println("-------------");
		testMap(treemap);
		//Keeps the natural order i.e. numerical order of keys
	}
	public static void testMap(Map<Integer,String> map) {
		map.put(1, "One");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(2, "Two");
		map.put(3, "Three");
		for(Integer i:map.keySet()) {
			System.out.println("Key: "+i+" Value: "+map.get(i));
		}
	}

}
