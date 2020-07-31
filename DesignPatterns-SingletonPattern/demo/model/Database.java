package demo.model;

public class Database {
	//If you make a constructor private then you cannot do new Database
	//from outside this class
	//Thread safe
	private Database() {
		
	}
	private static Database instance=new Database();
	public static Database getInstance() {
		return instance;
	}
	//OR other way using lazy approach
	//Not thread safe
	//2 threads might twice instantiate 
	public static Database oldInstance;
	public static Database getOldInstance() {
		if(oldInstance==null) {
			oldInstance=new Database();
		}
		return oldInstance;
	}
	public void connect() {
		System.out.println("Connected");
	}
	public void disconnect() {
		System.out.println("Disconnected");
	}
}
