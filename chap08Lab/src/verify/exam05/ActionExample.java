package verify.exam05;

public class ActionExample {
	public static void main(String[] args) {
		// 작성 위치
		Action action = new Action() {
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work();
	}
}
