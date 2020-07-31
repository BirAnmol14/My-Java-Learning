package stringCodesLab5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n1=new Name("Bir,Anmol,Singh");
		System.out.println(n1);
		System.out.println("------------------------");
		Student s1=new Student(new Name("Singh;Anmol;Bir"),19);
		System.out.println(s1);
		Student s2=new Student(n1,25);
		System.out.println(s2);
		Student s3=new Student(new Name("a,b,c"),19);
		System.out.println(s3);
		System.out.println("------------------------");
		Studentlist l1=new Studentlist();
		l1.addStudent(s1);l1.addStudent(s2);l1.addStudent(s3);
		Student[] s=l1.getStudentWithAge(19);
		for(Student z:s) {
			System.out.println(z);
		}
		System.out.println("------------------------");
		s=l1.getStudentWithLastName("Singh");
		for(Student z:s) {
			System.out.println(z);
		}
	}

}
