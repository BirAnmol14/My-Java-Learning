package sumDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Adder3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ui3 a=new Ui3();
	}

}

class Ui3 extends JFrame {
	Ui3() {
		JButton button = new JButton("Find Sum");
		JButton button1 = new JButton("Find Difference");
		JButton clr = new JButton("Clear");
		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		t1.setSize(40, 40);
		t2.setSize(40, 40);
		JLabel label = new JLabel("Result: " + 0);
		this.add(t1);
		this.add(t2);
		this.add(button);
		this.add(button1);
		this.add(clr);
		this.add(label);
		
		button.addActionListener((ActionEvent e) -> {
			try {
				int i = Integer.parseInt(t1.getText());
				int j = Integer.parseInt(t2.getText());
				int k = i + j;
				label.setText("" + i + " + " + j + " = " + k);
			} catch (NumberFormatException err) {
				label.setText("Invalid input");
			} finally {
//				t1.setText("");
//				t2.setText("");
			}
		});
		// Action Listener is an interface
		button1.addActionListener((ActionEvent e) -> {
			try {
				int i = Integer.parseInt(t1.getText());
				int j = Integer.parseInt(t2.getText());
				int k = i - j;
				label.setText("" + i + " - " + j + " = " + k);
			} catch (NumberFormatException err) {
				label.setText("Invalid input");
			} finally {
//				t1.setText("");
//				t2.setText("");
			}

		});
		clr.addActionListener(e->{
			t1.setText("");
			t2.setText("");
			label.setText("");
		});
		this.setLayout(new FlowLayout());
		this.setSize(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
