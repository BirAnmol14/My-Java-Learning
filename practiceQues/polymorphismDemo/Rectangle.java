package polymorphismDemo;

public class Rectangle extends Shape{
	private double l;
	private double b;
	public Rectangle(String color,double l,double b) {
		super(color);
		this.l=l;
		this.b=b;
	}
	@Override
	public String toString() {
		return "Rectangle [l=" + l + ", b=" + b + ", toString()=" + super.toString() + ", getArea()=" + getArea() +"]";
	}
	@Override
	public double getArea() {
		return l*b;
	}
	
}
