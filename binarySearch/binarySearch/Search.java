package binarySearch;

public class Search {
	private int [] arr;
	public Search(int [] arr) {
		this.arr=new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			this.arr[i]=arr[i];
		}
	}
	public int find(int x) {
			int left=0;
			int right=arr.length-1;
			while(left<=right) {
				int mid=(left+right)/2;
				if(arr[mid]==x) {
					return mid;
				}
				if(arr[mid]>x) {
					right=mid-1;
				}else {
					left=mid+1;
				}
			}
			return -1;
	}
}
