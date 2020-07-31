package divide_and_conquer;

public class House_thief {
	public static void main(String[] args) {
		int [] houses= {6,7,1,30,8,2,4};
		int val=find_max_stolen(houses, 0);
		System.out.println("Maximum stolen: "+val);
		int [] houses1= {20,5,1,13,6,11,40};
		val=find_max_stolen(houses1, 0);
		System.out.println("Maximum stolen: "+val);
	}
	public static int find_max_stolen(int [] arr,int index) {
		if(index>=arr.length) {
			return 0;
		}
		int v1=arr[index]+find_max_stolen(arr,index+2);
		int v2=0+find_max_stolen(arr,index+1);
		return Integer.max(v1, v2);
	}
}
