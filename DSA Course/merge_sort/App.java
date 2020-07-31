package merge_sort;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		int arr[] = new int[20];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1500);
		}
		Merge_sort.show(arr);
		Merge_sort.sort(arr,0,arr.length-1);
		Merge_sort.show(arr);

	}

}
