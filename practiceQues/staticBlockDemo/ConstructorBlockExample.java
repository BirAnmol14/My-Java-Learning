package staticBlockDemo;

public class ConstructorBlockExample {
	{
		System.out.println("First Constructor Block");
	}
	public ConstructorBlockExample() {
		System.out.println("Empty Parameter Constructor");
	}
	public ConstructorBlockExample(String param1) {
		System.out.println("Constructor with 1 parameter");
	}
	{
		System.out.println("Second Constructor Block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorBlockExample ex=new ConstructorBlockExample();
		ConstructorBlockExample ex1=new ConstructorBlockExample("param");
	}

}
