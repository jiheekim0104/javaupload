package javaMid10.p468;

public class A {
	public void a1() throws ArithmeticException,IndexOutOfBoundsException,ClassNotFoundException{ // 예외 발생시 부른애한테 떠넘김 메인한테감
		a2();
		Class.forName("java.util.String");
	}
	
	public void a2() throws ArithmeticException,IndexOutOfBoundsException { // 예외 발생시 부른애한테 떠넘김 a1한테감
		a3();
		int[] number = {1,2,3};
		System.out.println(number[1]);
	}
	
	public void a3() throws ArithmeticException { // 예외 발생시 부른애한테 떠넘김 a2한테감
			int a = 10 / 5;
	
	}
	
}
