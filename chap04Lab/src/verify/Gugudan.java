package verify;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� title���
		for (int dan = 2; dan <= 9; dan++) {
			System.out.print("[" + dan + "��]" + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "x" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
		
	}

}
