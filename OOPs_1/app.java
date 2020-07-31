class Person{
	String name;
	int age;
	void introduce()
	{
		System.out.println("I am "+ name + " and I am "+ age +" years old.");
	}
	void set_age(int age) {
		this.age=age;
	}
	void set_name(String name) {
		this.name=name;
	}
}
public class app {

	public static void main(String[] args) {
		Person bir=new Person();
		bir.set_age(19);
		bir.set_name("Bir Anmol");
		bir.introduce();
	}
}
