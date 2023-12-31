package Devices;
public class Phone extends Device {
	

public void makeCall() {
		battery-=5;
		status();
	}
	


public void  playGame() {

		battery-=20;
		status();
	}
	

public void charge() {

		battery+=50;
		status();
	
}


	
}
