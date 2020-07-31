import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		//Hash set will not retain order, totally random order
		Set<String> set1=new HashSet<String>();
		set1.add("Bir");
		set1.add("Anmol");
		set1.add("Singh");
		set1.add("Dhawan");
		System.out.println(set1.toString());
		Iterator<String> it = set1.iterator();
		while(it.hasNext()) {
			String tmp=it.next();
			if(tmp.equals("Dhawan")) {
				it.remove();
			}
		}
		it=set1.iterator();
		while(it.hasNext()) {
			String tmp=it.next();
			System.out.println(tmp);
		}
		System.out.println("---------------------------");
		//Remembers order in which you have added items
		Set<String> set2=new LinkedHashSet<String>();
		set2.add("Bir");
		set2.add("Anmol");
		set2.add("Singh");
		set2.add("Dhawan");
		System.out.println(set2.toString());
		System.out.println("---------------------------");
		// Sorts in natural order i.e. in alphabetical order for strings
		Set<String> set3=new TreeSet<String>();
		set3.add("Bir");
		set3.add("Anmol");
		set3.add("Singh");
		set3.add("Dhawan");
		System.out.println(set3.toString());
		System.out.println("---------------------------");
		////////ITERATION///////////
		for(String element:set1) {
			System.out.println(element);
		}System.out.println("--------------");
		for(String element:set2) {
			System.out.println(element);
		}System.out.println("--------------");
		for(String element:set3) {
			System.out.println(element);
		}System.out.println("--------------");
		///////////FINDING ITEMS IN SET///////////////
		if(set1.contains("Bir")) {
			System.out.println("Present");
		}
		if(set2.contains("Anmol")) {
			System.out.println("Present");
		}
		if(set3.contains("LOl")) {
			System.out.println("Present");
		}
		//////////////Checking if set empty
		if(set1.isEmpty()) {
			System.out.println("Empty");
		}else {
			System.out.println("Not empty");
			System.out.println("Num items: "+set1.size());
		}
		System.out.println("-----------------");
		Set<String>set4=new TreeSet<String>();
		set4.add("Bir");
		set4.add("Kabir");
		set4.add("Gunraj");
		set4.add("Achal");
		System.out.println(set4.toString());
		System.out.println("---------------------------");
		////////////Intersection of sets////////////////////
		Set<String> intersection=new HashSet<String>(set3);
		//copies items of set3
		intersection.retainAll(set4);//Does the intersection part
		System.out.println(intersection.toString());
		System.out.println("---------------------------");
		//////////Exclusive/////////////////////////////
		Set<String> unique=new HashSet<String>(set3);
		//copies items of set3
		unique.removeAll(set4);
		//Does the removal of common items and retains unique items of set3 only
		System.out.println(unique.toString());
		System.out.println("---------------------------");
		///////////Union///////////////////////////////
		Set<String> union=new HashSet<String>(set3);
		union.addAll(set4);
		System.out.println(union.toString());
		System.out.println("---------------------------");
	}
}
