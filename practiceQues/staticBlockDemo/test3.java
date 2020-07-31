package staticBlockDemo;
class stest{
	private static String[] Str;
	static {
		System.out.println("1.%");
	}
	public static void main(String[] args) {
		System.out.println("2.@");
	}
	static {
		System.out.println("3.&");
	}
	static {
		stest.main(Str);
		test3.main(Str);
		System.out.println("4.~");
	}
	static {
		System.out.println("5.$");
	}
}
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stest s1=new stest();
		stest.main(args);
		stest.main(null);
		System.out.println("6.#");
	}

}
