package sec08.exam02_return;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("������ �ֽ��ϴ�.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas �ܷ� : " + gas + ")");
				gas -=1;
			}else {
				System.out.println("����ϴ�.(gas �ܷ� : " + gas + ")");
				return;
			}
		}
	}
}
