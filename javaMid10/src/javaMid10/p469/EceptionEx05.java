package javaMid10.p469;



public class EceptionEx05 {

	public static void main(String[] args) throws Exception {
		B b = new B();
		try {
			b.b1();
		} catch (Exception e) {
			if(e instanceof ClassNotFoundException) {
				System.out.println("�̷� Ŭ������ �����~"+e.getMessage());
			} else if (e instanceof ArithmeticException) {
				System.out.println("������ �����~"+e.getMessage());
			}
				
		}
	}

}
