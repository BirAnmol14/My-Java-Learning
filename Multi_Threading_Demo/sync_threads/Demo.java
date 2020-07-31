package sync_threads;
public class Demo {
	int count;
	Demo(){
		count=0;
	}
	public static void main(String[] args) {
		Demo d=new Demo(); 
		d.work();
		
	}
	public void work() {
		Runnable r1=new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10000;i++) {
					increment();
				}
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);
		t1.start();t2.start();
		try {//Waits for threads to finish execution
		t1.join();t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(count);//Both threads change the value of count
		//threads cannot increment at the same time due to locking on d's reference
		//Count will be 20000
	}
	public synchronized void increment() {
		//synchronized allows intrinsic state locking that allows only one thread to call this function at a time
		count++;
	}
	
}
