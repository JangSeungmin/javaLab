package sec02.exam02_swich;

public class SwichExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'a';
		
		switch(grade){
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}

		
	}
	
}
