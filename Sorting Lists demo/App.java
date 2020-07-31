import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Person{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id+": "+name;
	}
	
}
class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length()>s2.length()) {
			return 1;
		}else if(s1.length()<s2.length()) {
			return -1;
		}
		return 0;
	}
}
//Sorting strings on basis of length
class RevAlphaComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
	
}
//Sorting in reverse alphabetical order 
class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getId()>o2.getId()) {
			return -1;
		}else if(o1.getId()<o2.getId()) {
			return 1;
		}
		return 0;
	}
	
}
public class App {

	public static void main(String[] args) {
		ArrayList<String> animals=new ArrayList<String>();
		animals.add("Dog");
		animals.add("Mouse");
		animals.add("Rabbit");
		animals.add("Cat");
		for(String s:animals) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		Collections.sort(animals);
		for(String s:animals) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(2);
		for(Integer i:numbers) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		Collections.sort(numbers);
		for(Integer i:numbers) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		//Collections.sort to sort list in natural order
		//Sorting in custom order on basis of string length
		Collections.sort(animals, new StringLengthComparator());
		for(String s:animals) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		//Sorting in custom order on basis of string length
		Collections.sort(animals, new RevAlphaComparator());
		for(String s:animals) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		//Sorting based on anonymous class
		Collections.sort(animals, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()>o2.length()) {
					return -1;
				}else if(o1.length()<o2.length()) {
					return 1;
				}
				return 0;
			}
			
		});
		//creating an anonymous class that sorts in descending order of string length
		for(String s:animals) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1.compareTo(o2)>0) {
					return -1;
				}else if(o1.compareTo(o2)<0) {
					return 1;
				}
				return 0;
			}
			
		});
		System.out.println(numbers.toString());
		System.out.println("-------------------");
		//Sorting numbers in descending order
		////////////////////////Sorting Custom Classes/////////////////////////////////////
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(new Person(1,"Bir"));
		list.add(new Person(2,"Anmol"));
		list.add(new Person(3,"Singh"));
		list.add(new Person(4,"Dhawan"));
		for(Person p:list) {
			System.out.println(p);
		}
		System.out.println("-------------------");
		//Sorting the list based on names
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});//sorting in alphabetical order of name 
		for(Person p:list) {
			System.out.println(p);
		}
		System.out.println("-------------------");
		//Sorting list based on ids in descending order
		Collections.sort(list,new PersonComparator());
		for(Person p:list) {
			System.out.println(p);
		}
		System.out.println("--------------------");
	}

}
