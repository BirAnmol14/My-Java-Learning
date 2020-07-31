package polymorphismDemo;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Rectangle("red",4,5);
		System.out.println(s1);
		s1=new Triangle("blue",3,4);
		System.out.println(s1);
		}

}
