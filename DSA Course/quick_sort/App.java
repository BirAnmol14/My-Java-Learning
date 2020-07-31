package quick_sort;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		int arr[] = new int[20];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1500);
		}
		Quick_sort.show(arr);
		Quick_sort.sort(arr,0,arr.length-1);
		Quick_sort.show(arr);
	}

}
