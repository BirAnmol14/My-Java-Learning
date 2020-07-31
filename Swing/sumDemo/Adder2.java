package sumDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Adder2 {

	public static void main(String[] args) {
		Ui2 a = new Ui2();

	}

}

class Ui2 extends JFrame implements ActionListener {
	JButton button;
	JButton button1;
	JTextField t1;
	JTextField t2;
	JLabel label;

	Ui2() {
		button = new JButton("Find Sum");
		button1 = new JButton("Find Difference");
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t1.setSize(40, 40);
		t2.setSize(40, 40);
		label = new JLabel("Result: " + 0);
		this.add(t1);
		this.add(t2);
		this.add(button);
		this.add(button1);
		this.add(label);
		button.addActionListener(this);
		button1.addActionListener(this);
		this.setLayout(new FlowLayout());
		this.setSize(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton && button != null && button1 != null) {
			JButton tmp = (JButton) e.getSource();
			if (tmp == button) {
				try {
					int i = Integer.parseInt(t1.getText());
					int j = Integer.parseInt(t2.getText());
					int k = i + j;
					label.setText("" + i + " + " + j + " = " + k);
				} catch (NumberFormatException err) {
					label.setText("Invalid input");
				} finally {
					t1.setText("");
					t2.setText("");
				}
			} else if (tmp == button1) {
				try {
					int i = Integer.parseInt(t1.getText());
					int j = Integer.parseInt(t2.getText());
					int k = i - j;
					label.setText("" + i + " - " + j + " = " + k);
				} catch (NumberFormatException err) {
					label.setText("Invalid input");
				} finally {
					t1.setText("");
					t2.setText("");
				}
			}
		}

	}
}
