package javaMid10.p464;

public class EceptionEx04 {

	public static void main(String[] args) {
		int k = 0;
		try {
			Class.forName("java.lang.String");
			int a = 10/k;
			int[] number = {10,20,30,40,50};
			System.out.println(number[4]);
			
		} catch (ArithmeticException e) {
			System.out.println("������ ���ܹ߻�");
			if(k==0) k=5;
			System.out.println(10/k);
			System.out.println(e.getMessage());
		} 
		catch (Exception e) {
			System.out.println("�ֻ��� ���ܹ߻�");
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("���� �����ϱ�");
		}
	
		

	}

}
