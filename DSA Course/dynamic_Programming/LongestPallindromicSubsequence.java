package dynamic_Programming;

public class LongestPallindromicSubsequence {
	private static int [][] arr;
	public static void main(String[] args) {
		String s="elrmenmet";
		System.out.println("Length: "+TD(s,0,s.length()-1));arr=null;
		System.out.println("Length: "+BU(s));
	}
	public static int TD(String s,int st,int en) {
		if(arr==null) {
			arr=new int [s.length()+1][s.length()+1];
		}
		if(s.length()<=0||en<st) {
			return 0;
		}
		if(arr[st][en]==0) {
			if(s.charAt(st)==s.charAt(en)&&st!=en) {
				arr[st][en]=2+TD(s,st+1,en-1);
			}
			else {
				arr[st][en]=Integer.max(1+TD(s,st+1,en-1), Integer.max(TD(s,st+1,en),TD(s,st,en-1)));
			}
		}
		return arr[st][en];
	}
	public static int BU(String s) {
		int [][] arr=new int [s.length()][s.length()];
		for (int col = 0; col < s.length(); col++) {
			for (int row = s.length()-1; row >= 0; row--) {
				if (row > col) { // BASE CASE - If we have traversed more than 1/2 of string then return 0 as we dont need to process it
					arr[row][col] = 0;
				} else if (row == col) { // BASE CASE - If both the index are at same position then its a palindrome as its 1 character.
					arr[row][col] = 1;
				} else {
					if (s.charAt(row) == s.charAt(col)) {
						arr[row][col] = Math.max(2+arr[row + 1][col - 1], Math.max(arr[row][col - 1], arr[row + 1][col]));
					} else {
						arr[row][col] = Math.max(arr[row][col - 1], arr[row + 1][col]);
					}
				}
			} 
		}
		return arr[0][s.length()-1];
	}
}
