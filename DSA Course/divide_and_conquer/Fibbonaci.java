package divide_and_conquer;

public class Fibbonaci {

	public static void main(String[] args) {
		System.out.println("First 10 terms in fibonacci sequence");
		for(int i=0;i<10;i++) {
			System.out.print(fib(i)+"\t");
		}
	}
	public static int fib(int i) {
		if(i==0) {
			return 0;
		}
		if(i==1) {
			return 1;
		}
		else return fib(i-1)+fib(i-2);
	}
}
