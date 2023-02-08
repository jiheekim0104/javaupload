package javaMid10.p469;



public class EceptionEx05 {

	public static void main(String[] args) throws Exception {
		B b = new B();
		try {
			b.b1();
		} catch (Exception e) {
			if(e instanceof ClassNotFoundException) {
				System.out.println("이런 클래스가 없어요~"+e.getMessage());
			} else if (e instanceof ArithmeticException) {
				System.out.println("나눌수 없어요~"+e.getMessage());
			}
				
		}
	}

}
