package Q1;

public class App {

	public static void main(String[] args) {
		Greeter p1=new Greeter("Bir");
		Greeter p2=p1;
		System.out.println(p1.sayHello());
		p2.setName("Anmol");
		System.out.println(p1.goodBye());
		Greeter p3=new Greeter("Singh");
		System.out.println(p3.sayHello());
		p1.swapName(p3);
		System.out.println(p1.goodBye());
		System.out.println(p3.goodBye());
	}

}
