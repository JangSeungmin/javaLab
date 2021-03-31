package sec07.exam01_enum;

public class EnumMethodExample {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Week today = Week.SUNDAY;
			
			String name = today.name();
			System.out.println(name);
			
			int ordinal = today.ordinal();
			System.out.println(ordinal);
			
			Week day1 = Week.MONDAY;
			Week day2 = Week.WEDNESDAY;
			int result1 = day1.compareTo(day2);
			int result2 = day2.compareTo(day1);
			System.out.println(result1);
			System.out.println(result2);
		}

}
