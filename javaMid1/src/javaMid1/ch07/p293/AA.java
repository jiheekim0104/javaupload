package javaMid1.ch07.p293;

public class AA extends A{
	int aa;

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}
	
	public AA() {
		this(200);
		System.out.println("AAŬ������ �⺻������");
	}
	
	public AA(int aa) {
		//this.aa=aa;
		System.out.println("AAŬ������ ����� ������");
	}
}
