package sec05.exam05_instanceof;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus(); // Vehicle �������̽��� ������ü
		Taxi taxi = new Taxi(); // Vehicle �������̽��� ������ü
		
		// �������̽� Ÿ������ �������� �����Ѵ�.
		driver.driver(bus); // �ڵ�����ȯ, Vehicle vehicle = bus
		driver.driver(taxi);
		
	}

}
