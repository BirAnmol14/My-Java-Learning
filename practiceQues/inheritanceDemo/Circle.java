package inheritanceDemo;

public class Circle {
	
	private double radius;
	private String color;
	public Circle() {
		radius=0;
		color="red";
	}
	public Circle(double radius) {
		this.radius=radius;
		color="red";
	}
	public Circle(double radius,String color) {
		this.color=color;
		this.radius=radius;
	}
	public String getColor() {
		return color;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return App.PI*radius*radius;
	}
}
