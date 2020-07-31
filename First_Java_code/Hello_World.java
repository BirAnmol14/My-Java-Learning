import java.util.Scanner;
public class Hello_World {
		public static void main(String[] args) {
		String word="bouquet";
		String blank=" ";
		String word2="of";
		String word3="flowers";
		String sentence=word+blank+word2+blank+word3;
		System.out.printf(sentence+"\n");
		int test=1;
		System.out.println(1==4);
		while(test<10)
		{
			System.out.println("Current val: "+test);
			++test;
		}
		int i=test;
		for (;i>0;--i)
		{
			if(i!=10) {
			System.out.println("Current val: "+i);
			}
			else 
			{
				System.out.println("Haha");
			}
		}
		
		Scanner input=new Scanner(System.in);
		String text=input.nextLine();
		System.out.println("You entered: "+text);
	}

}
