package bubble_sort;

public class Bubble_sort {
	// O(n^2) time complexity & O(1) space complexity
	public static void sort(int arr[]) {
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - j - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
			}
		}

	}

	public static void show(int arr[]) {
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println("");
	}
}
