package compDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class CompareAge implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		return s1.age-s2.age;
	}
}
class CompareCG implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		if(s1.cgpa>s2.cgpa) {
			return 1;
		}else if(s1.cgpa<s2.cgpa) {
			return -1;
		}
		return  0;
	}
}
class Student implements Comparable<Student>{
	String name;
	int age;
	float cgpa;
	public Student(String n,int a,float c) {
		name=n;
		age=a;
		cgpa=c;
	}
	@Override
	public int compareTo(Student s) {
		return name.compareTo(s.name);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", cgpa=" + cgpa + "]";
	}
	
}
public class App {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student("Bir",19,3.75f));
		list.add(new Student("Anmol",21,3.9f));
		list.add(new Student("Singh",17,4.0f));
		for(Student s:list) {
			System.out.println(s);
		}
		System.out.println("------------------");
		Collections.sort(list);
		for(Student s:list) {
			System.out.println(s);
		}
		System.out.println("------------------");
		Collections.sort(list,new CompareAge());
		for(Student s:list) {
			System.out.println(s);
		}
		System.out.println("------------------");
		Comparator<Student> c1=new CompareCG();
		Collections.sort(list,c1);
		for(Student s:list) {
			System.out.println(s);
		}
		System.out.println("------------------");
		Comparator<Student> c=new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int i=o1.compareTo(o2);
				if(i==0) {
					int j=o1.age-o2.age;
					if(j==0) {
						if(o1.cgpa>o2.cgpa) {
							return 1;
						}else if(o1.cgpa<o2.cgpa) {
							return -1;
						}
						return  0;
					}
					return j;
				}
				return i;
			}
									
							};
		Collections.sort(list,c);
		for(Student s:list) {
			System.out.println(s);
		}
		System.out.println("------------------");
	}

}
