package sec13.exam02_constructor_access_package1;

public class B {
	public B() {
		A a1 = new A(true); // public
		A a2 = new A(1); // default 접근제한자는 같은 패키지내에서 접근 가능
		//A a3 = new A("문자열"); // X
	}
}