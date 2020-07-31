package binary_search_tree_BST;

public class App {

	public static void main(String[] args) {
		BST t=new BST();
		t.add(10);
		t.add(5);
		t.add(20);
		t.add(15);
		System.out.println("Pre: ");
		t.pre_order();
		System.out.println("\nIn: ");
		t.in_order();
		System.out.println("\nPost: ");
		t.post_order();
		System.out.println("\nSearching: ");
		System.out.println(t.find(80));
		System.out.println(t.find(15));
		System.out.println("Height: "+t.height());
		t.clear();
	}

}
