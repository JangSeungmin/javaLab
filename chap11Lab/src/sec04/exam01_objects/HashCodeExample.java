package sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	// 정적 멤버 클래스
	static class Student {
		int sno;
		String name;

		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		// Object 클래스의 hashCode(): 객체의 주소값으로 해쉬값(정수)을 생성한다.
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
	}
}
