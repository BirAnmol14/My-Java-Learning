package staticBlockDemo;

public class StaticExample {
	static {
		System.out.println("This is first static block");
	}
	public StaticExample() {
		System.out.println("Constructor");
	}
	public static String staticString="Static Variable";
	static {
		System.out.println("Second Static Block "+staticString);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample statEx=new StaticExample();
		StaticExample.staticMethod2();
	}
	static {
		staticMethod();
		System.out.println("Third Static Block");
	}
	public static void staticMethod() {
		System.out.println("This is static method");
	}
	public static void staticMethod2() {
		System.out.println("Static Method 2");
	}

}
