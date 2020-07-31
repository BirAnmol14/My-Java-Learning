package greedy_algo;

import java.util.Arrays;

public class Activity implements Comparable<Activity>{
	private String name;
	private int start;
	private int end;
	public Activity(String name,int start,int end) {
		this.name=name;
		this.start=start;
		this.end=end;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public static void main(String[] args) {
		Activity [] arr=new Activity[6];
		arr[0]=new Activity("A1", 0,6);
		arr[1]=new Activity("A2", 3,4);
		arr[2]=new Activity("A3", 1,2);
		arr[3]=new Activity("A4", 5,8);
		arr[4]=new Activity("A5", 5,7);
		arr[5]=new Activity("A6", 8,9);
		System.out.println("Unsolved:");
		for(Activity a:arr) {
			System.out.println(a);
		}
		Arrays.sort(arr);//QUICK SORT->nlogn
		//Finding solution in O(n)
		int count=0;
		System.out.println("Solved the optimal solution(Maximum activities that can be done by one person):");
		Activity prev=arr[0];
		count++;
		System.out.println(prev);
		for(int i=1;i<arr.length;i++) {
			if(prev.getEnd()<=arr[i].getStart()) {
				prev=arr[i];
				System.out.println(prev);
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Override
	public String toString() {
		return "Activity [name=" + name + ", start=" + start + ", end=" + end + "]";
	}
	@Override
	public int compareTo(Activity o) {
		if(this.end<=o.end) {
			return -1;
		}else if(this.end>o.end) {
			return 1;
		}
		return 0;
	}
	
}
