package stringCodesLab5;

public class Studentlist {
	public static Student[] list=new Student[3];
	public static int count=0;
	public static void addStudent(Student std) {
		if(count>=10) {
			return;
		}
		list[count]=std;
		count++;
	}
	public static Student[] getStudentWithAge(int age) {
		int c=0;
		for(Student s:list) {
			if(s.getAge()==age) {
				c++;
			}
		}
		if(c!=0) {
		Student [] tmp=new Student[c];
		int i=0;
		for(Student s:list) {
			if(s.getAge()==age) {
				tmp[i]=s;
				i++;
			}
		}
		return tmp;
		}
		return null;
	}
	public static Student[] getStudentWithLastName(String lname) {
		int c=0;
		for(Student s:list) {
			if(s.getName().getLname().equals(lname)) {
				c++;
			}
		}
		if(c!=0) {
		Student [] tmp=new Student[c];
		int i=0;
		for(Student s:list) {
			if(s.getName().getLname().equals(lname)) {
				tmp[i]=s;
				i++;
			}
		}
		return tmp;
		}
		return null;
	}
}
