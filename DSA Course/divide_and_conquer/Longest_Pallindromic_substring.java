package divide_and_conquer;

public class Longest_Pallindromic_substring {

	public static void main(String[] args) {
		String s="ABCCBUA";
		System.out.println("Length: "+ans(0,s,s.length()-1));
	}
	public static boolean isPallindrome(String s) {
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	public static int ans(int start,String s,int end) {
		if(end<start) {
			return 0;
		}
		if(end==start) {
			return 1;
		}
		int a=0,b=0,c=0;
		if(s.charAt(start)==s.charAt(end)&&isPallindrome(s.substring(start+1, end))) {
			a= 2+ans(start+1,s,end-1);
		}
		b=ans(start,s,end-1);
		c=ans(start+1,s,end);
		return Integer.max(a, Integer.max(b,c));
	}
}
