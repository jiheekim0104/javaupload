package javaBasic2.ch05;

public class RefEx03 {

	public static void main(String[] args) { // ���� ���޸𸮿� �޼ҵ���� ���� �ö󰣰ž�!
		Student1 s1 = new Student1(); 
		s1.stName = "������";
		s1.age = 29;
		s1.m1(); // m1�� ȣ���ض�!! void �ٷΰ��� �����ߴٰ� �ٽ� ���ƿ�!
		System.out.println("�̰��� main()"+s1.stName);
		s1.m2();
		
		Person1 a1 = new Person1();
		a1.address = "�ϳ���";
		a1.point = 301.3;
		a1.getAddress(); // �޼������ p1 �̷��� ����� ���ϴ� ���� �˼��� ����..! �׷��� �˾Ƶ������ִ� �̸��� ���°� ����!  
		a1.getPoint();
		a1.getAll();
		
		//(1) �޼��带 �̿��ؼ� ���� �����ϱ� (���⿡ ���°� �ƴϰ�, �޼���θ��� ���� ���ڿ� �װ��� �־��ش�!) **�޼��忡 ���� �־��ִ� �ٸ� �����, �ΰ��� �� �غ���!
		a1.setAddress("�ϳ���"); // (2) ()�ȿ� ���� ���� ������ �޼���� �Ѿ�� �Ҹ���!
		a1.setPoint(301.3);
		a1.setAll("������",40.2);
		a1.setEx(5,true,"ȫ�浿",5.8);
		
		
	}

}
class Student1 { 
	String stName;
	int age;
	void m1() { // �޼ҵ� ������ ���� 
			System.out.println("�̰��� Student Ŭ������ m1 �޼ҵ� �Դϴ�");
	}
	
	void m2() { // m2�� ����� ���⼭ ���̸� ����Ҽ��ְ� �������! 
		System.out.println("�̰��� Student Ŭ����"+age+" "+stName); 
	}
}

class Person1 { 
	// ����ʵ� (���⺯��)
	String address;
	double point;
	// ��� �޼ҵ� (�ؿ� ������)
	void getAddress() {
		System.out.println(address);
	}
	void getPoint() {
		System.out.println(point);
	}
	void getAll() {
		System.out.println(address+" "+point);
	}
	void setAddress(String address) { //(3) ()���� �ȿ��� ������ ������ ���� �޾ƿ� ������ �������! ���Ⱑ ��������� ������ ���� �Ѱ��̾����� ��������~~
		this.address =address ;
	}
	void setPoint(double point) {
		this.point = point ;
	}
	void setAll(String address , double point) { 
		//(4) ������ ������ ���� ����ʵ忡�� �ִ°� �ϰ�������� ���� 
		this.address =address ; // (5) �տ� address�� ����ʵ�(this.�� �����) , �ڿ��� ������ ������ �� address
		this.point = point ;
	}	
	void setEx(int e , boolean f , String g , double h) {
		System.out.println(e+" "+f+" "+g+" "+h + "�̰��� Person1 Ŭ������ �޼ҵ���!");
	}
}

class Teacher1 {
	String dept;
	boolean gender;
}