class person{
	private int age;
	private String name;
	static int salary;
	public person()
	{
		age=0;
		name=null;
		//salary=0;
	}
	public person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void introduce()
	{
		System.out.println( name + " "+ age +" "+salary);
	}
	public void salary_increase(int n)
	{
		salary+=n;
	}
}
public class app {

	public static void main(String[] args) {
		person a=new person();
		a.introduce();
		person b=new person("bir",19);
		b.introduce();
		b.salary_increase(100);
		b.introduce();
		person c=new person("Anmol",20);
		c.introduce();
		c.salary_increase(30);
		c.introduce();
		b.introduce();
		a.introduce();
		person.salary=10;
		a.introduce();
		b.introduce();
		c.introduce();
	}
}
