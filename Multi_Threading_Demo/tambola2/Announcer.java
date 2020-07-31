package tambola2;

import java.util.Random;

public class Announcer extends Gamer{
	public Announcer(int num) {
		super(num);
	}
	Random random=new Random();
	@Override
	public void run() {
		Announce();
	}
	public void Announce() {
		while(!ended()) {
		synchronized(lock) {			
				while(mode%(Gamer.num+1)==0) {
				int val=random.nextInt(99)+1;
				if(!list.contains(val)) {
					System.out.println("Announcing.... "+Thread.currentThread().getName());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					list.add(val);
					System.out.println("Number is: "+val);
					curr_val=val;
					mode++;
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				}
					lock.notifyAll();
				}
			}
	}
}
