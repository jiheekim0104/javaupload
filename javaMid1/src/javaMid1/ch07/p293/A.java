package javaMid1.ch07.p293;

public class A {
	int a;
	public void setA(int a) {
		this.a=a;
	}
	
	public int getA() {
		return a;
	}
	public A() {
		this(100); // ����� �����ڸ� �θ� 
		System.out.println("AŬ������ �⺻������");
	}
	
	public A(int a) {
		this.a = a;
		System.out.println("AŬ������ ����� ������");
	}
}
