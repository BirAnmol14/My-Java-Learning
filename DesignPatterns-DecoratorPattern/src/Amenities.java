
public abstract class Amenities implements Flight{
	Flight flight;
	public Amenities(Flight flight ) {
		this.flight=flight;
	}
}
class Wifi extends Amenities{

	public Wifi(Flight flight) {
		super(flight);
	}

	@Override
	public String getDetails() {
		return flight.getDetails()+" with Wifi";
	}

	@Override
	public double getPrice() {
		return flight.getPrice()+30;
	}
	
}
class Tv extends Amenities{

	public Tv(Flight flight) {
		super(flight);
	}

	@Override
	public String getDetails() {
		return flight.getDetails()+" with live Tv";
	}

	@Override
	public double getPrice() {
		return flight.getPrice()+20;
	}
	
}