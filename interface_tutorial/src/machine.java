
public class machine implements info {
	public machine()
	{
		System.out.println("Starting machine");
	}
	private int id=7;
	@Override
	public void showinfo()
	{
		System.out.println("ID: "+id);
	}
}
