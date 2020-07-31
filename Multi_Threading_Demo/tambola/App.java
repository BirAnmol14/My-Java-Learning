package tambola;

public class App {
	static Thread announcer;
	static Thread p1;
	static Thread p2;
	public static void BuildGame() {
		announcer=new Player() {
			public void run() {
				Announce();
			}
		};
		p1=new Player() {
			public void run() {
				Find();
			}
		};
		p2=new Player() {
			public void run() {
				Find();
			}
		};
	}
	public static void main(String[] args) {
		Welcome();
		BuildGame();
		StartGame();
		try {
			announcer.join();p1.join();p2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void StartGame() {
		announcer.setName("announcer");
		p1.setName("Player 1");
		p2.setName("Player 2");
		announcer.start();
		p1.start();
		p2.start();
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
	}
}
