package sec10.exam01_static_member;

public class Calculator {
	static double pi = 3.14159; // 정적필드. 메소드 영역에 생성
	
	static int plus(int x, int y) { // 정적 메소드
		return x + y;
	}
	
	int minus(int x, int y) { // 인스턴스 메소드, Heap 영역에 생성
		return x - y;
	}
}
