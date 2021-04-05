package test;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		
		String i = (num > 0) ? "양수" : (num < 0) ? "음수" : "0";
		System.out.println(i);
		
	}

}
