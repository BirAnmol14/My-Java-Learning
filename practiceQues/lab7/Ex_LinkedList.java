package lab7;

import java.util.LinkedList;

class Stack{
	private LinkedList<String> list;
	public Stack() {
		list=new LinkedList<String>();
	}
	public void addNew(String s) {
		list.addFirst(s);
	}
	public void remove() {
		list.remove();
	}
	public int size() {
		return list.size();
	}
	public void show(){
		System.out.println("-------------------");
		if(list!=null) {
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("####################");
		}
	}
}
public class Ex_LinkedList {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.addNew("Fun1");
		st.addNew("Fun2");
		st.addNew("Fun3");
		st.show();
		st.remove();
		st.show();
		st.addNew("FUNKS");
		st.show();
		while(st.size()>0) {
			st.remove();
			st.show();
		}
	}

}
