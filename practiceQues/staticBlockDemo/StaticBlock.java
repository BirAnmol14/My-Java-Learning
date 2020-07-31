package staticBlockDemo;

public class StaticBlock {
	static int [] arr=initialiseArray(10);
	private static int [] initialiseArray(int N) {
		int [] arr=new int[N];
		for (int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		return arr;
	}
	void listVals() {
		for(int i:arr) {
			System.out.print(i+1+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock ex=new StaticBlock();
		System.out.println("Obj 1");
		ex.listVals();
		StaticBlock ex1=new StaticBlock();
		System.out.println("Obj 2");
		ex1.listVals();
		System.out.println(ex.arr.length+" "+StaticBlock.arr.length);
	}

}
