package b;

public class B {
	private static int sb = 100; // static�Ἥ �ٸ� ��Ű�������� �����ְ���
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
