package javaMid10.p464;

public class EceptionEx03 {

	public static void main(String[] args) {
		try {
			Class.forName("java.util.String");
			int a = 10/0;
			int[] number = {10,20,30,40,50};
			System.out.println(number[5]);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ ��� ������");
			e.printStackTrace();
			
		} catch (ArithmeticException e) {
			System.out.println("�����°� ������");
			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε����� �迭�� ���̺� ��������");
			e.printStackTrace();
			
		} finally {
			System.out.println("���� �����ϱ�");
		}
	
		
		

	}

}
