package priority;
class Counter implements Runnable{
	private String name;
	public Counter(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=1;i<=500;i++) {
			System.out.println(name +" : "+i+" -- @ priority: "+Thread.currentThread().getPriority());
		}
	}
	
}
public class App {

	public static void main(String[] args) {
		System.out.println("Default :"+Thread.currentThread().getName()+" @ "+Thread.currentThread().getPriority());
		Thread.currentThread().setName("Main");
		Thread.currentThread().setPriority(8);
		System.out.println("After :"+Thread.currentThread().getName()+" @ "+Thread.currentThread().getPriority());
		Thread t1=new Thread(new Counter("C1"));t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2=new Thread(new Counter("C2"));t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();t2.start();
		for(int i=1;i<=50;i++) {
			System.out.println(Thread.currentThread().getName() +" : "+i+" -- @ priority: "+Thread.currentThread().getPriority());
		}
		//Priority does not mean absolute CPU time to one with MAX_Priority it is just based on the will of CPU. Priority is just a request
		//from user which may/may not be accommodated by the CPU.
	}

}
