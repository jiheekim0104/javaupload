package javaMid4.p368;

public class PromotionEx {

	public static void main(String[] args) {
		
		// A a = new A(); �̰� �ȵ��� ������ �������̽��̴ϱ�!
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// ������ �̿�
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
		//����� �ٿ� �ɽ�Ʈ�Ѱ�
		C c2 = (C)a2;
		c2.c1();
		
		E e2 = (E)a4;
		e2.ptintAll();
		
		//�̰� �������̵����� �ذ��Ѱ� 
		b1.printAll(); 
	}

}
