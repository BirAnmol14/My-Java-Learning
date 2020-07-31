package basicClassDesign;

public class Customer {
	private String name;
	private String idNo;
	private double balance;
	private Item item;
	public Customer(String name,String idNo,double balance) {
		this.balance=balance;
		this.name=name;
		this.idNo=idNo;
	}
	public Customer(String name,String idNo) {
		this.balance=5000;
		this.name=name;
		this.idNo=idNo;
	}
	public String getName() {
		return name;
	}
	public String getIdno() {
		return idNo;
	}
	public double getBalance() {
		return balance;
	}
	public Item getItem() {
		return item;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setIdno(String idNo) {
		this.idNo=idNo;
	}
	public void print() {
		System.out.println("Item Purchased:");
		System.out.println("Name: "+item.getItemName());
		System.out.println("Item Id: "+item.getItemidNo());
		System.out.println("Item Price: "+item.getItemPrice());
		System.out.println("Item Quantity: "+item.getItemQuantity());
		System.out.println("Balance: "+ this.balance);
	}
	public void buyItem(Item item) {
		if(item.getItemQuantity()>=1&&(balance>=(item.getItemPrice()*item.getItemQuantity()))) {
		this.item=item;
		this.balance-=(item.getItemPrice()*item.getItemQuantity());
		this.print();
		}else if(item.getItemQuantity()<1) {
			System.out.println("Order is not valid");
		}else if(this.balance<(item.getItemPrice()*item.getItemQuantity())) {
			System.out.println("Insufficient Balance");
		}
	}
}
