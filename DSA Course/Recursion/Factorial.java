package Recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int i=in.nextInt();
		if(fact(i)!=-1) {
			System.out.println(i+"! = "+fact(i));
		}else {
			System.out.println("Invalid Input");
		}
		in.close();
	}
	public static int fact(int n) {
		if(n>=1) {
			return n*fact(n-1);
		}
		else if(n==0) {
			return 1;
		}
		return -1;
	}
}
