package staticBlockDemo;

public class BOX {
	private double l,b,h;
	public BOX(double l,double b,double h) {
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}
	@Override
	public String toString() {
		return "Length: "+l+" Breadth: "+b+" Height: "+h;
	}
	public double area() {
		return 2*(l*b+b*h+h*l);
	}
	public double volume() {
		return l*b*h;
	}
	public static void swapBOX(BOX B1,BOX B2) {
		BOX tmp=B1;
		B1=B2;
		B2=tmp;
	}//Swaps only the local variables 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOX b1=new BOX(10,40,60);
		BOX b2=new BOX(20,30,80);
		System.out.println(b1);
		System.out.println(b2);
		BOX.swapBOX(b1, b2);
		System.out.println(b1);
		System.out.println(b2);
		BOX tmp=b1;
		b1=b2;
		b2=tmp;
		System.out.println(b1);
		System.out.println(b2);
	}

}
