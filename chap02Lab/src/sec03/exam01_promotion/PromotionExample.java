package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드="+intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		double doubleValue = intValue;
		System.out.println(doubleValue);
	}

}
