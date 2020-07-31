package tambola;

import java.util.ArrayList;
import java.util.Random;

public class Player extends Thread{
	public static boolean over=false;
	private static int mode=0;
	private static Object lock=new Object();
	private static int curr_val=0;
	private static ArrayList<Integer> list=new ArrayList<Integer>(100);
	private int [] ticket;
	private int cut;
	Random random=new Random();
	public Player() {
		cut=0;
		ticket=new int[8];
		for(int i=0;i<ticket.length;i++) {
			while(true) {
				boolean isPresent=false;
				int val=random.nextInt(99)+1;
				for(int j:ticket) {
					if(j==val) {
						isPresent=true;
						break;
					}
				}
				if(!isPresent) {
					ticket[i]=val;
					break;
				}
			}
		}
	}
	public void Announce() {
		synchronized(lock) {			
				while(mode%3==0) {
				int val=random.nextInt(99)+1;
				if(!list.contains(val)) {
					System.out.println("Announcing.... "+Thread.currentThread().getName());
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
	private synchronized void execute() {
		boolean found=false;
		System.out.println("Searching... "+Thread.currentThread().getName());
		for(int i:ticket) {
			if(i==curr_val&&cut<8) {
				cut++;
				found=true;
				System.out.println("Found");
				if(cut==8) {
					System.out.println("Winner is: "+Thread.currentThread().getName());
					over=true;
					System.exit(0);
				}
				break;
			}
		}	
			if(!found) {
			System.out.println("Not Found");
			}
			mode++;
	}
	public void Find() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while(!over) {
		synchronized(lock) {
			while(mode%3==1) {
				execute();
				try {
					lock.wait();
					} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			while(mode%3==2) {
			execute();
			lock.notifyAll();
			}
		}
		}
	}
}

