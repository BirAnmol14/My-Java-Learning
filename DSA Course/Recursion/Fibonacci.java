package Recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Number of Numbers in series:");
		int val=in.nextInt();
		int i;
		for(i=0;i<val-1;i++) {
			System.out.print(fib(i)+",\t");
		}
		System.out.println(fib(i));
		in.close();
	}
	public static int fib(int i) {
		if(i==0) {
			return 0;
		}
		if(i==1) {
			return 1;
		}
		if(i>1) {
			return fib(i-1)+fib(i-2);
		}
		return -1;
	}
}
