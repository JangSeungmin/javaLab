package sec05.exam05_instanceof;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus(); // Vehicle 인터페이스의 구현객체
		Taxi taxi = new Taxi(); // Vehicle 인터페이스의 구현객체
		
		// 인터페이스 타입으로 다형성을 구현한다.
		driver.driver(bus); // 자동형변환, Vehicle vehicle = bus
		driver.driver(taxi);
		
	}

}
