package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1 = "�Ź�ö";
		String strVal2 = "�Ź�ö";
		
		if(strVal1 == strVal2) {
			System.out.println("strVal1�� strVal2�� ������ ����");
		} else {
			System.out.println("strVal1�� strVal2�� ������ �ٸ�");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1�� strVal2�� ���ڿ��� ����");
		}
		
	}

}
