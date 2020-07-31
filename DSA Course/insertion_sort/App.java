package insertion_sort;

import java.util.Random;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[20];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1500);
		}
		In_sort.show(arr);
		In_sort.sort(arr);
		In_sort.show(arr);
	}

}
class In_sort {
	//O(n^2) time complexity & O(1) space complexity
	public static void sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int val=arr[i+1];
			int j=i+1;
			for( ;j>0;j--) {
				if(val<arr[j-1]) {
					arr[j]=arr[j-1];
				}
				if(arr[j]>arr[j-1]) {
					break;
				}
			}
			arr[j]=val;
		}

	}

	public static void show(int arr[]) {
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println("");
	}
}