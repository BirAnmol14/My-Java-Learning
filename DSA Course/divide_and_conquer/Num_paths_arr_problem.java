package divide_and_conquer;

public class Num_paths_arr_problem {

	public static void main(String[] args) {
		int [][] arr= {{4,7,1,6},{5,7,3,9},{3,2,1,2},{7,1,6,3}};
		int cost=25;
		System.out.println("Answer: "+answer(arr, 0,0, cost));

	}
	public static int answer(int [][]arr,int row,int col,int cost) {
		if(row==arr.length-1&&col==arr[0].length-1&&cost==arr[row][col]) {
				return 1;
		}
		if(row==arr.length-1&&col==arr[0].length-1&&cost!=arr[row][col]) {
			return 0;
		}
		if((row!=arr.length-1||col!=arr[0].length-1)&&(cost==arr[row][col])||cost==0){
			return 0;
		}	
		if(row==arr.length-1) {
				return answer(arr, row, col+1,cost-arr[row][col]);//Can only go right
		}
		if(col==arr[0].length-1) {
				return answer(arr, row+1, col,cost-arr[row][col]);//Can Only go down
		}
		int a=answer(arr, row+1, col,cost-arr[row][col]);//Going down
		int b=answer(arr, row, col+1,cost-arr[row][col]);//Going right
		return a+b;
		
	}
}
