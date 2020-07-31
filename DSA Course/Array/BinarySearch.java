package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
	//O(log n)
	//Array Must Be Sorted
	public static int bin_search(int [] arr,int key,int low,int high) {
		int mid=(low+high)/2;
		if(low>high) {
			return -1;
		}
		if(arr[mid]==key) {
			return mid;
		}
		if(arr[mid]<key) {
			low=mid+1;
			return bin_search(arr, key, low, high);
		}
		else {
			high=mid-1;
			return bin_search(arr, key, low, high);
		}
	}
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
		//Must to be sorted
				Arrays.sort(arr);
				System.out.println("\nArray is(after sorting): ");
				for(int i:arr) {
					System.out.print(i+"\t");
				}
		int key;
		Scanner in=new Scanner(System.in);
		System.out.println("\nEnter The Number You Want To Find: ");
		key=in.nextInt();
		in.close();
		int ans=bin_search(arr, key,0,arr.length-1);
		if(ans==-1) {
			System.out.println("Not Found");
		}else {
			System.out.println("Found at Index: "+ans);
		}

	}

}
