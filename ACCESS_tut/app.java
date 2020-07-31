public class app {

	public static void main(String[] args) {
		//Only name and roll number available as they were public and age as well as it was protected and in same package
		person p1=new person("Bir",20,1000000);
		student s1=new student("Anmol",19,0,261);
		System.out.println(p1.name+"\t"+s1.name+"\t"+s1.rollnum+"\t"+s1.age);
		p1.show_details();
		System.out.println(s1.age_5());
		s1.hide_name();
	}

}
