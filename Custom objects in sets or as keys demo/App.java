import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
class Person{
	private int id;
	private String name;
	public Person(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+": "+name;
	}
	public Integer getid() {
		return id;
	}
	public int hashCode() {
		return this.id*this.name.hashCode();
	}
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person p=(Person)o;
			if(this.getid()==p.getid()&&this.name.equals(p.name)) {
				return true;
			}
		}
		return false;
	}
}
public class App {

	public static void main(String[] args) {
		Person p1=new Person(1,"Bir");
		Person p2=new Person(2,"Kabir");
		Person p3=new Person(3,"Gunraj");
		Person p4=new Person(4,"Achal");
		/*
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		map.put("One",1);
		map.put("Two",2);
		map.put("Three",3);
		map.put("Four",4);
		for(String key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("horse");
		System.out.println(set.toString());
		*/
		LinkedHashMap<Person,Integer>map=new LinkedHashMap<Person,Integer>();
		map.put(p1,p1.getid());
		map.put(p2,p2.getid());
		map.put(p3,p3.getid());
		map.put(p4,p4.getid());
		LinkedHashSet<Person>set=new LinkedHashSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		for(Person key : map.keySet()) {
			System.out.println(key+" -> "+map.get(key));
		}
		System.out.println(set);
		
	}

}
