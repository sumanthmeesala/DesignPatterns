package abstractFactory.gui.service.impl;

import abstractFactory.gui.service.GUI;
import abstractFactory.uiElements.service.Button;
import abstractFactory.uiElements.service.CheckBox;
import abstractFactory.uiElements.service.impl.LightButton;
import abstractFactory.uiElements.service.impl.LightCheckBox;

public class LightGUI implements GUI{

	@Override
	public Button createButton() {
		return new LightButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new LightCheckBox();
	}
	
}
