package sec05.exam01_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		// Anonymous ��ü ����
		Anonymous anony = new Anonymous();
		
		// �͸��ڽİ�ü�� wake()�޼ҵ带 ����Ѵ�.
		anony.field.wake();
		
		anony.method1();
		
		anony.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});
	}
}