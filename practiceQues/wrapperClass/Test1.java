package wrapperClass;

public class Test1 {
	public static void main(String [] args) {
		Integer i=new Integer(10); 
		Integer j=new Integer(20);
		System.out.println(i.intValue());
		System.out.println(i);
		System.out.println(j.intValue());
		System.out.println(j);
		Integer k=new Integer(i.intValue()+j.intValue());
		Integer k2=i+j+k;
		System.out.println(k2);
	}
}
