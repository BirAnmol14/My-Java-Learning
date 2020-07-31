package Shopping;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.DataBufferDouble;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class App extends JFrame {

	public static void main(String[] args) {
		new App();

	}
	
	App () {
		JCheckBox [] arr=new JCheckBox[7];
		Double [] price=new Double [7];
		for(int i=0;i<price.length;i++) {
			
			price[i]=new Random().nextInt(500)*1.34+500;
			
		}
		arr[0] = new JCheckBox("TShirt");
		arr[1] = new JCheckBox("Trousers");
		arr[2] = new JCheckBox("Shirt");
		arr[3]= new JCheckBox("Blazer");
		arr[4]= new JCheckBox("Sweater");
		arr[5] = new JCheckBox("Skirt");
		arr[6] = new JCheckBox("Bir Anmol");
		JButton b1 = new JButton("Next");
		for(JCheckBox c:arr) {
			this.add(c);
		}
		this.add(b1);
		this.setSize(600,600);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				for(int i=0;i<arr.length;i++) {
					if(arr[i].isSelected()) {
						Database.getMap().put(arr[i].getText(),price[i]);
					}
				}
				new Compute();
				dispose();}catch (Exception err) {
					// TODO: handle exception
					System.out.println("Error here");
				}
				
			}
		});
	}

}
class Compute extends JFrame{
	Compute(){
		int count = Database.getMap().size();
		JLabel label [] = new JLabel [count];
		JTextField tf[] = new JTextField[count];
		int i=0;
		for (String key:Database.getMap().keySet()) {
			label[i]=new JLabel();
			tf[i]=new JTextField(10);
			label[i].setText(key);
			this.add(label[i]);
			this.add(tf[i]);
			i++;
		}
		JButton b = new JButton ("Compute Price");
		JLabel display = new JLabel("");
		this.add(b);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent e) {
				try {
					double total=0.0;
					for (int i=0;i<count;i++) {
						double price=Database.getMap().get(label[i].getText());
						total+=price*Integer.parseInt(tf[i].getText());
					}
					display.setText("Final Bill Amount= $"+Math.round(total));
				}catch(NumberFormatException err) {
					display.setText("You did not enter valid Integer");
				}
			}
		});
		
		this.add(display);
		this.setSize(600,600);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}