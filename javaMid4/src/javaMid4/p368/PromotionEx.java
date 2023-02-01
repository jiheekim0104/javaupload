package javaMid4.p368;

public class PromotionEx {

	public static void main(String[] args) {
		
		// A a = new A(); 이건 안되지 ㅇㅅㅇ 인터페이스이니까!
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 다형성 이용
		B b1 = new D();
		C c1 = new E();
		A a1 = new B();
		A a2 = new C();
		A a3 = new D();
		A a4 = new E();
						
		
		A a;
		
		a=b ;
		a=c ;
		a=d;
		a=e;
		//여기는 다운 케스트한거
		C c2 = (C)a2;
		c2.c1();
		
		E e2 = (E)a4;
		e2.ptintAll();
		
		//이건 오버라이딩으로 해결한거 
		b1.printAll(); 
	}

}
