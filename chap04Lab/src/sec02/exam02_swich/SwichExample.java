package sec02.exam02_swich;

public class SwichExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'a';
		
		switch(grade){
			case 'A':
			case 'a':
				System.out.println("��� ȸ���Դϴ�.");
				break;
			case 'B':
			case 'b':
				System.out.println("�Ϲ� ȸ���Դϴ�.");
				break;
			default:
				System.out.println("�մ��Դϴ�.");
		}

		
	}
	
}