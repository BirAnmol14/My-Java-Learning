package Q1;

public class Greeter {
	private String name;
	public Greeter(String name) {
		this.name=name;
	}
	public String sayHello() {
		return "Hello "+name+" !";
	}
	public String goodBye() {
		return "Bye "+name+" !";
	}
	public void setName(String name) {
		this.name=name;
	}
	public void swapName(Greeter o) {
		String temp=this.name;
		this.name=o.name;
		o.name=temp;
	}
	
}
