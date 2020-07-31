package imp_Example;
/*
 * Great list built up but slow as only one thread takes the internal lock/monitor lock
 * therefore slow as both change1 and change2 even though independent are held by a common lock
 * thus both tasks must be executed by one thread before the other acquires a lock on this state
 * Better would be to make 2 separate locks so that if change1 is by thread1 then change2 can be done by thread2
 */
import java.util.ArrayList;
import java.util.Random;

public class Imp2 {
	Random r=new Random();
	private ArrayList<Integer> list1=new ArrayList<Integer>();
	private ArrayList<Integer> list2=new ArrayList<Integer>();
	public static void main(String[] args) {
		System.out.println("Starting...");
		long time=System.currentTimeMillis();
		new Imp2().process();
		System.out.println(System.currentTimeMillis()-time);
		System.out.println("Bye...");

	}
	public synchronized void change1() {
		try {
			Thread.sleep(1);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ " change1");
		list1.add(r.nextInt(100));
	}
	public synchronized void change2() {
		try {
			Thread.sleep(1);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ " change2");
		list2.add(r.nextInt(100));
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
