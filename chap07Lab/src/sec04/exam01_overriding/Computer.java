package sec04.exam01_overriding;

public class Computer extends Calculator {
	//�޼ҵ� ������(method overriding)
	//������̼� : �����Ϸ����� �ڵ�(������ ����)�������� ��û�Ѵ�.
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ���� ");
		return Math.PI * r * r;
	}
	
	//@Override
	double areCircle(double r) {
		return 1.0;
	}
}
