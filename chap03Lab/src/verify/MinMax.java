package verify;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("3개의 정수를 입력 하세요?");
		int n1, n2, n3, max, min;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt(); // 첫번째 입력값
		n2 = sc.nextInt(); // 둘번째 입력값
		n3 = sc.nextInt(); // 세번째 입력값
		// 아래에 코드를 작성하세요.
		// ?
		max = (n1 < n2) ? ((n2 < n3) ? n3 : n2) : ((n1 <  n3) ? n3 : n1);
		min = (n1 < n2) ? ((n1 < n3) ? n1 : n3) : ((n2 < n3) ? n2 : n3);

		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
