package Client;

import abstractFactory.gui.service.GUI;
import abstractFactory.uiElements.service.Button;
import abstractFactory.uiElements.service.CheckBox;

public class Client {
	
	Button button;
	CheckBox checkbox;
	
	public Client(GUI gui) {
		this.button = gui.createButton();
		this.checkbox = gui.createCheckBox();
	}
	
	public void performActions() {
		button.clickBotton();
		checkbox.tickCheckBox();
	}
	
}
