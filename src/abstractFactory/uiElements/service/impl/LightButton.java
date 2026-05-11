package abstractFactory.uiElements.service.impl;

import abstractFactory.uiElements.service.Button;

public class LightButton implements Button {
	
	@Override
	public void clickBotton() {
		System.out.println("This is the light colot button");
	}
	
}
