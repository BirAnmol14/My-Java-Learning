package queue_Array_implementation;

public class Circular_queue{
	public static void main(String[] args) {
		Circular_q q=new Circular_q(5);
		q.enque(1);
		q.display();
		q.enque(2);
		q.display();
		q.enque(3);
		q.display();
		q.deque();
		q.display();
		q.deque();
		q.display();
		q.deque();
		q.display();
		q.enque(7);
		q.display();
		q.enque(90);
		q.display();
		q.enque(67);
		q.display();
		q.deque();
		q.display();
		q.deque();
		q.display();
		q.deque();
		q.display();
		for(int i=0;i<6;i++) {
			q.enque((i+1)*25);
			q.display();
		}
		q.clear();
	}

}
class Circular_q{
	private int [] arr;
	private int f;
	private int r;
	private int count;
	public Circular_q(int size){
		arr=new int[size];
		f=0;
		r=0;
		count=0;
	}
	public void enque(int data) {
		if(arr==null) {
			System.out.println("Queue Does Not Exist");
			return;
		}
		if(count==arr.length) {
			System.out.println("OverFlow");return;
		}
		arr[r]=data;
		r=(r+1)%(arr.length);
		count++;
		return ;
	}
	public void deque() {
		if(arr==null) {
			System.out.println("Queue Does Not Exist");
			return;
		}
		if(count==0) {
			System.out.println("UnderFlow");return;
		}
		
		f=(f+1)%(arr.length);count--;return;
	}
	public void display() {
		if(arr==null) {
			System.out.println("Queue does not exist");return;
		}
		if(f==r&&count==0) {
			System.out.println("Queue is Empty");return;
		}
		if(f<r) {
		for(int i=f;i<r;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");return;
		}
		for(int i=f;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		for(int i=0;i<r;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
	}
	public void clear() {
		arr=null;
	}
	public int peek() {
		if(arr==null) {
			return Integer.MIN_VALUE;
		}
		return arr[f];
	}
	public boolean isEmpty() {
		if(arr==null) {
			return true;
		}
		if(count==0) {
			return false;
		}
		return true;
	}
	public boolean isFull() {
		if(arr==null) {
			return false;
		}
		if(count==arr.length) {
			return true;
		}
		return false;
	}
}