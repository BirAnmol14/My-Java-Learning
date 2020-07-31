package demo1.view;

import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

import demo1.model.Model;
//For front-end code
//Always imports the back-end classes
public class UI extends JFrame{
	private Model model;
	public UI(Model model) throws HeadlessException{
		super("MVC-demo");
		this.model=model;
	}
	public void buildButton(){
		JFrame f=new JFrame();//creating instance of JFrame  

		JButton b=new JButton("click");//creating instance of JButton  
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		          
		f.add(b);//adding button in JFrame  
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible
	}
}
/*Any representation of information such as a chart, 
 * diagram or table.
 *  Multiple views of the same information are possible, 
 *  such as a bar chart for management and a tabular view for accountants.
 */
