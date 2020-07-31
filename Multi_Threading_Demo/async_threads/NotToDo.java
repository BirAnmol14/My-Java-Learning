package async_threads;
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
}
class Worker implements Runnable{
	Value v;
	public Worker(Value v) {
		this.v=v;
	}
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			v.set(i*5);
			System.out.println(Thread.currentThread().getName()+" Value Set to: ");
			v.show();
		}
	}
}
public class NotToDo {

	public static void main(String[] args) {
		Value v=new Value();
		Thread t1=new Thread(new Worker(v),"Thread 1");
		Thread t2=new Thread(new Worker(v),"Thread 2");
		t1.start();
		t2.start();
		/*
		 * This Asynchronisation leads to changing of the value of the shared variable by both threads simultaneously
		 * */
	}

}
