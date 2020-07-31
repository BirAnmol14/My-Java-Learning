package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.print("Size of Array: ");
		n=scanner.nextInt();
		int [] array= new int[n];
		System.out.println("Enter Values: ");
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
		}
		Arrays.sort(array);
		System.out.print("[ ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("]");
		System.out.println("What do you want to find?");
		n=scanner.nextInt();
		Search finder=new Search(array);
		int index;
		index=finder.find(n);
		if(index!=-1) {
		System.out.println("Element found at index: "+index);
		}
		else {
			System.out.println("Element not found");
		}
		scanner.close();
	}

}
