package staticBlockDemo;

public class MyStatic {
	int a;
	static int b;
	MyStatic(){
		b++;
	}
	public void showData() {
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStatic s1=new MyStatic();
		s1.showData();
		MyStatic s2=new MyStatic();
		s2.showData();
		MyStatic.b++;
		s1.showData();
		s2.showData();
	}

}
