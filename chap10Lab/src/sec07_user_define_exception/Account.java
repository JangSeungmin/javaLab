package sec07_user_define_exception;

public class Account {
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsuffcientException {
		if(balance < money) {
			// throw�� ���ܸ� ������ �߻���Ų��.
			throw new BalanceInsuffcientException("�ܰ���� : " + (money-balance));
		}
		balance -= money;
	}
	
}
