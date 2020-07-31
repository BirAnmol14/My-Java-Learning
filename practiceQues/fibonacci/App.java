package fibonacci;

public class App {

	public static void main(String[] args) {
		
		Integer n=Integer.parseInt(args[0]);
		int sum=0;
		for(int i=1;i<=n;i++) {
			int j=fibonacciSeries(i);
			sum+=j;
			System.out.print(j+" ");
		}
		System.out.println("\nAverage: "+((float)sum/n));

	}
	public static int fibonacciSeries(int x) {
		if(x==1||x==2) {
			return 1;
		}
		else if (x>2) {
			return fibonacciSeries(x-1)+fibonacciSeries(x-2);
		}
		return -1;
	}

}
