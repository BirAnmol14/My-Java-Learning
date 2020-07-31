package SumInArray;

public class MyApp {

	public static void main(String[] args) {
		int n=args.length;
		int[] arr=new int[n-1];
		for(int i=0;i<n-1;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		int matchTo=Integer.parseInt(args[n-1]);
		int[] brr=arr.clone();
		for(int i=0;i<brr.length;i++) {
			if(shownums(brr,brr[i])==true && shownums(brr,matchTo-brr[i])==true) {
				System.out.println(brr[i]+"  "+(matchTo-brr[i]));
				brr[i]=matchTo-brr[i];
			}
		}
	}
	public static boolean shownums(int [] arr,int match) {
		for(int i:arr) {
			if(i==match) {
				return true;
			}
		}
		return false;
	}
}
