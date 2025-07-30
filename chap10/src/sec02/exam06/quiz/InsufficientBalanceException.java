package sec02.exam06.quiz;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException (String message) { // 예외메시지 전달받고
		super(message); // 부모 생성자한테 넘김
	}
}
