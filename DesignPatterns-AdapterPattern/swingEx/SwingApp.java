package swingEx;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class SwingApp {
	//Not really the adapter pattern
	//As the class WindowAdapter implements the WindowListerner interface
	//it just provides code for the implementation without bridging 2 implementations
	//Anonymous class here allows overriding of the implementation
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		//Adapter class
		f.addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {
				System.out.println("Window opened");
			}
		});
	}

}
