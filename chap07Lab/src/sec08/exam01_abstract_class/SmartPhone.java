package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {

	// ������
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// �߻�޼ҵ带 �������Ͽ� �Ϲ� �޼ҵ�� �����.
	@Override
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
	
	// �޼ҵ� 
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}

}
