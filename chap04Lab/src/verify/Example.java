package verify;

public class Example {

	public static void main(String[] args) {
		// 3��
		System.out.println("3��=========================");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) sum += i;
		}
		System.out.println(sum);

		
		// 4��
		System.out.println("4��=========================");
		int n1 = 0;
		int n2 = 0;
				
		while (n1 + n2 != 5) {
			n1 = (int)(Math.random()*6)+1;
			n2 = (int)(Math.random()*6)+1;
			System.out.println("(" + n1 + ", " + n2 + ")");
		}
		
		
		// 5��
		System.out.println("5��=========================");
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if((x * 4) + (y * 5) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
		
		
		// 6��
		System.out.println("6��=========================");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}