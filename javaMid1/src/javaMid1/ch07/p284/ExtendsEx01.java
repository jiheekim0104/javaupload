package javaMid1.ch07.p284;

public class ExtendsEx01 {

	public static void main(String[] args) {
		A a = new A();
		a.setName("홍길동");
		a.setPhone("010-123-1234");
		//System.out.println(a.getName());
		//System.out.println(a.getPhone());
		//a.printM();
		
		B b = new B();
		b.setAge(30);
		b.setPhone("010-789-7890");
		
		C c = new C();
		c.setSchool("서울대학교");
		c.setName("이순신");
		c.setAge(60);
		c.setPhone("010-5555-4444");
		
		c.printMMM();
		
		/*
		System.out.println(c.getSchool());
		System.out.println(a.getName());
		System.out.println(a.getPhone());
		System.out.println(b.getAge());
		*/
	}

}
