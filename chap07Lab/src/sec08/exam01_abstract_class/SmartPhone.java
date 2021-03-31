package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {

	// 생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// 추상메소드를 재정의하여 일반 메소드로 만든다.
	@Override
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	// 메소드 
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
