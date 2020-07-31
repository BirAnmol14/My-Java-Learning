package backtracking;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		int [] tmp={1,2,3,4};
		//Generates all permutations of temporary array
		permutation(tmp,new ArrayList<Integer>(),new boolean[4]);
		System.out.println();
		combinantions(tmp, 3, 0, new ArrayList<Integer>());
		System.out.println();

		nQueens(4);
		System.out.println("");
		int [] tmp1= {1,1,1,0,3,2};
		target(tmp1, 5);
	}
	public static void target(int [] input, int target) {
		//Sum of the number from given array should be equal to target, find all such combinations
		solve(input,0,target,new ArrayList<Integer>());
	}
	private static void solve(int [] ip,int st,int tar,ArrayList<Integer> part) {
		if(ip.length==part.size()||tar==0) {
			if(tar!=0) {
				return;
			}
			System.out.println(part);
			return ;
		}
		for(int i=st;i<ip.length;i++) {
			part.add(ip[i]);
			if(tar-ip[i]>=0) {
			solve(ip, i+1, tar-ip[i], part);
			}
			part.remove(part.size()-1);
		}
	}
	public static void permutation(int [] input,ArrayList<Integer> partial, boolean[] used) {
		if(partial.size()==input.length) {
			System.out.println(partial);
			return;
		}
		for(int i=0;i<input.length;i++) {
			if(!used[i]) {
				used[i]=true;
				partial.add(input[i]);
				permutation(input, partial, used);
				used[i]=false;
				partial.remove(partial.size()-1);
			}
		}
	}
	//Combinations : select k integers from a given input array
	public static void combinantions(int [] input,int k,int start,ArrayList<Integer> partial) {
		if(k==0) {
			System.out.println(partial);return ;
		}
		for(int i=start;i<input.length;i++) {
			partial.add(input[i]);
			combinantions(input, k-1, i+1, partial);
			partial.remove(partial.size()-1);
		}
	}
	//N queens problem
	public static void nQueens(int n){
        int[] board = new int[n];
        if(!helper(board,0)){
            System.out.println("No solution");
        }
    }

    public static boolean helper(int[] board,int i){
        if(i == board.length){
            for(int row : board){
                for(int c=0;c<board.length;c++){
                    if(c == row){
                        System.out.print(" O ");
                    }else{
                        System.out.print(" X ");
                    }
                }
                System.out.println("");
            }
            return true;
        }
        for(int c=0;c<board.length;c++){
            boolean flag = false;
            for(int r=0;r<i;r++){
                if(board[r] == c || Math.abs(board[r]-c) == (i-r)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            board[i]=c;
            if(helper(board,i+1)){
                return true;
            }
        }
        return false;
    }
}
//Input generate partial output and then use all permutations to form solution