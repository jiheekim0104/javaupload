package q7;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		
	}
	public WrongPasswordException(String string) {
		super("패스워드가 틀립니다.");
	}
}
