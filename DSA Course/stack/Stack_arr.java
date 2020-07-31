package stack;

import java.util.Random;

public class Stack_arr {
	public static void main(String[] args) {
		array_stack s1=new array_stack(5);
		Random r=new Random();
		for(int j=0;j<=s1.len();j++) {
			s1.push(r.nextInt(101));
			s1.display();
		}
		int l=s1.len();
		for(int j=0;j<=l;j++) {
			s1.pop();
			s1.display();
		}
		s1.push(r.nextInt(11));
		s1.display();
		s1.push(r.nextInt(78));
		s1.display();
		System.out.println(s1.peek());
		s1.display();
	}
}
class array_stack{
	private int curr;
	private int size;
	private int[] arr;
	public array_stack(int size) {
		this.size=size;
		curr=-1;
		arr=new int[size];
	}
	public void push(int i) {
		if(arr==null) {
			System.out.println("Stack does not exist");
			return;
		}
		if(curr>=size-1) {
			System.out.println("OverFlow");
			return ; 
		}
		curr++;
		arr[curr]=i;
	}
	public int pop() {
		if(arr==null) {
			System.out.println("Stack does not exist");
			return Integer.MIN_VALUE;
		}
		if(curr==-1) {
			System.out.println("Underflow!");return Integer.MIN_VALUE;
		}
		curr--;return arr[curr+1]; 
	}
	public void display() {
		if(arr==null) {
			System.out.println("Stack does not exist");
			return;
		}
		if(curr==-1) {
			System.out.println("Empty");return;
		}
		for(int i=0;i<=curr;i++) {
			System.out.print(arr[i]+"\t");
		}System.out.println("");
	}
	public int len() {
		if(arr==null) {
			System.out.println("Stack does not exist");
			return Integer.MIN_VALUE;
		}
		return size;
	}
	public int peek() {
		if(arr==null) {
			System.out.println("Stack does not exist");
			return Integer.MIN_VALUE;
		}
		if(curr!=-1) {
			return arr[curr];
		}
		return Integer.MIN_VALUE;
	}
	public boolean isEmpty() {
		if(arr==null) {
			System.out.println("Stack does not exist");
			return true;
		}
		if(curr==-1) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(arr==null) {
			System.out.println("Stack does not exist");
			return false;
		}
		if(curr==size-1) {
			return true;
		}
		return false;
	}
	public void clear() {
		arr=null;
	}
}