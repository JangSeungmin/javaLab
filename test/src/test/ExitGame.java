package test;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int sum = 0;
		int count = 0;
		do {
			i = sc.nextInt();
			sum += i;
			System.out.println("�Է� : " + i + " �� : " + sum);
			count++;
			if(sum >= 100 || count == 5) {
				System.out.println("���α׷� ����!");
				break;
			}
		}while (count < 5);

	}

}
