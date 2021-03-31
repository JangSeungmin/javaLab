package sec07_user_define_exception;

// 사용자 정의 예외 클래스
public class BalanceInsuffcientException extends Exception {
	public BalanceInsuffcientException() {}
	public BalanceInsuffcientException(String message) {
		super(message);
	}

}
