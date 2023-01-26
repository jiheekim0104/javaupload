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
		System.out.println("AA클래스의 기본생성자");
	}
	
	public AA(int aa) {
		//this.aa=aa;
		System.out.println("AA클래스의 명시적 생성자");
	}
}
