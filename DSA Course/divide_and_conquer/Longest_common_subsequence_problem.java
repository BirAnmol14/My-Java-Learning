package divide_and_conquer;

public class Longest_common_subsequence_problem {
	public static void main(String[] args) {
		System.out.println("Max Sub: "+find("elephant", 0, "erefpat", 0));
	}
	public static int find(String s1,int i1,String s2,int i2) {
		if(i1==s1.length()||i2==s2.length()) {
			return 0;
		}
		int val=0;
		int val1=0;
		if(s1.charAt(i1)==s2.charAt(i2)) {
			val=1+find(s1, i1+1, s2, i2+1);
		}else {
			val=0+find(s1, i1, s2, i2+1);
			val1=0+find(s1,i1+1,s2,i2);
		}
		return Integer.max(val, val1);
		
	}
	
}
