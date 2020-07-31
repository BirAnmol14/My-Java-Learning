package demo1;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ui extends JFrame{
	Ui(){
		this.setLayout(new GridLayout());
		JLabel label=new JLabel("Hello World");
		label.setSize(200, 200);
		this.add(label);
		this.setSize(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Ui a=new Ui();
	}

}
