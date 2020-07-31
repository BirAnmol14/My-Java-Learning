import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		//FIFO mechanism-> First in first out mechanism
		// head<-(oooooooooooooooooooo)<-tail added from tail removed from head
		Queue<Integer>q1=new ArrayBlockingQueue<Integer>(3);//3 is the number of elements you want in queue
		q1.add(2);
		q1.add(5);
		q1.add(-5);
		try {
			q1.add(9);
		}catch(Exception e) {
			System.out.println("You tried to add too many items to the queue....");
		}
		System.out.println("Queue has:");
		for(Integer i:q1) {
			System.out.println(i);
		}
		//q1.element() returns head of the queue but throws an exception if the queue is not empty
		System.out.println("Head of the queue: "+q1.peek());//peek does not throw any such exception...., returns null if the queue is empty
		System.out.println("------------------------------------------------");
		Integer value=q1.remove();
		System.out.println(value+" is removed from the queue");
		System.out.println("Queue has:");
		for(Integer i:q1) {
			System.out.println(i);
		}
		System.out.println("------------------------------------------------");
		Queue<Integer>q2=new ArrayBlockingQueue<Integer>(3);//3 is the number of elements you want in queue
		q2.offer(2);
		q2.offer(5);
		q2.offer(-5);
		q2.offer(10);
		System.out.println(q2.toString());
		//Throws no exception even if you try to add more items than the permitted size of the queue
		if(q2.offer(90)==false) {
			System.out.println("Failed to add item");
		}
			q2.poll();
			System.out.println(q2);
			q2.poll();
			System.out.println(q2);
			q2.poll();
			System.out.println(q2);
			q2.poll();
			System.out.println(q2);
			//No exception even if you try to remove more items than required
			
	}

}
