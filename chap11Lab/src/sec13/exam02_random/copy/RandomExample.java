package sec13.exam02_random.copy;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// ���ù�ȣ
		int[] selectNumber = new int[6];
		// Random random = new Random(5); �õ带 �ٰ�� ������ ������ �ֱ⶧���� �׻� ���� ���ڰ� ���´�.
		Random random = new Random(); // �õ尡 ����� �������� ���´�.
		System.out.print("���ù�ȣ :");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.println(selectNumber);
		}

		// ��÷��ȣ

		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("��÷��ȣ : ");
		for (int i = 0; i < 6; i++) {
			// (int)(Math.random()*45)+1
			winningNumber[i] = random.nextInt(45) + 1;// 1~45���� ������ ������ ����
			System.out.println(winningNumber[i] + " ");
		}

	}

}
