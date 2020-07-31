package Doubly_LinkedList;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		Dll list=new Dll();
		list.add(678);
		list.add(5);
		list.add_head(56);
		list.display_f();
		list.display_b();
		list.add_before(123,list.get_head_value());
		list.add_after(543,list.get_head_value());
		list.add_after(666,list.get_tail_value());
		list.add_before(12345, list.get_tail_value());
		list.display_f();
		list.display_b();
		System.out.println("Size: "+list.size());
		System.out.println(list.isPresent(77));
		System.out.println(list.isPresent(678));
		System.out.println("Head Value: "+list.get_head_value()+"\tTail Value: "+list.get_tail_value());
		System.out.println("----------------------------------");
		list.add_head(45);
		list.add(256);
		list.display();
		System.out.println("Head Value: "+list.get_head_value()+"\tTail Value: "+list.get_tail_value());
		System.out.println("Size: "+list.size());
		System.out.println("----------------------------------");
		list.delete(67);
		list.delete(54);
		list.display_f();
		list.display_b();
		list.delete_head();
		list.display();
		list.delete_tail();
		list.display();
		list.add_head(12);
		list.add(19);
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
		list.delete(999);
		list.delete(5678);
		list.display();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
		list.delete_all();
		list.display();
		System.out.println("Size: "+list.size());
	}

}
