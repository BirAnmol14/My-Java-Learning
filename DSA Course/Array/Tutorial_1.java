package Array;

import java.util.Scanner;

public class Tutorial_1 {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[][] arr2 = new int[2][3];
		System.out.println("Enter Numbers for 1-D Array: ");
		Scanner in = new Scanner(System.in);
		//Getting input in Array
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Input value of arr1[" + i + "]");
			arr1[i]=in.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println("Input value of arr2[" + i + "][" + j + "]");
				arr2[i][j]=in.nextInt();
			}
		}
		in.close();
		//Printing Out 
		System.out.println("--------------------------\n1-D Array is: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"\t");
		}System.out.println("");
		System.out.println("--------------------------\n2-D Array is: ");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+"\t");
			}System.out.println("");
		}
	}

}
