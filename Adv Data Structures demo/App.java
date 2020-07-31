import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {
	public static String[] vehicles= {
			"Ambulance","Police","Fire Engine"
	};
	public static String[][] drivers= {
			{"Pete","Sam","George"},
			{"Dhoni","Jadeja","Kohli","Rohit","Raina","Sachin"},
			{"Bir","Achal","Gunraj","Kabir"}
	};
	public static void main(String[] args) {
		Map<String,Set<String>>personnel=new LinkedHashMap<String,Set<String>>();
		for(int i=0;i<vehicles.length;i++) {
			String vehicle=vehicles[i];
			String[] driverlist=drivers[i];
			Set <String> driverList=new LinkedHashSet<String>();
			for(String driver:driverlist) {
				driverList.add(driver);
			}
			personnel.put(vehicle, driverList);
		}
		System.out.println(personnel);
		System.out.println("--------------");
		for(String key:personnel.keySet()) {
			System.out.println(key+":");
			for(String driver: personnel.get(key)) {
				System.out.printf("%s\t",driver);
			}
			System.out.println("");
		}
	}

}
