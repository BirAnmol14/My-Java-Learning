package Circular_Linked_List;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		Cll list=new Cll();
		list.add(4);
		list.add(54);
		list.add(57);
		list.display();
		System.out.println(list.isPresent(77));
		System.out.println(list.isPresent(4));
		System.out.println("Head Value: "+list.get_head_value()+"\tTail Value: "+list.get_tail_value());
		System.out.println("----------------------------------");
		list.add_at_head(45);
		list.add_at_tail(256);
		list.display();
		System.out.println("Head Value: "+list.get_head_value()+"\tTail Value: "+list.get_tail_value());
		System.out.println("Size: "+list.size());
		System.out.println("----------------------------------");
		list.delete(67);
		list.delete(54);
		list.display();
		list.delete_head();
		list.display();
		list.delete_tail();
		list.display();
		list.add_at_head(12);
		list.add_at_tail(19);
		list.display();
		int k=list.size();
		for(int i=0;i<k+1;i++) {
			if(i%2==0) {
				list.delete_head();
			}else {
				list.delete_tail();
			}
			list.display();
		}
		Random r=new Random();
		for(int j=0;j<r.nextInt(20)+1;j++) {
			list.add(r.nextInt(100)+1);
			list.display();
			System.out.println("Size: "+list.size());
		}
		System.out.println("********");
		list.add_before(789, list.get_head_value());
		list.display();
		list.add_after(999, list.get_head_value());
		list.display();
		list.add_after(5467, list.get_tail_value());
		list.display();
		list.add_before(5678, list.get_tail_value());
		list.display();
		list.delete_all();
		list.display();
		System.out.println("Size: "+list.size());
		
	}

}
