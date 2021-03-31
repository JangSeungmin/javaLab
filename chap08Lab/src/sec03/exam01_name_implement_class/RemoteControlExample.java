package sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역변수 rc는 RemoteControl 인터페이스 타입이다.
		RemoteControl rc;
		rc = new Television(); // 인터페이스 변수 = 구현객체; 자동형변환
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		System.out.println("-------------------");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.turnOff();
	}

}
