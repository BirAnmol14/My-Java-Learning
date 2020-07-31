
public class Factory {
	public static Flight getFlight(String type) {
		if(type.equalsIgnoreCase("economy")) {
			return new Economy();
		}else if(type.equalsIgnoreCase("business")) {
			return new Business();
		}
		return null;
	}
}
