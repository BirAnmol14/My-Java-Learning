package recursion;

public class Exercise {

	public static void main(String[] args) {
		//#1
		//2,3,4,5,6,7 in sequence
		//2,4,5,6,7 not in sequence
		int [] arr1= {2,3,4,5,6,7};
		int [] arr2= {2,4,5,6,7};
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println("In Sequence: "+inSequence(arr1, 0));
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		System.out.println("In Sequence: "+inSequence(arr2, 0));
		//#2
		//sum of digits of an integer
		int i=9908;
		System.out.println("Sum digits of "+i+" "+findDigitSum(i));
		i=123456789;
		System.out.println("Sum digits of "+i+" "+findDigitSum(i));
		i=987654321;
		System.out.println("Sum digits of "+i+" "+findDigitSum(i));
	}
	public static boolean inSequence(int [] arr,int index) {
		if(index==arr.length-1) {
			return true;
		}
		if(arr[index]==arr[index+1]-1&&inSequence(arr, index+1)) {
			return true;
		}
		return false;
	}
	public static int findDigitSum(int n) {
		if(n/10==0) {
			return n%10;
		}
		return n%10+findDigitSum(n/10);
	}
}
