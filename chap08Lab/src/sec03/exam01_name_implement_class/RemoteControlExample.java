package sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� rc�� RemoteControl �������̽� Ÿ���̴�.
		RemoteControl rc;
		rc = new Television(); // �������̽� ���� = ������ü; �ڵ�����ȯ
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
