package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-7891234", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa"; // The final field Person.nation cannot be assigned
		//p1.ssn = "234567-8912345";	 The final field Person.nation cannot be assigned
		p1.name = "을지문덕";
	}

}
