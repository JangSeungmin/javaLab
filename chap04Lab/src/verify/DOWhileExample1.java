package verify;

import java.util.Scanner;

public class DOWhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//1~100 ������ ��
		int ran = (int)(Math.random()*100) + 1;
		int cnt = 0; 
		int inNum =0;

		do {
			if(cnt == 0) System.out.println("1~100 ���� ���ڸ� �Է��ϼ���.");
			
			inNum = sc.nextInt();
			
			if(inNum > ran) System.out.println("���� ���� �Է��ϼ���.");
			else if(inNum < ran) System.out.println("ū ���� �Է��ϼ���.");
			
			cnt++;
		} while (inNum != ran);
		
		System.out.println(cnt+"���� ������ϴ�.");
		sc.close();
	}

}