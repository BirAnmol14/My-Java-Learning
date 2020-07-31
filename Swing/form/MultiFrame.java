package form;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;


public class MultiFrame {
	public static void main(String[] args) {
		new ABC();
	}
}

class ABC extends JFrame implements ActionListener {

	JButton but1 = new JButton("Click to Precced to Login Form");
	JButton but2 = new JButton("Click to Precced to SignUp Form");
	JProgressBar pgbar;
	boolean b1 = false;
	int i;

	ABC() {
		pgbar = new JProgressBar(0, 20);
		Timer t = new Timer(100, this);
		i = 0;
		this.add(but1);
		this.add(but2);
		but2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				b1 = false;
				t.start();
			}
		});
		but1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				b1 = true;
				t.start();
			}
		});
		this.add(pgbar);
		this.setSize(300, 300);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.i==10) {
			if(!b1) {
				dispose();
				new RadioDemo();
			}
			else if(b1) {
				dispose();
				new LoginPage();
			}
		}
		i++;
		pgbar.setValue(2*i);
	}

}