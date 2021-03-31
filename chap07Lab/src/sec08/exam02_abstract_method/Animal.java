package sec08.exam02_abstract_method;

public abstract class Animal {
//	추상클래스의 구성멤버
//	1. 필드
	public String kind;
	
//	2. 생성자
	
//	3. 추상메소드
	public abstract void sound();
	
//	4. 일반메소드
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
}
