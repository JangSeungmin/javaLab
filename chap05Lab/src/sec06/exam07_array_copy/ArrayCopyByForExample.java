package sec06.exam07_array_copy;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
			System.out.println(newIntArray[i]);
		}
	
	}

}
