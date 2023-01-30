package Ex;

public class D {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.add(10));
		System.out.println(a.subtract(a.result1, 10));

		B b = new B();
		System.out.println(b.result1);
		
		C c = new C();
		System.out.println(c.result1);
		System.out.println(c.result2);
		System.out.println(c.result3);
		
		
	}

}
