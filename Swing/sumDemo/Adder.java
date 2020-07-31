package sumDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Adder {

	public static void main(String[] args) {
		Ui a=new Ui();

	}

}
class Ui extends JFrame{
	Ui(){
		JButton button=new JButton("Find Sum");
		JButton button1=new JButton("Find Difference");
		JTextField t1=new JTextField(20);
		JTextField t2=new JTextField(20);
		
		JLabel label=new JLabel("Result: "+0);
		this.add(t1);
		this.add(t2);
		this.add(button);
		this.add(button1);
		this.add(label);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				int i=Integer.parseInt(t1.getText());
				int j=Integer.parseInt(t2.getText());
				int k=i+j;
				label.setText(""+i+" + "+j+" = "+k);
				}catch(NumberFormatException err){
					label.setText("Invalid input");
				}finally {
					t1.setText("");
					t2.setText("");
				}
			}
		});
		//Action Listener is an interface
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int i=Integer.parseInt(t1.getText());
					int j=Integer.parseInt(t2.getText());
					int k=i-j;
					label.setText(""+i+" - "+j+" = "+k);
					}catch(NumberFormatException err){
						label.setText("Invalid input");
					}finally {
						t1.setText("");
						t2.setText("");
					}
				
			}
		});
		this.setLayout(new FlowLayout());
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
