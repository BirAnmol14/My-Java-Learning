package sync_threads;
class Value{
	int val;
	public Value() {
		val=0;
	}
	public void show() {
		System.out.println(val);
	}
	public void set(int i) {
		val=i;
	}
	public synchronized void change(int i) {
			set(i);
			System.out.println(Thread.currentThread().getName()+" Value Set to: "+i);
		    show();
	}
}
class Worker implements Runnable{
	Value v;
	public Worker(Value v) {
		this.v=v;
	}
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
		v.change(i);}
	}
}
public class ToDo {
	public static void main(String[] args) {
		Value v=new Value();
		Thread t1=new Thread(new Worker(v),"Thread 1");
		Thread t2=new Thread(new Worker(v),"Thread 2");
		t1.start();
		t2.start();
		/*
		 * This Synchronization leads to changing of the value of the shared variable by only one thre9 ad at a time
		 * */
	}
}
