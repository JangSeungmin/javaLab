package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class D extends A {
	public D () {
		this.field = "value";
		this.method(); // 자식 클래스에서 접근을 허용한다
		
	}
}
