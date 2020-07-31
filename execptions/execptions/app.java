package execptions;
import java.util.*;
public class app {

	public static void main(String[] args) {
		int[] arr=new int[3];
		try {
		for(int i=0;i<arr.length+1;i++) {
			arr[i]=i;
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			//catching specific exception
		}catch(Exception e1){
			System.out.println(e1);
		}//catching generic exception 
		System.out.println(Arrays.toString(arr));

	}

}
