package javaBasic4.day01;

public class StaticEx05 {
	public static void main(String[] args) {
	System.out.println("���� �޼ҵ� �κ��Դϴ�."); // ���⼭���� ������ ������, �Ʒ��� static �޼ҵ� ����� ���� 	
	System.out.println(Car.a);
	
	Car car = new Car();
	System.out.println(car.ia);
	
	}
}

class Car{
	static int a;
	int ia;
	
	static { //static ���� ������� ������� �鸲!
		System.out.println("�̰��� ���� ����Դϴ�.- �̰��� ���� ������� ó���Ҷ� �̰����� �����");
		System.out.println("�̰������� ����������� �ʱⰪ�� ���� �� �ַ� ����ؿ�.");
		a=200;
	}
	
	
	
	{ // �⺻�����ڷ� �������� ����ռ� �鸲! 
		System.out.println("�̰��� �ν��Ͻ� ����Դϴ�.");
		ia = 1000;
	}
	
	public Car() {
		System.out.println("�̰��� �⺻������ �κ��Դϴ�.");
		ia=2000;
	}
	
}
