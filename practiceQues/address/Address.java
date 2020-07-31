package address;

public class Address {
	private String line1;
	private String line2;
	private String line3;
	private char[] city;
	private char[] state;
	private String pin;
	public Address(String address) {
		if(address!=null) {
		String[] info=address.split("\\$",0);
			if(info.length==6) {
				line1=info[0];
				line2=info[1];
				line3=info[2];
				city=info[3].toCharArray();
				state=info[4].toCharArray();
				pin=info[5];
			}
		}
	}
	public String getLine1() {
		return line1;
	}
	public String getLine2() {
		return line2;
	}
	public String getLine3() {
		return line3;
	}
	public String getCity() {
		return String.copyValueOf(city);
	}
	public String getState() {
		return String.copyValueOf(state);
	}
	public String getPin() {
		return pin;
	}
	
}
