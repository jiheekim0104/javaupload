package javaMid10.p464;

public class EceptionEx02 {

	public static void main(String[] args) {
		int[] number = {10,20,30,40,50};
		try {
			System.out.println(number[5]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("------------------");
			System.err.println(e.toString());
			System.out.println("------------------");
			e.printStackTrace();
			System.out.println("�Է��� �ε����� �迭�� ���̺��� ��ϴ�.");
		} finally {
			System.out.println("���ܶ� ������� ����˴ϴ�.");
		}
		
		

	}

}
