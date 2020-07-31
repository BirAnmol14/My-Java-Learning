public class app {

	public static void main(String[] args) {
		person p1=new person("Bir Anmol");
		machine m1=new machine();
		p1.introduce();
		m1.showinfo();
		p1.showinfo();
		robot r1=new robot("Singh",1);
		r1.introduce();
		r1.moreinfo();
	}
}
