
public interface Flight {
	public String getDetails();
	public double getPrice();
}
class Economy implements Flight{

	@Override
	public String getDetails() {
		return "Economy Flight";
	}

	@Override
	public double getPrice() {
		return 2500;
	}
	
}
class Business implements Flight{

	@Override
	public String getDetails() {
		return "Business Flight";
	}

	@Override
	public double getPrice() {
		return 3500;
	}
	
}