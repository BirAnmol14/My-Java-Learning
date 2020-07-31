import java.util.*;
public class app {
	public static boolean is_Prime(int x)
	{
		if (x<2) {return false;}
		if(x==2) {return true;}
		for(int i=2;i<Math.sqrt(x)+1;i++) {
			if (x%i==0) {return false;}
		}
		return true;
	}
	public static void main(String[] args) {
		ArrayList<Integer >prime_nums=new ArrayList<Integer>();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=input.nextInt();input.nextLine();
		for(int i=2;i<num+1;i++) {
			if(is_Prime(i)) {
				prime_nums.add(i);
			}
		}
		System.out.println("Number of prime numbers is: "+prime_nums.size()+" and the prime numbers are: ");
		System.out.println(prime_nums.toString());
		input.close();
	}

}
