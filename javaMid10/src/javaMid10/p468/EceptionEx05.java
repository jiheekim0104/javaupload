package javaMid10.p468;

public class EceptionEx05 {
	public static void main(String[] args) {
		try {
			A a = new A();
			a.a1();
		} catch (Exception e) {
			if(e instanceof ArithmeticException) {
				System.out.println("식이 틀려먹었다!!!!!!!!!!");
			} else if (e instanceof IndexOutOfBoundsException) {
				System.out.println("인덱스가 더 크다!!!!");
			} else if (e instanceof ClassNotFoundException) {
				System.out.println("클래스명 못찾았다!!!!!!!!");
			} else {
				System.out.println("예기치 못한 예외 발생했다~ ");
			}
			
		}
		
		
		
		
	}
}
