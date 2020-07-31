import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Bir");
		list.add("Python");
		list.add("Java");
		System.out.println(list.toString());
		System.out.println("---------------");
		System.out.println(list.get(1)); 
		System.out.println("---------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------");
		for(int i=0;i<list.size();i++) {
			String tmp=(list.get(i));
			if(tmp.equalsIgnoreCase("java")) {
				list.remove(i);
			}
		}
		System.out.println("---------------");
		for(String temp:list) {
			System.out.println(temp);
		}
		System.out.println("---------------");
		list.remove(0);
		System.out.println(list.toString());
	}

}
