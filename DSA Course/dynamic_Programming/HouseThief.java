package dynamic_Programming;

public class HouseThief {
	private static int [] arr;
	public static void main(String[] args) {
		//n houses with some value but thief cannot steal in adjacent houses
		int [] houses= {6,7,1,30,8,2,4};
		int val=topDown(houses, 0);
		System.out.println("Maximum stolen: "+val);
		arr=null;
		int [] houses1= {20,5,1,13,6,11,40};
		val=topDown(houses1, 0);
		System.out.println("Maximum stolen: "+val);
		arr=null;
		
		val=botUp(houses, 0);
		System.out.println("Maximum stolen: "+val);
		arr=null;
		val=botUp(houses1, 0);
		System.out.println("Maximum stolen: "+val);
		arr=null;
	}
	public static int topDown(int [] houses,int index) {
		if(arr==null) {
			arr=new int [houses.length];
		}
		if(index>=houses.length) {
			return 0;
		}
		if(arr[index]==0) {
			int v1=houses[index]+topDown(houses, index+2);
			int v2=topDown(houses, index+1);
			arr[index]=Integer.max(v1, v2);
		}
		return arr[index];
	}
	public static int botUp(int [] houses,int index) {
		if(index<0) {
			return 0;
		}
		if(houses.length==1) {
			return houses[0];
		}
		if(houses.length==2) {
			return Integer.max(houses[0],houses[1]);
		}
		int [] arr=new int [houses.length];
		int last=houses.length-1;
		arr[last]=houses[last];
		for(int i=last-1;i>=0;i--) {
			if(i+2<arr.length) {
			arr[i]=Integer.max(houses[i]+arr[i+2], arr[i+1]);
			}else {
				arr[i]=Integer.max(houses[i], arr[i+1]);
			}
		}
		return arr[index];
	}
}
