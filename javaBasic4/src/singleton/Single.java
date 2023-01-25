package singleton;

public class Single {
	private static Single s = new Single(); //(2) 
	
	private Single() { //(1) 다른 클래스에서 아예 못씀! 여기서만 쓸수있음.
		
	}
	
	private static String now() {
		return "2023-01-25";
	}
	
	public static Single getInstance() { // 1개의 메소드만 public으로 만들어줌. static으로 참조변수를 리턴해줌(?)
		return s;
	}
}
