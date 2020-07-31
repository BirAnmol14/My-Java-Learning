package recursion;

public class App {

	public static void main(String[] args) {
		int [] arr= {4,3,6,7,0,9,2};
		System.out.println(MaxRec(arr, 1));
		String s="malayalam";
		System.out.println(s+" is Pallindrome: "+isPallindrome(s, 0, s.length()-1));
		s="noob";
		System.out.println(s+" is Pallindrome: "+isPallindrome(s, 0, s.length()-1));
		s="mom";
		System.out.println(s+" is Pallindrome: "+isPallindrome(s, 0, s.length()-1));
		s="dabad";
		System.out.println(s+" is Pallindrome: "+isPallindrome(s, 0, s.length()-1));
	}
	public static int MaxRec(int [] arr,int index) {
		if(index==arr.length-1) {
			return arr[index];
		}
		int max=MaxRec(arr, index+1);
		return (arr[index]>max?arr[index]:max);
	}
	public static boolean isPallindrome(String s,int st,int en) {
		if(st==en||en<st) {
			return true;
		}
		if(s.charAt(st)==s.charAt(en)) {
			return isPallindrome(s, st+1, en-1);
		}
		return false;
	}
}
