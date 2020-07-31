import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/*
		 * ArrayList maintains an internal list
		 * [0][1][2].....
		 * so adding at end is faster
		 * to add after middle you have to shift each item by one yet faster here
		 */
		ArrayList<Integer> arraylist=new ArrayList();
		LinkedList<Integer> linkedlist=new LinkedList();
		/*
		 * LinkedList has a reference to previous and next element
		 * [0]->[1]->[2]
		 * 	  <-   <-
		 * so traversing can be slower
		 * but it can be faster to add elememts near to start of list 
		 */
		doTimings("ArrayList",arraylist);
		doTimings("LinkedList",linkedlist);
	}
	private static void doTimings(String type,List<Integer> list) {
		//List is general form of any specific List
		//Populating list
		for(int i=0;i<1E5;i++) {
			list.add(i);
		}
		long start=System.currentTimeMillis();
		/*
		//Adding items at end of list
		for(int i=0;i<1E5;i++) {
			list.add(i);
		}
		//ArrayList faster
		*/
		/*
		//Adding items to start
		for(int i=0;i<1E5;i++) {
			list.add(0,i);
		}
		//LinkedList faster
		*/
		//Adding items elsewhere
		/*
		 for(int i=0;i<1E5;i++) {
			list.add(i,i);
		}
		//ArrayList faster as it maintains internally an array
		 */
		long end=System.currentTimeMillis();
		System.out.println("Time taken: "+(end-start)+" ms for type: "+type);
	}

}
