package async_threads;
class A extends Thread{
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+(i+1));
		}
	}
}
class B implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+(i+1));
		}		
	}
	
}
public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to "+Thread.currentThread().getName());
		Thread t1=new A();
		Runnable r=new B();
		Thread t2=new Thread(r);
		t1.setName("A thread");
		t2.setName("B thread");
		t1.start();
		t2.start();
		for(int i=0;i<50;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+(i+1));
			try {
			Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println("Exception");
			}
		}
	}

}
