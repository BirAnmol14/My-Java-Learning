package dynamic_Programming;

public class LongestSubSequence {
	private static int[][] arr;

	public static void main(String[] args) {
		String s1 = "Elephant";
		String s2 = "Erefpat";
		System.out.println("Max Sub: " + TD(s1, s2, 0, 0));
		System.out.println("Max Sub: " + BU(s1, s2));
	}

	public static int TD(String s1, String s2, int i1, int i2) {
		if (arr == null) {
			arr = new int[s1.length() + 1][s2.length() + 1];
		}
		if (s1.length() == i1 || s2.length() == i2) {
			return 0;
		}

		if (arr[i1][i2] == 0) {
			int val = 0, val1 = 0;
			if (s1.charAt(i1) == s2.charAt(i2)) {
				val = 1 + TD(s1, s2, i1 + 1, i2 + 1);
			} else {
				val = TD(s1, s2, i1 + 1, i2);
				val1 = TD(s1, s2, i1, i2 + 1);
			}
			arr[i1][i2] = Integer.max(val, val1);
		}
		return arr[i1][i2];
	}

	public static int BU(String s1,String s2) {
			int [][] arr=new int[s1.length()+1][s2.length()+1];
			for(int i=s1.length();i>=1;i--) {
				for(int j=s2.length();j>=1;j--) {
					if(s1.charAt(i-1)==s2.charAt(j-1)) {
						arr[i-1][j-1]=arr[i][j]+1;
					}
					else {
						arr[i-1][j-1]=Integer.max(arr[i][j-1], arr[i-1][j]);
					}
				}
			}
			return arr[0][0];
	}
}
