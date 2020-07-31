
public class person implements info{
	private String name;
	public person(String name) {
		this.name=name;
	}
	public void introduce() {
		System.out.println("I am "+name);
	}
	@Override
	public void showinfo() {
		System.out.println("Name: "+name);		
	}
	public String my_name() {
		return name;
	}
}
