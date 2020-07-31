package basicClassDesign;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer("Bir","#123",10000);
		Item i1=new Item("Apple","App123",10,500);
		Item i2=new Item("Mango","Mang123",5,1000);
		c.buyItem(i1);
		c.buyItem(i2);
	}

}
