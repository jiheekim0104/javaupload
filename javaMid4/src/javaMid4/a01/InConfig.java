package javaMid4.a01;

public interface InConfig {

	// 추상메소드
	void i1();

	// 상수
	static final double PI = 3.14;
	static final boolean OK = true;
	static final int COMPUT_PRICE = 2000000;
	static final int PRINT_PRICE = 500000;

	// 디폴트메소드 (정의 필수!) 굳이 구현클래스에서 오버라이딩 할 필요없음
	default void di1() {

	}
	default int di2() {
		return 0;
	}
	
	// 정적메소드
	static void st1() {
		
	}
	private void pr1() {
		//인터페이스 속에서만 사용가능 
	}
	
}
