package abstractFactory.gui.service.impl;

import abstractFactory.gui.service.GUI;
import abstractFactory.uiElements.service.Button;
import abstractFactory.uiElements.service.CheckBox;
import abstractFactory.uiElements.service.impl.DarkButton;
import abstractFactory.uiElements.service.impl.DarkCheckBox;

public class DarkGUI implements GUI{

	@Override
	public Button createButton() {
		return new DarkButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new DarkCheckBox();
	}
}
