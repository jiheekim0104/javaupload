package javaMid10.p464;

public class EceptionEx01 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);	
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("---------------");
			System.out.println(e.toString());
			System.out.println("---------------");
			e.printStackTrace();
			System.out.println("---------------");
			System.out.println("ArithmeticException 예외발생");
		} finally {
			System.out.println("예외랑 관계없이 나오지");
		}
		
		

	}

}
