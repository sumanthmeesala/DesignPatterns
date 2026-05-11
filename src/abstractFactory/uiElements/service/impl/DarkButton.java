package abstractFactory.uiElements.service.impl;

import abstractFactory.uiElements.service.Button;

public class DarkButton implements Button{

	@Override
	public void clickBotton() {
		System.out.println("This is the Dark button");
	}

}
