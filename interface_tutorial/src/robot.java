
public class robot extends person implements info{
	private int id;
	public robot(String name,int id) {
		super(name);
		this.id=id;
	} 
	public void moreinfo() {
		showinfo();//Calling interface method from parent class
		System.out.println("ID: "+id);
	}
}
