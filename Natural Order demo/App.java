import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class Person implements Comparable<Person>{
	private Integer id;
	private String name;
	public Person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return id+": "+name;
	}
	@Override
	public int compareTo(Person o) {
		return -this.name.compareTo(o.getName());
	}//Defines the way the objects should be compared, here, in reverse alphabetical order of name
}
public class App {

	public static void main(String[] args) {
		List <String>list1=new ArrayList<String>();
		Set <String> set1=new TreeSet<String>();
		List<Person> list_person=new ArrayList<Person>();
		Set <Person> set_person=new TreeSet<Person>();
		//Tree sets are pre-sorted in natural order
		addelems(list1);
		Collections.sort(list1);
		addpelems(list_person);
		Collections.sort(list_person);
		//Sorting list in natural order
		addelems(set1);
		addpelems(set_person);
		showelems(list1);
		System.out.println("---------------------------");
		showelems(set1);
		System.out.println("---------------------------");
		showpelems(list_person);
		System.out.println("---------------------------");
		showpelems(set_person);
		System.out.println("---------------------------");
	}
	public static void addelems(Collection<String> col) {
		col.add("Dog");
		col.add("Cat");
		col.add("Mouse");
		col.add("Horse");
		col.add("Monkey");
		col.add("Chimpanzee");
		col.add("Gorilla");
		col.add("Frog");
		col.add("Snake");
		col.add("Mongoose");
		col.add("Lion");
	}
	/*
	 * Collection is super set of both list and set therefore if you don't know what will be passed to a fuction then use it
	 */
	public static void showelems(Collection<String>col) {
		for(String s : col) {
			System.out.println(s);
		}
	}
	public static void addpelems(Collection<Person> col) {
			col.add(new Person(1,"Dog"));
			col.add(new Person(2,"Cat"));
			col.add(new Person(3,"Mouse"));
			col.add(new Person(4,"Horse"));
			col.add(new Person(5,"Monkey"));
			col.add(new Person(6,"Chimpanzee"));
			col.add(new Person(7,"Gorilla"));
			col.add(new Person(8,"Frog"));
			col.add(new Person(9,"Snake"));
			col.add(new Person(10,"Mongoose"));
			col.add(new Person(11,"Lion"));			
		}
		/*
		 * Collection is super set of both list and set therefore if you don't know what will be passed to a fuction then use it
		 */
		public static void showpelems(Collection<Person>col) {
			for(Person s : col) {
				System.out.println(s);
			}
	}
}
