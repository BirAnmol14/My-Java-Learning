package demo1.controller;

import demo1.model.Model;
import demo1.view.UI;

//for business logic
//Hears and instructs both model and view
public class Controller {
	private UI view;private Model model;
	public Controller(Model model,UI view) {
		this.model=model;this.view=view;
	}
}
/*
 * Accepts input and converts it to commands for the model or view
 */