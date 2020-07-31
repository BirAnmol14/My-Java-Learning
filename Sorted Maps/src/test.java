import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1, 2);
		map.put(2, 4);
		map.put(3, 6);
		System.out.println(map);
		for(Integer i:map.keySet()) {
			System.out.println("Key: "+i+" ,Value: "+map.get(i));
			if(i==3) {
				map.remove(i);
				//map.replace(i, i);
			}
		}
		System.out.println("Values in Map: "+map.values()+" ,Keys are: "+map.keySet());
		System.out.println(map+"\n"+map.size());
		Map <Integer,Integer> m1=new HashMap<Integer,Integer>(map);
		System.out.println("-------------------\n"+m1);
		System.out.println(m1.equals(map));
		System.out.println("------------------------------------");
		Set<Map.Entry<Integer, Integer>> entries=m1.entrySet();
		for(Map.Entry<Integer, Integer> me:entries) {
			System.out.println(me);
		}
		System.out.println("------------------------------------");
		for(Map.Entry<Integer, Integer>me:map.entrySet()) {
			if(me.getKey()==1) {
				me.setValue(1);
			}
			else if (me.getKey()==2) {
				me.setValue(2);
			}
			System.out.println("Key: "+me.getKey()+" ,Value: "+me.getValue());
		}
		System.out.println(map+" "+m1);
		}
}
