package tries;

public class App {

	public static void main(String[] args) {
		Trie t=new Trie();
		t.insert("bir");
		t.insert("bie");
		t.insert("bira");
		t.insert("anmol");
		t.print_all();
		System.out.println(t.find("bira"));
		System.out.println(t.find("bir"));
		System.out.println(t.find("anm"));
		System.out.println(t.find("xvvb"));
		System.out.println(t.find("anmol"));
		System.out.println(t.find("ba"));
		
	}

}
