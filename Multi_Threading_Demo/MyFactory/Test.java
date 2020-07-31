package MyFactory;

import java.util.ArrayList;
import java.util.Random;
class MyException extends Exception{
	public MyException(){
		
	}
	public MyException(String s) {
		super(s);
	}
}
class Factory {
	public static final int MAX=50;
	private ArrayList<Integer> list;
	public Factory() {
		System.out.println("Factory Created");
		list=new ArrayList<Integer>();
	}
	public void produce() throws MyException{
		int turns=0;
		while(true) {
			if(turns==100) {
				throw new MyException("Producer worn out");
			}
			synchronized(this) {
				while(list.size()<MAX) {
					turns++;
					System.out.println("-----------------------");
					System.out.println("List before adding"+list);
					list.add(new Random().nextInt(101));
					System.out.println("List after adding"+list);
					System.out.println("-----------------------");
					this.notify();
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				while(list.size()==MAX) {
					System.out.println("-----------------------");
					System.out.println("Max reached");
					System.out.println("-----------------------");
					try {
						this.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	public void consume(){
		while(true) {
			synchronized(this) {
				while(list.size()>0) {
					Random r=new Random();
					System.out.println("-----------------------");
					System.out.println("List before removing"+list);
					list.remove(r.nextInt(list.size()));
					System.out.println("List after removing"+list);
					System.out.println("-----------------------");
					this.notify();
					try {
						Thread.sleep(20);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				while(list.size()==0) {
					System.out.println("-----------------------");
					System.out.println("List Empty");
					System.out.println("-----------------------");
					try {
						this.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

public class Test {

	public static void main(String[] args) {
		Factory f=new Factory();
		Runnable producer = new Runnable() {
			@Override
			public void run(){
				try {
					f.produce();
				} catch (MyException e) {
					System.out.println(e.getMessage());
					System.exit(0);
				}
			}

		};
		Runnable consumer = new Runnable() {

			@Override
			public void run() {
				f.consume();
			}
		};
		Thread t1=new Thread(producer,"Producer");
		Thread t2=new Thread(consumer,"Consumer");
		t1.start();t2.start();
		try {
			t1.join();t2.join();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
