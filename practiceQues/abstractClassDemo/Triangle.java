package abstractClassDemo;

public class Triangle extends Shape{
		private double base;
		private double height;
		public Triangle(String color,double height,double base) {
			super(color);
			this.base=base;
			this.height=height;
		}
		@Override
		public String toString() {
			return "Triangle [base=" + base + ", height=" + height + ", toString()=" + super.toString() + ", getArea()="
					+ getArea() + "]";
		}
		@Override
		public double getArea() {
			return 0.5*base*height;
		}
}
