import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String>animals=new LinkedList<String>();
		animals.add("fox");
		animals.add("Cow");
		animals.add("Wolf");
		animals.add("Elephant");
		//Old Way
		Iterator<String> it=animals.iterator();
		//Works beacause Linked lists have an iterable interface
		while(it.hasNext()) {
			String value=it.next();
			if(value.equals("Cow")) {
				it.remove();//Removes cow from list
			}
			System.out.println(value);
			//it prints the curr item and moves it to next item and you can remove items only in this kind of loop
		}
		System.out.println("-------------------");
		//Modern Way
		for(String animal:animals) {
			System.out.println(animal);
		}

	}

}
