

import demo.controller.Controller;

import javax.swing.SwingUtilities;

import demo.model.Model;
import demo.view.UI;
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
		view.setMyListener(controller);
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
