package avl_TREE;

public class App {
	public static void main(String[] args) {
		Avl tree=new Avl();
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(10);
		tree.insert(5);
		tree.insert(3);
		tree.insert(4);
		tree.insert(50);
		tree.insert(60);
		tree.insert(70);
		tree.insert(65);
		tree.level_order();
		tree.delete(10);
		tree.level_order();
		System.out.println("60 is in tree: ");
		System.out.println(tree.find(60));
		System.out.println("100 is in tree: ");
		System.out.println(tree.find(100));
		
		tree.clear();
	}
}
