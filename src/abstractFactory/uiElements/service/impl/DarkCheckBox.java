package abstractFactory.uiElements.service.impl;

import abstractFactory.uiElements.service.CheckBox;

public class DarkCheckBox implements CheckBox {

	@Override
	public void tickCheckBox() {
		System.out.println("This is the Dark checkbox");
	}

}
