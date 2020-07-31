package binary_TREE_Array;

public class BT_Array {
	private int []arr;
	private int last_index;
	public BT_Array(int size) {
		arr=new int[size+1];
		last_index=0;
	}
	public void add(int i) {
		if(arr.length-1<=last_index) {
				System.out.println("Array is full");return;
		}
		last_index++;
		arr[last_index]=i;
	}
	public boolean find(int val) {
		for(int i=1;i<=last_index;i++) {
			if(arr[i]==val) {
				return true;
			}
		}
		return false;
	}
	public void pre_order() {
		pre_order(1);
	}
	private void pre_order(int i) {
		if(arr==null) {
			return;
		}
		if(i>last_index) {
			return;
		}
		System.out.print(arr[i]+"\t");//root
		pre_order(i*2);//left
		pre_order(2*i+1);//right
	}
	public void in_order() {
		in_order(1);
	}
	private void in_order(int i) {
		if(arr==null) {
			return;
		}
		if(i>last_index) {
			return;
		}
		pre_order(i*2);//left
		System.out.print(arr[i]+"\t");//root
		pre_order(2*i+1);//right
	}
	public void post_order() {
		post_order(1);
	}
	private void post_order(int i) {
		if(arr==null) {
			return;
		}
		if(i>last_index) {
			return;
		}
		pre_order(i*2);//left
		pre_order(2*i+1);//right
		System.out.print(arr[i]+"\t");//root
	}
	public void level_order() {
		for(int i=1;i<last_index+1;i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	public void clear() {
		arr=null;
	}
	public void delete(int i) {
		if(find(i)) {
			for(int j=1;j<last_index+1;j++) {
				if(arr[j]==i) {
					arr[j]=arr[last_index];
					last_index--;return;
				}
			}
		}
	}
}
