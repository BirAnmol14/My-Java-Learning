package uniqueNums;
public class App {

	public static void main(String[] args) {
		//for 4 digit nums only
		if(args[0].length()==4) {
			int []arr=new int[4];
			int n=Integer.parseInt(args[0]);
			int counter=0;
			while(n>0) {
				arr[counter]=n%10;
				n=n/10;
				counter++;
			}
			generatenum(arr);
			
		}
	}
	public static void generatenum(int[] arr) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<4;k++) {
					if(arr[i]!=arr[j]&&arr[j]!=arr[k]&&arr[i]!=arr[k]) {
						System.out.println(arr[i]+""+arr[j]+""+arr[k]);
					}
				}
			}
		}
		
	}

}
