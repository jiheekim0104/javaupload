package b;

public class B {
	private static int sb = 100; // static써서 다른 패키지에서도 쓸수있게함
	private int ib = 200;

	public static int getSb() {
		return sb;
	}

	public static void setSb(int sb) {
		B.sb = sb;
	}

	public int getIb() {
		return ib;
	}

	public void setIb(int ib) {
		this.ib = ib;
	}

}
