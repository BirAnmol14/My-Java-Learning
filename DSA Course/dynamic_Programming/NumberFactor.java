package dynamic_Programming;

public class NumberFactor {
	private static int [] arr;
	public static void main(String[] args) {
		//given n find number of ways to express n as a sum of 1,3,and 4
		System.out.println(topDown(5));arr=null;
		System.out.println(topDown(6));arr=null;
		
		System.out.println(bottomUP(5));arr=null;
		System.out.println(bottomUP(6));arr=null;
	}
	public static int topDown(int n) {
		if(arr==null) {
		arr=new int[n+1];
		}
		if(n<=0) {
			arr[0]=0;
		}
		if(n==1) {
			arr[1]=1;
		}
		if(n==2) {
			arr[2]=1;
		}
		if(n==3) {
			arr[3]=2;
		}
		if(n==4) {
			arr[4]=4;
		}
		if(arr[n]==0) {
			arr[n]=topDown(n-1)+topDown(n-3)+topDown(n-4);
		}
		return arr[n];
	}
	public static int bottomUP(int n) {
		if(arr==null) {
			arr=new int[n+1];
		}
		
		arr[0]=0;
		arr[1]=1;
		arr[2]=1;
		arr[3]=2;
		arr[4]=4;
		for(int i=5;i<=n;i++) {
			arr[i]=arr[i-1]+arr[i-3]+arr[i-4];
		}
		return arr[n];
	}
}
