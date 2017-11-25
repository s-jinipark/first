package testJava.vol1.ch08;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = null;
		
		// 3
		RemoteControl.changeBattery();
		
		rc = new Television();
		
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();

		rc.turnOn();
		rc.turnOff();
		
		// 2
		rc.setMute(true);
	}

}
