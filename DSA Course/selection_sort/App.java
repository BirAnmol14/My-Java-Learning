package selection_sort;

import java.util.Random;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[20];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1500);
		}
		Selection_sort.show(arr);
		Selection_sort.sort(arr);
		Selection_sort.show(arr);
	}

}
class Selection_sort {
	//O(n^2) time complexity & O(1) space complexity
	public static void sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min_index=i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index=j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = tmp;
		}

	}

	public static void show(int arr[]) {
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println("");
	}
}