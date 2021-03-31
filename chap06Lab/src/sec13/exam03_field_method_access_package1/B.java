package sec13.exam03_field_method_access_package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1; // public O
		a.field2 = 1; // default O
		//a.field3 = 1; // private X
		
		a.method1();
		a.method2();
		//a.method3();
		
	}
}
