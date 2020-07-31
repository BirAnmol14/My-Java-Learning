package Array;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
	//Array Need Not Be Sorted
	//O(n)
	public static void main(String[] args) {
		int [] arr= new int[10];
		Random r=new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i]=r.nextInt(100000);
		}
		System.out.println("Array is: ");
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		int key;
		Scanner in=new Scanner(System.in);
		System.out.println("\nEnter The Number You Want To Find: ");
		key=in.nextInt();
		in.close();
		int ans=lin_search(arr, key);
		if(ans==-1) {
			System.out.println("Not Found");
		}else {
			System.out.println("Found at Index: "+ans);
		}
	}

	public static int lin_search(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
