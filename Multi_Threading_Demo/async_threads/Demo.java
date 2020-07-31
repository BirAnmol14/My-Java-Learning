package async_threads;
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
					count++;
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
		//count=count + 1 what can happen that one thread assigns new value and other adds 1 to some other value 
		//Count final may not be 20000
	}
	
}
