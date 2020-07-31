package tambola2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Player extends Gamer{
	private int [] ticket;
	private int cut;
	Random random=new Random();
	public Player(int i) {
		super(i);
		CreatePlayer();
	}
	private void CreatePlayer() {
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
	private synchronized void execute() {
		boolean found=false;
		System.out.println("Searching... "+Thread.currentThread().getName());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(int i:ticket) {
			if(i==curr_val&&cut<8) {
				cut++;
				found=true;
				System.out.println("Found");
				if(cut==8) {
					System.out.println("Winner is: "+Thread.currentThread().getName());
					Arrays.sort(ticket);
					Collections.sort(list);
					for(int valz:ticket) {
					System.out.print(valz+"\t");
					}
					System.out.println("\n"+list);
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
		while(!ended()) {
		synchronized(lock) {
			while(mode%(Gamer.num+1)!=0&&mode%(Gamer.num+1)!=Gamer.num) {
				execute();
				try {
					lock.wait();
					} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			while(mode%(Gamer.num+1)!=0&&mode%(Gamer.num+1)==Gamer.num) {
			execute();
			lock.notifyAll();
			}
			lock.notifyAll();
		}
		}
	}
	@Override
	public void run() {
		Find();
	}
}

