package verify;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			// 작성 위치
			int chk = scanner.nextInt();
			
			if(chk == 1) {
				System.out.print("예금액> ");
				balance += scanner.nextInt();
			} else if(chk == 2) {
				System.out.print("출금액> ");
				balance -= scanner.nextInt();
			} else if(chk == 3) {
				System.out.print("잔고> ");
				System.out.println(balance);
			} else if(chk == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료");

	}
}