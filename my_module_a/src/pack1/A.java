package pack1;

import pack2.B;
import pack3.C;

public class A {
	public void method() {
		System.out.println("모듈 A에서 A 메소드 실행");
		
		B b = new B();
		b.method();
		
		
		}
	public C getC() {
		C c = new C();
		return c;
	}
}
