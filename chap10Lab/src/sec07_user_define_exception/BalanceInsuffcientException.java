package sec07_user_define_exception;

// ����� ���� ���� Ŭ����
public class BalanceInsuffcientException extends Exception {
	public BalanceInsuffcientException() {}
	public BalanceInsuffcientException(String message) {
		super(message);
	}

}
