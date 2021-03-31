package sec05.exam01_anonymous_extends;

public class Anonymous {
	//�ʵ� �ʱⰪ���� �͸� �ڽ� ��ü�� ����
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	void method1() {
		// ���ú��������� �͸��ڽİ�ü�� ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		// ���ú��� ���
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}