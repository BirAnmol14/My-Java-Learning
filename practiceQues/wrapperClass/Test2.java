package wrapperClass;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=10;
		Integer j=20;
		System.out.println(i);
		System.out.println(i.intValue());
		System.out.println(j);
		System.out.println(j.intValue());
		Integer k=new Integer(i.intValue()+j.intValue());
		Integer k2=k+i+j;
		System.out.println(k2);
	}

}
