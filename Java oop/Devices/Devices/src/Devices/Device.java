package Devices;
public class Device  {
	protected int  battery =100 ;

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	public String stat(int ba) {
		
		return "the battary is ";
	}



	public void status() {
	System.out.println("the battay is "+battery);
	}
	
}
