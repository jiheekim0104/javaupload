package javaBasic3.ch06.day01;

public class ClassEx01 {

	public static void main(String[] args) {
		// �ΰ��� Ŭ����(����� car)�� ������! 
		Car c = new Car(); // �⺻�����ڸ� ȣ��, �ν��Ͻ�ȭ�߾��!
		// �����ڴ� ��ü�� �����ɶ��� ����
		// �������� �뵵�� ��ü�� �����ɶ� ó������ ���� ���� �����Ѵ�.
		Car c1 = new Car("�׷���");
		Car c2 = new Car("K5",4000);
		Car c3 = new Car("Model Y",10000,"�׽���");
		
		System.out.println(c.getCarName());
		System.out.println(c.getCarPrice());
		System.out.println(c.getCarMan());
		
		
		System.out.println(c1.carName);
		System.out.println(c1.carPrice);
		System.out.println(c1.carMan);
		
		System.out.println(c2.carName+" "+c2.carPrice);
		
		System.out.println(c3.carName+" "+c3.carPrice+" "+c3.carMan);
		System.out.println(c3.getCarName()+" "+c3.getCarPrice()+" "+c3.getCarMan());
	}

} 
