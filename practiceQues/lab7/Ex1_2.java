package lab7;
class Circle{
	private int rad;
	public Circle(int radius) {
		rad=radius;
	}
	public double area() {
		return rad*rad;
	}
}
public class Ex1_2 {
	
	public Circle getCircle(int radius) {
		return new Circle(radius);
	}

	public static void main(String[] args) {
		Ex1_2 p= new Ex1_2();
		Circle w = p.getCircle(10);
		System.out.println(w.area());
	}

}
