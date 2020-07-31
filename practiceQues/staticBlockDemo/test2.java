package staticBlockDemo;

public class test2 {
	static int y;
	int z;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method1());
	}
	public static int method1() {
		//static int x ;
		int x=3;		
		y++;
		//changes to z is invalid
		return x++;
	}
}
