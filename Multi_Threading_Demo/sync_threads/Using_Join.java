package sync_threads;
public class Using_Join {

	public static void main(String[] args) {
		Runnable r=new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<50;i++) {
					System.out.println(Thread.currentThread().getName()+ " : "+i);
				}
				
			}
			
		};
		Thread t=new Thread(r,"My Thread");
		t.start();
		try {
			t.join();
			//Main thread waits till thread-t dies
			//This is good iff you have only one additional thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<50;i++) {
			System.out.println(Thread.currentThread().getName()+ " : "+i);
		}
	}

}
