import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner in=new Scanner(System.in);
		int input=in.nextInt();
		int fact;
		fact=factorial(input);
		System.out.println("Factorial of "+input+" is "+fact);
		in.close();
	}
	public static int factorial(int x) {
		if(x==0) {
			return 1;
		}else {
			return x*factorial(x-1);
		}
	}
}