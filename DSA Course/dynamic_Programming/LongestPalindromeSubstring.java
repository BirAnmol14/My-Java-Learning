package dynamic_Programming;

public class LongestPalindromeSubstring {
	private static int [][] arr;
	public static void main(String[] args) {
		String s="ABCCBUA";
		System.out.println("Length: "+TD(s,0,s.length()-1));arr=null;
		System.out.println("Length: "+BU(s));
	}
	public static int TD(String s,int start,int end) {
		if(arr==null) {
			arr=new int [s.length()+1][s.length()+1];
		}
		if(end<start) {
			return 0;
		}
		if(end==start) {
			return 1;
		}
		if(arr[start][end]==0) {
		int a=0,b=0,c=0;
			if(s.charAt(start)==s.charAt(end)&&end-start-1==TD(s,start+1,end-1)) {
				a= 2+end-start-1;
			}else {
				b=TD(s,start,end-1);
				c=TD(s,start+1,end);
			}
			arr[start][end] =Integer.max(a, Integer.max(b,c));
		}
		return arr[start][end];
	}
	public static int BU(String s) {
		int [][] arr=new int [s.length()][s.length()];
		for(int i=0;i<s.length();i++) {
			for(int j=s.length()-1;j>=0;j--) {
				if(j>i) {
					arr[j][i]=0;
				}
				else if(i==j) {
					arr[j][i]=1;
				}
				else {
					if(s.charAt(j)==s.charAt(i)) {
						int expectedLen=i-j-1;
						int lenUsed=(arr[j+1][i-1]==expectedLen?arr[j+1][i-1]+2:0);
						arr[j][i]=Integer.max(lenUsed, Integer.max(arr[j][i-1], arr[j+1][i]));
					}else {
						arr[j][i]=Integer.max(arr[j][i-1], arr[j+1][i]);
					}
				}
			}
		}
		return arr[0][s.length()-1];
	}
}
