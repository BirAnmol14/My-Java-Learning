package usingScanner;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String name;
		int age;
		double salary;
		System.out.println("Name: ");
		name=scanner.nextLine();
		System.out.println("Age: ");
		age=scanner.nextInt();
		System.out.println("Salary: ");
		salary=scanner.nextDouble();
		System.out.println(name+" : "+age+" : "+salary);
	}

}
