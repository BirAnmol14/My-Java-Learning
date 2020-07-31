package quick_sort;

public class Quick_sort {// O(nlogn)
	public static void sort(int [] arr,int l,int r) {
		if(l<r) {
			int piv=partion(arr,l,r);
			sort(arr, l, piv-1);
			sort(arr, piv+1, r);
		}
	}
	public static void show(int [] arr) {
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		System.out.println("");
	}
	public static int partion(int [] arr,int l,int r) {
		int piv=r;
		int i=l-1;
		int j=l;
		while(j<=r) {
			if(arr[j]<=arr[piv]) {
				i++;
				int tmp=arr[j];
				arr[j]=arr[i];
				arr[i]=tmp;
			}
			j++;
		}
		return i;
	}
}
