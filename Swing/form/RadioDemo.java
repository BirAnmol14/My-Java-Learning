package form;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.xml.crypto.Data;

public class RadioDemo extends JFrame{
	private JTextField name;
	private JButton submit;
	private JLabel label;
	private JRadioButton but1;
	private JRadioButton but2;
	private JCheckBox chk1;
	private JPasswordField pass;
	private JButton gtm;
	public static void main(String[] args) {
		RadioDemo a=new RadioDemo();
	}
	RadioDemo(){
		gtm=new JButton("Goto Main");
		pass=new JPasswordField(25);
		name=new JTextField(25);
		name.setText("");
		submit=new JButton("Submit");
		label=new JLabel("");
		but1=new JRadioButton("Male");
		but2=new JRadioButton("Female");
		chk1=new JCheckBox("Agree to T&C");
		ButtonGroup bg=new ButtonGroup();
		bg.add(but1);
		bg.add(but2);
		gtm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Thread.sleep(500);
					dispose();
					MultiFrame.main(null);
				}catch (Exception err) {
					err.printStackTrace();
				}
				
			}
		});
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(chk1.isSelected()) {
				String tmp=name.getText();
				if(but1.isSelected()) {
					boolean ok=true;
					Map<String,char[]> m=DataBase.getData();
					for(String key:m.keySet()) {
						if(key.equals(tmp)) {
							ok=false;break;
						}
					}
					if(ok) {
					m.put(name.getText(), pass.getPassword());
					label.setText("Welcome Mr."+tmp);
					}else {
						label.setText("Please enter another UserName");
					}
				}else if(but2.isSelected()) {
					boolean ok=true;
					Map<String,char[]> m=DataBase.getData();
					for(String key:m.keySet()) {
						if(key.equals(tmp)) {
							ok=false;break;
						}
					}
					if(ok) {
					m.put(name.getText(), pass.getPassword());
					label.setText("Welcome Mrs."+tmp);
					}else {
						label.setText("Please enter another UserName");
					}
				}
			}else {
				label.setText("Kindly Agree to T&Cs");
			}
			}
		});
		this.add(new JLabel("UserName:"));
		this.add(name);
		this.add(new JLabel("Password:"));
		this.add(pass);
		this.add(but1);
		this.add(but2);
		this.add(chk1);
		this.add(submit);
		this.add(label);
		this.add(gtm);
		this.setSize(300,300);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
