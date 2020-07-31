package dynamic_Programming;

import java.util.ArrayList;

public class ZeroKnackSpan {
	private static int[][] arr;

	public static void main(String[] args) {
		ArrayList<items> list = new ArrayList<items>();
		list.add(new items(31, 3));
		list.add(new items(26, 1));
		list.add(new items(72, 5));
		list.add(new items(17, 2));
		System.out.println(TD(0, list, 0, 7));
		arr=null;
		System.out.println(BU(list,0,7));
	}

	public static int TD(int index, ArrayList<items> list, int weight, int capacity) {
		if (arr == null) {
			arr=new int[list.size()+1][capacity+1];
		}
		if (index < 0 || index >= list.size()) {
			return 0;
		}
		items tmp = list.get(index);
		if(arr[index][weight]==0) {
		if (tmp.weight + weight > capacity) {
			arr[index][weight]= TD(index + 1, list, weight, capacity);
		}else {
			arr[index][weight]=Integer.max(tmp.value + TD(index + 1, list, weight + tmp.weight, capacity),TD(index + 1, list, weight, capacity));
		}
		}
		return arr[index][weight];
	}

	public static int BU(ArrayList<items> list,int weight,int capacity) {
		int [][]arr=new int [list.size()+1][capacity+1];
		for(int i=list.size()-1;i>=0;i--) {
			for(int j=0;j<=capacity;j++) {
				int pr1=0,pr2=0;
				items tmp=list.get(i);
				if(tmp.weight+j<=capacity) {
					pr1=tmp.value+arr[i+1][j+tmp.weight];
				}
				pr2=arr[i+1][j];
				arr[i][j]=Integer.max(pr1,pr2);
			}
		}
		return arr[0][weight];
	}
}

class items {
	public int value;
	public int weight;

	public items(int v, int w) {
		value = v;
		weight = w;
	}
}