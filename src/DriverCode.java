import Client.Client;
import abstractFactory.gui.service.impl.DarkGUI;
import abstractFactory.gui.service.impl.LightGUI;

public class DriverCode {
	
	public static void main(String[] args) {
		Client sinUpClient = new Client(new LightGUI());
		sinUpClient.performActions();
		
		Client loginClient = new Client(new DarkGUI());
		loginClient.performActions();
		
	}
	
}
