
public class Test {

	public static void main(String[] args) {
		Flight f=Factory.getFlight("business");
		f=new Tv(new Wifi(f));
		System.out.println(f.getDetails()+"\tTotal: $"+f.getPrice());
	}
	

}
