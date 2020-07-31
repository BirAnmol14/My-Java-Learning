package queue_Array_implementation;

public class Linear {
	//Problem is thst once used space cannot be reused
	public static void main(String[] args) {
		Linear_queue q=new Linear_queue(5);
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
		q.clear();
	}

}
class Linear_queue{
	private int [] arr;
	private int f;
	private int r;
	public Linear_queue(int size){
		arr=new int[size];
		f=0;
		r=0;
	}
	public void enque(int data) {
		if(arr==null) {
			System.out.println("Queue Does Not Exist");
			return;
		}
		if(r>=0&&r<arr.length) {
		arr[r]=data;
		r++;
		return ;
		}
		System.out.println("Overflow");
	}
	public void deque() {
		if(arr==null) {
			System.out.println("Queue Does Not Exist");
			return;
		}
		if(f<r&&f<arr.length&&f>=0) {
			f++;return;
		}
		System.out.println("UnderFlow");
	}
	public void display() {
		if(arr==null) {
			System.out.println("Queue does not exist");return;
		}
		if(f==r) {
			System.out.println("Queue is Empty");return;
		}
		for(int i=f;i<r;i++) {
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
}