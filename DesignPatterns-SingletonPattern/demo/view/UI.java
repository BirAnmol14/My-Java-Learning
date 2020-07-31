package demo.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import demo.model.Database;
import demo.model.Model;
//For front-end code
//Always imports the back-end classes
public class UI extends JFrame implements ActionListener{
	private JButton button;
	private JButton but2;
	private Model model;
	private CustomListener listener;
	public UI(Model model) throws HeadlessException{
		super("MVC-demo");
		this.model=model;
		button=new JButton("Click Me!");
		setLayout(new GridBagLayout());
		GridBagConstraints gc=new GridBagConstraints();
		gc.anchor=GridBagConstraints.CENTER;
		gc.gridx=1;
		gc.gridy=1;
		gc.weightx=1;
		gc.weighty=1;
		gc.fill=GridBagConstraints.NONE;
		add(button,gc);
		gc.anchor=GridBagConstraints.CENTER;
		gc.gridx=1;
		gc.gridy=2;
		gc.weightx=1;
		gc.weighty=1;
		gc.fill=GridBagConstraints.NONE;
		but2=new JButton("BYE!!!");
		add(but2,gc);
		button.addActionListener(this);
		but2.addActionListener(this);
		//You Can Use Anonymous Class  also
		setSize(600,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		Database db=Database.getInstance();
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				db.connect();
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				db.disconnect();
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
		fireMyAction(e);
	}
	public void setMyListener(CustomListener ref) {
				listener=ref;
	}
	private void fireMyAction(ActionEvent e) {
		if(listener!=null) {
			listener.MyAction(new DataEvent(e,button,but2));
		}
	}
}
/*Any representation of information such as a chart, 
 * diagram or table.
 *  Multiple views of the same information are possible, 
 *  such as a bar chart for management and a tabular view for accountants.
 */
