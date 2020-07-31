package backtracking;

import java.util.Vector;

public class Exercise {

	public static void main(String[] args) {
		findAnagrams("god");
		Vector<String> dict = new Vector<String>();
		dict.add("cat");
		dict.add("cats");
		dict.add("and");
		dict.add("sand");
		dict.add("dog");
		System.out.println();
		genString("catsanddog", dict);
	}

	public static void findAnagrams(String s) {
		per(s.toCharArray(), new Vector<Character>());
	}

	private static void per(char[] arr, Vector<Character> used) {
		if (arr.length == used.size()) {
			System.out.println(used);
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (!used.contains(arr[i])) {
				used.add(arr[i]);
				per(arr, used);
				used.remove(used.size() - 1);
			}
		}
	}

	public static void genString(String s, Vector<String> dict) {
		solve(0, s, dict, new Vector<String>());
	}

	private static void solve(int index, String s, Vector<String> dict, Vector<String> used) {
		if (index >= s.length()) {
			System.out.println(used);
			return;
		}
		int i = index;

		for (String s1 : dict) {
			if (!used.contains(s1)) {
				boolean matches = true;
				for (int j = 0; j < s1.length(); j++) {
					if (s.charAt(j + i) != s1.charAt(j)) {
						matches = false;
						break;
					}
				}
				if (matches) {
					used.add(s1);
					solve(i + s1.length(), s, dict, used);
					used.remove(used.size() - 1);
				}
			}
		}
	}

}
