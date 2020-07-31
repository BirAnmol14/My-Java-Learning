package inheritanceDemo;

public class Cylinder extends Circle{
	private double height;
	public Cylinder() {
		super();
		height=0;
	}
	public Cylinder(double radius) {
		super(radius);height=0;
	}
	public Cylinder(double radius,double height) {
		super(radius);
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	@Override
	public double getArea() {
		return 2*App.PI*super.getRadius()*height;
	}
	public double getVolume() {
		return App.PI*super.getRadius()*super.getRadius()*height;
	}
	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", getHeight()=" + getHeight() + ", getArea()=" + getArea()
				+ ", getVolume()=" + getVolume() + ", getColor()=" + getColor() + ", getRadius()=" + getRadius()+"]";
	}
	
}
