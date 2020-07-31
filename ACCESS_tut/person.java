public class person {
	public String name;
	protected int age;
	private double income;
	public person(String name,int age,double income)
	{
		this.name=name;
		this.age=age;
		this.income=income;
	}
	// All three variables accessible here
	public void show_details() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Income: "+income);
	}
	//rollnum even though public, is not accesssible here as it was declared only for the child class
}
