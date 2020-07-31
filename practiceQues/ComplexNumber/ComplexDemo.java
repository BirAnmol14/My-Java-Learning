package ComplexNumber;

public class ComplexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex c1=new complex(1,1);
		System.out.println(c1);
		complex c2=new complex(2,2);
		System.out.println(c2);
		System.out.println(c1.divide(c2));
		complex c3=new complex(1.234);
		System.out.println(c3);
		complex c4=new complex(1,2,3,4,5);
		System.out.println(c4);
	}

}
