package binary_TREE_Array;

public class App {

	public static void main(String[] args) {
		BT_Array t1=new BT_Array(3);
		t1.add(1);
		t1.add(2);
		t1.add(3);
		System.out.println("Level: ");
		t1.level_order();
		System.out.println("\nPre: ");
		t1.pre_order();
		System.out.println("\nIn: ");
		t1.in_order();
		System.out.println("\nPost: ");
		t1.post_order();
		System.out.println("");
		System.out.println(t1.find(6));
		System.out.println(t1.find(3));
		t1.delete(1);
		t1.level_order();
		t1.add(1);
		System.out.println();
		t1.level_order();
		t1.clear();
	}

}
