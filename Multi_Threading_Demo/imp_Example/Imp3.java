package imp_Example;
/*
 * Excellent usage of separate locks by using synchronized code-block
 * so now if one thread is doing change 1 then other can do change 2
 */
import java.util.ArrayList;
import java.util.Random;

public class Imp3 {
	private Object lock1=new Object();
	private Object lock2=new Object();
	Random r=new Random();
	private ArrayList<Integer> list1=new ArrayList<Integer>();
	private ArrayList<Integer> list2=new ArrayList<Integer>();
	public static void main(String[] args) {
		System.out.println("Starting...");
		long time=System.currentTimeMillis();
		new Imp3().process();
		System.out.println(System.currentTimeMillis()-time);
		System.out.println("Bye...");

	}
	public void change1() {
		synchronized(lock1) {
		try {
			Thread.sleep(1);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ " change1");
		list1.add(r.nextInt(100));
		}
	}
	public void change2() {
		synchronized(lock2) {
		try {
			Thread.sleep(1);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ " change2");
		list2.add(r.nextInt(100));
		}
	}
	public void work() {
		for(int i=0;i<1000;i++) {
		change1();change2();
		}
	}
	public void process() {
		Runnable r=new Runnable() {

			@Override
			public void run() {
				work();
				
			}
			
		};
		Thread t1=new Thread(r,"t1");
		Thread t2=new Thread(r,"t2");
		t1.start();
		t2.start();
		try {
			t1.join();t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("list1: "+list1.size()+"\tlist2: "+list2.size());
	}
}
