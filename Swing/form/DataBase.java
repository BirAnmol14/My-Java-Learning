package form;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
	private static Map<String, char[]> data=new HashMap<String, char[]>();
	public static Map<String,char[]> getData() {
		return data;
	}
}
