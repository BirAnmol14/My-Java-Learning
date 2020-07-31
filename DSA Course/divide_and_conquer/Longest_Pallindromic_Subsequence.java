package divide_and_conquer;

public class Longest_Pallindromic_Subsequence {

	public static void main(String[] args) {
		String s="elrmenmet";
		System.out.println("Length: "+lps(0,s,s.length()-1));

	}
	public static int lps(int start,String s,int end) {
		if(end<start) {
			return 0;
		}
		int a=0;
		int b=0;
		int c=0;
		if(s.charAt(start)==s.charAt(end)&&start!=end) {
			a=2+lps(start+1,s,end-1);
		}
		else if(s.charAt(start)==s.charAt(end)&&start==end) {
			a=1+lps(start+1,s,end-1);
		}
		b=lps(start,s,end-1);
		c=lps(start+1,s,end);
		return Math.max(a, Math.max(b, c));
	}
}
