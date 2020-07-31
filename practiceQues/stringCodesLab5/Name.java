package stringCodesLab5;

import java.util.StringTokenizer;

public class Name {
	private String fname;
	private String mname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public String getMname() {
		return mname;
	}
	public String getLname() {
		return lname;
	}
	public String getName() {
		return fname+" "+mname+" "+lname;
	}
	public Name(String name) {
		StringTokenizer str1=new StringTokenizer(name,";,");
		String [] tmp=new String[3];int i=0;
		boolean comma=false;
		if(name.contains(",")) {
			comma=true;
		}
		while(str1.hasMoreTokens()) {
			tmp[i]=str1.nextToken();
			i++;
		}
		if(comma) {
			fname=tmp[0];
			mname=tmp[1];
			lname=tmp[2];
		}
		else {
			lname=tmp[0];
			mname=tmp[1];
			fname=tmp[2];
		}
		
	}
	@Override
	public String toString() {
		return "Name: " + fname +" "+ mname + " "+ lname;
	}
}
