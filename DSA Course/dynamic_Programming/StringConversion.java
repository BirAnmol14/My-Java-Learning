package dynamic_Programming;

public class StringConversion {
	private static int [] [] arr;
	public static void main(String[] args) {
		String s1 = "Catch";
		String s2 = "Carch";
		System.out.println(topDown(s1, s2, 0, 0));arr=null;
		System.out.println(botUp(s1, s2));
		s1 = "table";
		s2 = "tbres";
		System.out.println(topDown(s1, s2, 0, 0));arr=null;
		System.out.println(botUp(s1, s2));
	}

	public static int topDown(String str1, String str2, int index1, int index2) {
		if (arr == null) {
			arr = new int[str1.length() + 1][str2.length() + 1];
		}
		if (str1.length() == index1) {
			return str2.length() - index2;
		}
		if (str2.length() == index2) {
			return str1.length() - index1;
		}
		if (str1.charAt(index1) == str2.charAt(index2)) {
			arr[index1][index2] = topDown(str1, str2, index1 + 1, index2 + 1);
		} else {
			// Value on deletion
			int v1 = 1 + topDown(str1, str2, index1, index2 + 1);
			// Value of Insertion
			int v2 = 1 + topDown(str1, str2, index1 + 1, index2);
			// value on replacing
			int v3 = 1 + topDown(str1, str2, index1 + 1, index2 + 1);
			arr[index1][index2] = Integer.min(v1, Integer.min(v2, v3));
		}
		return arr[index1][index2];
	}
	public static int botUp(String s1,String s2) {
		int [][]arr=new int [s1.length()+1][s2.length()+1];
		for(int i=0;i<=s1.length();i++) {
			arr[i][0]=i;
		}
		for(int j=0;j<=s2.length();j++) {
		}
		for(int i=1;i<=s1.length();i++){
			for(int j=1;j<=s2.length();j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					arr[i][j]=arr[i-1][j-1];
				}
				else {
					arr[i][j]=1+Integer.min(arr[i][j-1], Integer.min(arr[i-1][j], arr[i-1][j-1]));
				}
			}
		}
		return arr[s1.length()][s2.length()];
	}
}
