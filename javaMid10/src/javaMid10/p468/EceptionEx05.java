package javaMid10.p468;

public class EceptionEx05 {
	public static void main(String[] args) {
		try {
			A a = new A();
			a.a1();
		} catch (Exception e) {
			if(e instanceof ArithmeticException) {
				System.out.println("���� Ʋ���Ծ���!!!!!!!!!!");
			} else if (e instanceof IndexOutOfBoundsException) {
				System.out.println("�ε����� �� ũ��!!!!");
			} else if (e instanceof ClassNotFoundException) {
				System.out.println("Ŭ������ ��ã�Ҵ�!!!!!!!!");
			} else {
				System.out.println("����ġ ���� ���� �߻��ߴ�~ ");
			}
			
		}
		
		
		
		
	}
}
