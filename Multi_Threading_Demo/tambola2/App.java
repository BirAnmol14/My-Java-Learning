package tambola2;

import java.util.Scanner;

public class App {
	static int num;
	static Thread announcer;
	static Thread [] players;
	public static void BuildGame() {
		players=new Player[num];
		announcer=new Announcer(num);
		for(int i=0;i<players.length;i++) {
			players[i]=new Player(num);
		}
	}
	public static void main(String[] args) {
		Welcome();
		BuildGame();
		StartGame();
		try {
			announcer.join();
			for(int i=0;i<players.length;i++) {
				players[i].join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void StartGame() {
		announcer.setName("announcer");
		for(int i=0;i<players.length;i++) {
			players[i].setName("Player "+(i+1));
		}
		announcer.start();
		for(int i=0;i<players.length;i++) {
			players[i].start();
		}
	}
	public static void Welcome() {
		System.out.println("WELCOME TO TAMBOLA");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("Loading....");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Number of Players:-");
		try {
			num=in.nextInt();
			if(num==0) {
				System.out.println("Cannot Play..");
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("error!");
			System.out.println("Wrong input");
			System.exit(0);
		}finally {
			in.close();
		}
	}
}
