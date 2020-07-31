package divide_and_conquer;

public class Number_Factor {

	public static void main(String[] args) {
		System.out.println("5 in: "+find(5)+" ways");
		System.out.println("6 in: "+find(6)+" ways");
	}
	public static int find(int n) {
		if(n<=0) {
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		if(n==2) {
			return 1;
		}
		if(n==3) {
			return 2;
		}
		if(n==4) {
			return 4;
		} 
		return find(n-1)+find(n-3)+find(n-4);
	}
}
