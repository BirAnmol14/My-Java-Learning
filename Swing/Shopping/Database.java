package Shopping;

import java.util.LinkedHashMap;
import java.util.Map;

public class Database {
	private static Map<String , Double>map=null;
	private Database() {
		map=new LinkedHashMap<String,Double>();
	}
	private static Database db=new Database();
	public static Map<String , Double> getMap(){
		if(map!=null) {
		return map;}
		map=new LinkedHashMap<String,Double>();
		return map;
	}
}
