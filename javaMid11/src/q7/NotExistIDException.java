package q7;

public class NotExistIDException extends Exception {
	public NotExistIDException() {
		
	}
	public NotExistIDException(String string) {
		super("아이디가 존재하지 않습니다.");
	}
}
