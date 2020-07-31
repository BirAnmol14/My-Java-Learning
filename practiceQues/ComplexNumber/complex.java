package ComplexNumber;

public class complex {
	private double realPart;
	private double imaginaryPart;
	public complex() {
		realPart=0;
		this.imaginaryPart=0;
	}
	public complex(double realPart,double imaginaryPart) {
		this.realPart=realPart;
		this.imaginaryPart=imaginaryPart;
		
	}
	public complex(double ...c) {
		if(c.length==1) {
		this.realPart=c[0];
		imaginaryPart=0;
		}
	}
	
	public double getRealPart() {
		return realPart;
	}
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	public complex add(complex c1) {
		complex temp=new complex();
		temp.realPart=this.realPart+c1.realPart;
		temp.imaginaryPart=this.imaginaryPart+c1.imaginaryPart;
		return temp;
	}
	public complex subtract(complex c1) {
		complex temp=new complex();
		temp.realPart=this.realPart-c1.realPart;
		temp.imaginaryPart=this.imaginaryPart-c1.imaginaryPart;
		return temp;
	}
	public complex multiply(complex c1) {
		complex temp=new complex();
		double a,b,c,d;
		a=this.realPart;
		b=this.imaginaryPart;
		c=c1.realPart;
		d=c1.imaginaryPart;
		temp.realPart=a*c-b*d;
		temp.imaginaryPart=a*d+b*c;
		return temp;
	}
	public complex divide(complex c1) {
		double c,d;
		c=c1.realPart;
		d=c1.imaginaryPart;
		complex temp=multiply(new complex(c,-1*d));
		temp.realPart/=(c*c+d*d);
		temp.imaginaryPart/=(c*c+d*d);
		return temp;
	}
	public String toString() {
		return this.realPart+"+i"+this.imaginaryPart;
	}
}
