package demo1;

import javax.swing.SwingUtilities;

import demo1.controller.Controller;
import demo1.model.Model;
import demo1.view.UI;
//Entry point to application
public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				runApp();
			}
			
		});
		
	}
	public static void runApp() {
		//Creates the GUI
		Model model=new Model();
		UI view=new UI(model);
		Controller controller=new Controller(model,view);
		view.buildButton();
	}
}
/*
 *Model–View–Controller (usually known as MVC) 
 *is a software design pattern
 *commonly used for developing user interfaces
 *which divides the related program logic
 *into three interconnected elements.
 *
 *USER uses the Controller which manipulates the Model and
 *the view updates itself based on the model
 *and this is what the USER sees
 */
