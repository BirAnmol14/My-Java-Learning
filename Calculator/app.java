import java.util.Random;
import java.util.Scanner;
class calculator{
	private double memory;
	public calculator() {
		memory=0;
	}
	public double add(double a, double b)
	{
		memory=a+b;
		return memory;
	}
	public double subtract(double a, double b)
	{
		memory=a-b;
		return memory;
	}
	public double product(double a, double b)
	{
		memory=a*b;
		return memory;
	}
	public double divide(double a, double b)
	{
		memory=a/b;
		return memory;
	}
	public double remainder(double a,double b)
	{
		memory=a%b;
		return memory;
	}
	public void check_last_result()
	{
		System.out.println(memory);
	}
}
public class app {
	
	public static void main(String [] args) {
		System.out.println("Welcome to Calculator");
		Scanner input=new Scanner(System.in);
		calculator c1=new calculator(); 
		int opt;double a,b;
		do {
			System.out.printf("Choose option:\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Remainder\n6.Last Calculation\n7.Exit\n");
			opt=input.nextInt();
			
			switch(opt)
			{
			case 1: System.out.printf("First number: ");a=input.nextDouble();
			System.out.printf("Second number: ");b=input.nextDouble();System.out.println(c1.add(a,b));break;
			case 2: System.out.printf("First number: ");a=input.nextDouble();
			System.out.printf("Second number: ");b=input.nextDouble();System.out.println(c1.subtract(a,b));break;
			case 3: System.out.printf("First number: ");a=input.nextDouble();
			System.out.printf("Second number: ");b=input.nextDouble();System.out.println(c1.product(a,b));break;
			case 4: System.out.printf("First number: ");a=input.nextDouble();
			System.out.printf("Second number: ");b=input.nextDouble();System.out.println(c1.divide(a,b));break;
			case 5: System.out.printf("First number: ");a=input.nextDouble();
			System.out.printf("Second number: ");b=input.nextDouble();System.out.println(c1.remainder(a,b));break;
			case 6: c1.check_last_result();break;
			case 7:System.out.println("Thanks,bye!");break;
			default: System.out.println("No matching option, try again!");break;
			}
		}while(opt!=7);
	}
}
