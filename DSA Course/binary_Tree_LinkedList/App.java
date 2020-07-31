package binary_Tree_LinkedList;

public class App {

	public static void main(String[] args) {
		BT t1=new BT();
		t1.insert(1);
		t1.insert(2);
		t1.insert(3);
		t1.insert(4);
		System.out.println("Level Order:");
		t1.level_order();
		System.out.println("\nPre-Order");
		t1.pre_order();
		System.out.println("\nIn-Order");
		t1.in_order();
		System.out.println("\nPost-order");
		t1.post_order();
		System.out.println("");
		t1.clear();
	}

}
