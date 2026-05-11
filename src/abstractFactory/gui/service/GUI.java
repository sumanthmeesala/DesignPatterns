package abstractFactory.gui.service;

import abstractFactory.uiElements.service.Button;
import abstractFactory.uiElements.service.CheckBox;

public interface GUI {
	
	Button createButton();
	CheckBox createCheckBox();
	
}
