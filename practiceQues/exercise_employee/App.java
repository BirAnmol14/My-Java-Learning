package exercise_employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("ABC",500);
		Employee e2=new Employee("XYZ",400);
		Employee e3=new Manager("EFG",1000,"CS");
		Employee e4=new Manager("Fgh",2000,"MBA");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
	}

}
