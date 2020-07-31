package arrayExample;

public class RetailStore {
	private int [] itemID = {1001,1002,1003,1004,1005};
	private double [] price= {13.5,18,19.5,25.50};
	public double computePrice(int value) {
		for(int i=0;i<itemID.length;i++) {
			if(itemID[i]==value) {
				return price[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RetailStore s1=new RetailStore();
		System.out.println(s1.computePrice(1002));
		System.out.println(s1.computePrice(1004));
	}

}
