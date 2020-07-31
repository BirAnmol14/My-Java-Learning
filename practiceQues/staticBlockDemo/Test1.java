package staticBlockDemo;

public class Test1 {
	static int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
	}
	static {
		System.out.println("x: "+x);
	}
}
