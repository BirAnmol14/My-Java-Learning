package form;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame {
	private JTextField name;
	private JButton submit;
	private JLabel label;
	private JButton gtm;
	private JPasswordField pass;

	public static void main(String[] args) {
		new LoginPage();
	}

	LoginPage() {
		gtm=new JButton("Go to Main");
		pass = new JPasswordField(25);
		name = new JTextField(25);
		name.setText("");
		submit = new JButton("Submit");
		label = new JLabel("");
		ButtonGroup bg = new ButtonGroup();
		gtm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Thread.sleep(500);
					dispose();
					MultiFrame.main(null);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nm=name.getText();
				char[] ps=pass.getPassword();
				boolean found=false;
				Map<String,char[]>m=DataBase.getData();
				for(String s:m.keySet()) {
					if(s.equals(nm)) {
						if(ps.length==m.get(s).length) {
							boolean same=true;
							for(int i=0;i<ps.length;i++) {
								if(ps[i]!=m.get(s)[i]) {
									same=false;	
									break;
								}
							}
							if(same) {
								found=true;break;
							}
						}
					}
				}
				if(found) {
					label.setText("Login Successful");
				}else {
					label.setText("Login Failed");
				}
			}
		});
		this.add(new JLabel("Name:"));
		this.add(name);
		this.add(new JLabel("Password:"));
		this.add(pass);
		this.add(submit);
		this.add(label);
		this.add(gtm);
		this.setSize(300, 300);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
