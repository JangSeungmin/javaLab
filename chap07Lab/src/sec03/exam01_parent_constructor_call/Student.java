package sec03.exam01_parent_constructor_call;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모 생성자를 명시적으로 기술하여야 한다
		this.studentNo = studentNo;
	}
}
