package using_Notify_and_wait;

import java.util.ArrayList;
import java.util.Random;

class Factory{
	public static final int MAX=10;
	ArrayList<Integer> list=new ArrayList<Integer>();
	public void make() {
		synchronized(this) {
		while(true) {
			while(list.size()==MAX) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			list.add(new Random().nextInt(100));
			System.out.println("Produced");
			this.notify();
		}
		}
	}
	public void consume() {
		while(true) {
		synchronized(this) {
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		while(list.size()!=MAX) {
			try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
			int index=new Random().nextInt(10);
			list.remove(index);
			System.out.println("Consumed");
			this.notify();
		}
		}
	}
}
public class Test {

	public static void main(String[] args) {
		Factory f1=new Factory();
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				f1.make();
			}
			
		});
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				f1.consume();
			}
			
		});
		t1.start();t2.start();
		try {
			t1.join();t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
