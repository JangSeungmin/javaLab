package test;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		
		String i = (num > 0) ? "���" : (num < 0) ? "����" : "0";
		System.out.println(i);
		
	}

}
