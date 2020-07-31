import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String>{
	private LinkedList<String> urls=new LinkedList<String>();
	public UrlLibrary() {
		urls.add("https://www.youtube.com");
		urls.add("https://www.google.com");
		urls.add("https://www.facebook.com");
		urls.add("https://www.instagram.com");
		urls.add("https://www.bitspilani.edu");
		urls.add("https://www.iitd.edu.in");
	}
	@Override
	public Iterator<String> iterator() {
		
		return urls.iterator();
	}
}
