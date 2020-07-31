package demo.view;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class DataEvent {
	private ActionEvent e;
	private JButton button;
	private JButton but2;
	public DataEvent(ActionEvent e, JButton button, JButton but2) {
		this.e = e;
		this.button = button;
		this.but2 = but2;
	}
	public ActionEvent getE() {
		return e;
	}
	public JButton getButton() {
		return button;
	}
	public JButton getBut2() {
		return but2;
	}
}
