package sec03.exam01_member_class_access;

public class A {
	//�ν��Ͻ� �ʵ�
	B field1 = new B();
	C field2 = new C();
	
	//�ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//�����޼ҵ�
	static void method2() {
		//B var1 = new B(); // �����޼ҵ忡�� �ν��Ͻ� ��� Ŭ������ ����� �� ����.
		C var2 = new C(); // ������ҵ忡 ���� ��� Ŭ������ ����� �� �ִ�.
	}
	
	
	//�ν��Ͻ� ��� Ʋ����
	class B{	
	}
	
	//���� ��� Ŭ����
	static class C {
	}
	
}
