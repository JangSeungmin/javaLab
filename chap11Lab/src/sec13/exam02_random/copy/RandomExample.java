package sec13.exam02_random.copy;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// 선택번호
		int[] selectNumber = new int[6];
		// Random random = new Random(5); 시드를 줄경우 순서는 정해져 있기때문에 항상 같은 숫자가 나온다.
		Random random = new Random(); // 시드가 없어야 랜덤으로 나온다.
		System.out.print("선택번호 :");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.println(selectNumber);
		}

		// 당첨번호

		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			// (int)(Math.random()*45)+1
			winningNumber[i] = random.nextInt(45) + 1;// 1~45까지 사이의 임의의 정수
			System.out.println(winningNumber[i] + " ");
		}

	}

}
