package unparameterized_Demos;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(0);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}

}
