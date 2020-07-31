package queue_Linked_List_implementation;

public class App {

	public static void main(String[] args) {
		Linear_queue q=new Linear_queue();
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
