package sec07.exam02_field_initialize;

public class Korean {
		String notion = "대한민국";
		String name;
		String ssn;
		
		public Korean(String n, String s) {
				name = n;
				ssn = s;
		}
		
		// this 는 자신 객체를 의미한다.	
		/*public Korean(String name, String ssn) {
			this.name = name;
			this.ssn = ssn;
	}*/
}
