package test_0512;

public class BalanceInsufficientException extends Exception {

	BalanceInsufficientException() {
		
	}
	
	BalanceInsufficientException(String message) {
		super(message);
	}
}
