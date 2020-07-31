package tambola2;

import java.util.ArrayList;

public class Gamer extends Thread{
	protected static boolean over=false;
	protected static int mode=0;
	protected static Object lock=new Object();
	protected static int curr_val=0;
	protected static ArrayList<Integer> list=new ArrayList<Integer>(100);
	protected static int num;
	public Gamer(int num) {
		Gamer.num=num;
	}
	public boolean ended() {
		if(list.size()==100||over==true) {
			return true;
		}
		return false;
	}
}
