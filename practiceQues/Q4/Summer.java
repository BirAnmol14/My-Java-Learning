package Q4;

public class Summer {
	private int n1,n2;
	public Summer(int n1,int n2) {
		this.n1=n1;
		this.n2=n2;
	}
	public int calculateSum() {
		int sum=0;
		for(int i=n1;i<=n2;i++) {
			sum+=i;
		}
		return sum;
	}
}
