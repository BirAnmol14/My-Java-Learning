package divide_and_conquer;

public class Minimum_cost_to_Reach_end_Arr {

	public static void main(String[] args) {
		int [][]arr= {{4,7,8,6,4},{6,7,3,9,2},{3,8,1,2,4},{7,1,7,3,7},{2,9,8,9,3}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("Minimum Cost: "+answer(arr, 0, 0));

	}
	public static int answer(int [][]arr,int row,int col) {
		if(row==arr.length-1&&col==arr[0].length-1) {
			return arr[row][col];
		}
		if(row==arr.length-1) {
			return arr[row][col]+answer(arr, row, col+1);//Can only go right
		}
		if(col==arr[0].length-1) {
			return arr[row][col]+answer(arr, row+1, col);//Can Only go down
		}
		int a=arr[row][col]+answer(arr, row+1, col);//Going down
		int b=arr[row][col]+answer(arr, row, col+1);//Going right
		return Integer.min(a, b);
	}
}
