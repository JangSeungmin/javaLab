package sec06.exam03_array_length;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr[" + i + "] = " + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr[" + i + "] = " + arr1[i]);
		}
		
		String[] arr2 = new String[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		
		arr2[0] = "1¿ù";
		arr2[1] = "2¿ù";
		arr2[2] = "3¿ù";
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
	}

}
