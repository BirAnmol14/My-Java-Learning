package divide_and_conquer;

public class Convert_string_1_to_2 {
	public static void main(String[] args) {
		String s1="Catch";
		String s2="Carch";
		int ans=val(s1.toCharArray(), s2.toCharArray(), 0,0);
		System.out.println("Answer: "+ans);
		s1="table";
		s2="tbres";
		ans=val(s1.toCharArray(), s2.toCharArray(), 0,0);
		System.out.println("Answer: "+ans);
	}
	public static int val(char [] arr1,char[] arr2,int index1,int index2 ) {	
		if(arr1.length==index1) {
			return arr2.length-index2;
			//BASE CASE remove: extra characters of s2
		}
		if(arr2.length==index2) {
			return arr1.length-index1;
			//Adding extra characters of s1 to s2
		}
		if(arr1[index1]==arr2[index2]) {
			return val(arr1, arr2, index1+1,index2+1);
		}
		//Value on deletion
		int v1=1+val(arr1, arr2, index1, index2+1);
		//Value of Insertion
		int v2=1+val(arr1,arr2,index1+1,index2);
		//value on replacing
		int v3=1+val(arr1,arr2,index1+1,index2+1);
		return Integer.min(v1, Integer.min(v2, v3));
	}
}
