package bubble_sort;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		int arr[] = new int[20];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1500);
		}
		Bubble_sort.show(arr);
		Bubble_sort.sort(arr);
		Bubble_sort.show(arr);
	}

}
