package javaMid10.p468;

public class A {
	public void a1() throws ArithmeticException,IndexOutOfBoundsException,ClassNotFoundException{ // ���� �߻��� �θ������� ���ѱ� �������װ�
		a2();
		Class.forName("java.util.String");
	}
	
	public void a2() throws ArithmeticException,IndexOutOfBoundsException { // ���� �߻��� �θ������� ���ѱ� a1���װ�
		a3();
		int[] number = {1,2,3};
		System.out.println(number[1]);
	}
	
	public void a3() throws ArithmeticException { // ���� �߻��� �θ������� ���ѱ� a2���װ�
			int a = 10 / 5;
	
	}
	
}
