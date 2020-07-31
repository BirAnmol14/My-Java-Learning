package dynamic_Programming;

public class MinCostToEndArray {
	private static int[][] dp;

	public static void main(String[] args) {
		int[][] arr = { { 4, 7, 8, 6, 4 }, { 6, 7, 3, 9, 2 }, { 3, 8, 1, 2, 4 }, { 7, 1, 7, 3, 7 }, { 2, 9, 8, 9, 3 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("Minimum Cost: " + TD(arr, 0, 0));
		dp = null;
		System.out.println("Minimum Cost: " + BU(arr));
	}

	public static int TD(int[][] arr, int row, int col) {
		if (dp == null) {
			dp = new int[arr.length][arr[0].length];
		}
		if (row == arr.length - 1 && col == arr[0].length - 1) {
			return arr[row][col];
		} else if (dp[row][col] == 0) {
			if (row == arr.length - 1) {
				dp[row][col] = arr[row][col] + TD(arr, row, col + 1);
			} else if (col == arr[0].length - 1) {
				dp[row][col] = arr[row][col] + TD(arr, row + 1, col);
			} else {
				dp[row][col] = arr[row][col] + Integer.min(TD(arr, row + 1, col), TD(arr, row, col + 1));
			}
		}
		return dp[row][col];
	}

	public static int BU(int[][] arr) {

		int[][] dp = new int[arr.length][arr[0].length];
		for (int row = arr.length - 1; row >= 0; row--) {
			for (int col = arr[0].length - 1; col >= 0; col--) {
				if (row == arr.length - 1 && col == arr[0].length - 1) {
					dp[row][col]=arr[row][col];
				} else if (row == arr.length - 1) {
					dp[row][col] = arr[row][col] + dp[row][col+1];
				} else if (col == arr[0].length - 1) {
					dp[row][col] = arr[row][col] + dp[row+1][col];
				} else {
					dp[row][col] = arr[row][col] + Integer.min(dp[row+1][col], dp[row][col + 1]);
				}
			}
		}
		return dp[0][0];
	}
}
