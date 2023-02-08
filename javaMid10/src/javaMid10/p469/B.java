package javaMid10.p469;

public class B {
	public void b1() throws Exception {
		b2();
	}

	public void b2() throws Exception {
		b3();
	}

	public void b3() throws Exception {
		b4();
	}

	public void b4() throws Exception {
		int a = 10/0;
		Class.forName("javaMid.p470.ExceptionEx7");
	}
}
