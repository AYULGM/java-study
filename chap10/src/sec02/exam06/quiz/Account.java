package sec02.exam06.quiz;

public class Account {

	// 필드
	private String user;
	private long balance;

	// 생성자
	public Account() {
	}
	
	public Account(String user, long balance) {
//		super(); 생략가능
		this.user = user;
		this.balance = balance;
	}
	// 메서드
	public String getUser() {
		return user;
	}

	public long getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance+=amount;
		System.out.println(amount + "원이 입금되었습니다. [잔액: " + balance + "원]");
	}

	public void withdraw(int amount) throws InsufficientBalanceException {
		if (balance < amount) {
			throw new InsufficientBalanceException("잔액이 " + (amount - balance) + "원 부족합니다.");
			//일반 예외라 try -catch를 하던가 throws로 예외 떠넘기기 해야됨
		}
		balance -= amount;
		System.out.println(amount + "원이 출금되었습니다. [잔액: " + balance + "원]");
	}
	
	

}
