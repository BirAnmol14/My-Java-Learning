package demo.controller;

import javax.swing.JButton;

import demo.model.Model;
import demo.view.CustomListener;
import demo.view.UI;
import demo.view.DataEvent;

//for business logic
//Hears and instructs both model and view
public class Controller implements CustomListener{
	private UI view;private Model model;
	public Controller(Model model,UI view) {
		this.model=model;this.view=view;
	}
	@Override
	public void MyAction(DataEvent d) {
		JButton source=(JButton)d.getE().getSource();
		if(source==d.getButton()) {
			System.out.println("Hello There");}
			else if(source==d.getBut2()) {
				System.out.println("BYE");
			}
			else {
				System.out.println("Some Other Button");
			}
	}
	
}
/*
 * Accepts input and converts it to commands for the model or view
 */
//Controller will be observer
// View As The Subject