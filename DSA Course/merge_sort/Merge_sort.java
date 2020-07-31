package merge_sort;

public class Merge_sort {//nlogn
	public static void sort(int [] arr,int l,int r) {
		if(l>=r) {
			return;
		}
		int m=(l+r)/2;
		sort(arr, l, m);
		sort(arr, m+1, r);
		Merge.merge(arr, l, m, r);
	}
	public static void show(int arr[]) {
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println("");
	}
}
