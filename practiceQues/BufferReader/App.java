package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		String name=null;
		try {
			System.out.println("Enter your name: ");
			name=br.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Welcome! "+ name);
	}

}
