package address;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1=new Address("1$2$3$Chandigarh$U.T.$160022");
		System.out.println(a1.getCity());
		System.out.println(a1.getState());
		System.out.println(a1.getPin());
		System.out.println(a1.getLine1());
		System.out.println(a1.getLine2());
		System.out.println(a1.getLine3());
		
	}

}
