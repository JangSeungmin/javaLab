package sec09.exam01_instance_member;

public class Car {
	//�ʵ�
	String model;
	int speed;
	
	//������
	Car(String model){
		this.model = model;
	}
	
	//�޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;	// this.speed �� �ν��Ͻ� �ʵ��̴�.
	}
	
	void run() {
		for (int i = 0; i <= 50; i+=10) {
			this.setSpeed(i);System.out.println(this.model + "�� �޸��ϴ�. (�ü� " + this.speed + "km/h)");
		}
	}
}
