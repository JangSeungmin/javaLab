package verify;

public class Arr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = { { 85, 60, 70 }, // 0 ��
								{ 90, 95, 80 }, // 1 ��
								{ 75, 80, 100 }, // 2 ��
								{ 80, 70, 95 }, // 3 ��
								{ 100, 65, 80 } // 4 ��
							   };
		int[] subject = new int[3]; // �������� ����
		int[] student = new int[5]; // �л��� ���� ����
		
		String[] subName = { "����:", "����:", "����:" };
		String[] stuName = { "1���л�:", "2���л�:", "3���л�:", "4���л�:", "5���л�:" };
		// subject[0]=0, student[0]=0;
		int r, c;
		System.out.println("�� ���� �������ϱ� ");
		// �̰��� �ڵ带 �߰��մϴ�.
		for (int i = 0; i < subject.length; i++) {
			for (int j = 0; j < student.length; j++) {
				subject[i] += score[j][i];
			}
			System.out.println(subName[i] + subject[i]);
		}
		
//		for (int i : subject) {
//			for (int j : student) {
//				subject[i] += score[j][i];
//			}
//			System.out.println(subName[i] + subject[i]);
//		}

		System.out.println();
		System.out.println("�л��� �������ϱ�");
		// �̰��� �ڵ带 �߰��մϴ�.
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < subject.length; j++) {
				student[i] += score[i][j];
			}
			System.out.println(stuName[i] + student[i]);
		}
		
	}

}
