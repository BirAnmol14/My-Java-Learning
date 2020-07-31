public class student extends person{
	public int rollnum;
	public student(String name,int age,double income,int rollnum)
	{
		super(name,age,income);
		this.rollnum=rollnum;
	}
	//You cannot access the income here
	public void hide_name() {
		String hn="";
		for(int i=0;i<name.length();i++) {
			hn+='*';
		}
		System.out.println(hn);
	}
	public int age_5() {
		return age+5;
	}
}