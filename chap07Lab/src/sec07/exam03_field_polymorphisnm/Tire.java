package sec07.exam03_field_polymorphisnm;

public class Tire {
	//�ʵ�
	public int maxRotation; // �ִ� ȸ����
	public int accumulatedRotation; //���� ȸ����
	public String location; // Ÿ�̾��� ��ġ
	
	//������
	public Tire(String location, int maxRaotation) {
		this.location = location;
		this.maxRotation = maxRaotation;
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ����" + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + " Tire ��ũ ***");
			return false;
		}
	}
}
