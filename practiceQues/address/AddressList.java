package address;

public class AddressList {
	public int CountAddressesWithCity(Address[] list,String city) {
		if(list!=null&&city!=null&&list.length>0) {
			int count=0;
			for(Address a:list) {
				if(a.getCity().equals(city)) {
					count++;
				}
			}
			return count;
		}
		return -1;
	}
	public int CountAddressesWithPIN(Address[] list,String pin) {
		if(list!=null&&pin!=null&&list.length>0) {
			int count=0;
			for(Address a:list) {
				if(a.getPin().equals(pin)) {
					count++;
				}
			}
			return count;
		}
		return -1;
	}
	public Address[] getAddressesWithCity(Address[] list,String city) {
		if(list!=null&&city!=null&&list.length>0) {
			int count=0;
			for(Address a:list) {
				if(a.getCity().equals(city)) {
					count++;
				}
			}
			if(count==0) {
				return null;
			}else {
				Address[] tmp=new Address[count];
				int i=0;
				for(Address a:list) {
					if(a.getCity().equals(city)) {
						tmp[i]=a;
						i++;
					}
				}
				return tmp;
			}
		}
		return null;
	}
	public Address[] getAddressesWithPIN(Address[] list,String pin) {
		if(list!=null&&pin!=null&&list.length>0) {
			int count=0;
			for(Address a:list) {
				if(a.getPin().equals(pin)) {
					count++;
				}
			}
			if(count==0) {
				return null;
			}else {
				Address[] tmp=new Address[count];
				int i=0;
				for(Address a:list) {
					if(a.getPin().equals(pin)) {
						tmp[i]=a;
						i++;
					}
				}
				return tmp;
			}
		}
		return null;
	}
}
