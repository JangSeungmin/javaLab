package sec04.exam03_static_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {		
		RemoteControl.changeBattery();
		
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		
		rc.setMute(true);
	}

}
