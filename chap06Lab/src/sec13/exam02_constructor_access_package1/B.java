package sec13.exam02_constructor_access_package1;

public class B {
	public B() {
		A a1 = new A(true); // public
		A a2 = new A(1); // default ���������ڴ� ���� ��Ű�������� ���� ����
		//A a3 = new A("���ڿ�"); // X
	}
}