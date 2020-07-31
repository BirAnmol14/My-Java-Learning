package textBasedAPP;

import java.util.ArrayList;
import java.util.StringTokenizer;

class code{
	private String text;
	public code(String text) {
		this.text=text;
	}
	public String[] Split() {
		StringTokenizer tk=new StringTokenizer(text,"#");
		String [] tmp=new String[tk.countTokens()];
		String [] words;
		int i=0;
		while(tk.hasMoreTokens()) {
			tmp[i]=tk.nextToken();
			i++;
		}
		int wc=0;
		for(String s:tmp) {
			String[] temp=s.split("\\s",0);
			wc+=temp.length;
		}
		words=new String[wc];
		int k=0;
		for(String s:tmp) {
			String[] temp=s.split("\\s",0);
			for(int h=0;h<temp.length;h++) {
				words[k]=temp[h];
				k++;
			}
		}
		return words;
	}
	public String[] UniqueLabels(String[] words) {
		String[]label;
		ArrayList<String> temp=new ArrayList<String>();
		for(String s:words) {
			if(temp.size()==0) {
				temp.add(s);
			}
			else {
				boolean present=false;
				for(String s1:temp) {
					if(s1.equalsIgnoreCase(s)) {
						present=true;
					}
				}
				if(!present) {
					temp.add(s);
				}
			}
		}
		label=new String[temp.size()];
		int i=0;
		for(String s:temp) {
			label[i]=s;
			i++;
		}
		return label;
	}
	public String[] count(String[] words,String[] label) {
		String [] freq=new String[label.length];
		for(int i=0;i<label.length;i++) {
			int c=0;
			for(String s:words) {
				if(s.equalsIgnoreCase(label[i])) {
					c++;
				}
			}
			freq[i]=String.valueOf(c);
		}
		return freq;
	}
	public void display(int n) {
		
		String[] words=Split();
		String[] label=UniqueLabels(words);
		String[] freq=count(words,label);
		if(n>label.length) {System.out.println("Enter Correct value");return;}
		for(int i=0;i<freq.length-1;i++) {
			for(int j=i+1;j<freq.length;j++) {
				if(Integer.parseInt(freq[i])<Integer.parseInt(freq[j])) {
					String temp=freq[i];
					freq[i]=freq[j];
					freq[j]=temp;
					String tlabel=label[i];
					label[i]=label[j];
					label[j]=tlabel;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(label[i]+" : "+freq[i]);
		}
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="abc def#def ghi#abc def#ABC def";
		System.out.println(test);
		System.out.println("----------------------");
		code c=new code(test);
		String[] arr=c.Split();
		for(String s:arr) {
			System.out.println(s);
		}
		System.out.println("----------------------");
		String[] labels=c.UniqueLabels(arr);
		for(String s:labels) {
			System.out.println(s);
		}
		System.out.println("----------------------");
		String[] count=c.count(arr, labels);
		for(String i:count) {
			System.out.println(i);
		}
		System.out.println("----------------------");
		c.display(2);
	}

}
