package verify;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.print("����> ");
			// �ۼ� ��ġ
			int chk = scanner.nextInt();
			
			if(chk == 1) {
				System.out.print("���ݾ�> ");
				balance += scanner.nextInt();
			} else if(chk == 2) {
				System.out.print("��ݾ�> ");
				balance -= scanner.nextInt();
			} else if(chk == 3) {
				System.out.print("�ܰ�> ");
				System.out.println(balance);
			} else if(chk == 4) {
				break;
			}
		}
		System.out.println("���α׷� ����");

	}
}