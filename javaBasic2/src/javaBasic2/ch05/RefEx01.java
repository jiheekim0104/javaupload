package javaBasic2.ch05;

import java.util.Scanner;

public class RefEx01 {
		/* 
		��ü�� ���ؼ� �����. ���������� ������ ������ class�� �����.
		main �ȿ� ��� ���� ��ֱ⿡�� ������ ������. 
		*/
	public static void main(String[] args) {
		int a = 10 ; // ���ؿ� a��� ������ ����� 10�� �Ҵ��
		String name = "������"; // string�� �������� Ŭ������! 
		// ���޸𸮿� �������� ������ ����鼭 �ּҰ� ����, �ٵ� �ڹٿ����� ���޸� ������ �Ұ�����! but ���ظ޸𸮴� ���ٰ�����. 
		// �׷��� ������(name)�� ���ظ޸𸮿� ����� ���޸��� �ּҸ� �������ִ°ž�!
		Scanner sc = new Scanner(System.in);
		// sc��� ��ĳ�� Ŭ����..!
		// ���޸𸮿� ���ɳʶ�� Ŭ������ �÷��ּ���! �׷� �װ��� �ּҰ� ����! �� �ּҸ� sc��� ����((in ���ظ޸�))���� �ִ°ž�.		
		
		Student st = new Student(); 
		// �ڷ��� ������   = new Ŭ������()   -> new �ش� Ŭ������ ���޸𸮿� �÷���!
		// (4)�������� ���޸𸮿� �ö󰡰� �ּҰ� �������ϱ� ���ظ޸𸮿��ִ� ����(st)�� �� �ּҸ� ��! �ٵ� �� �ڷ��� Ÿ���� Student�ΰž�.
		Person p = new Person();
		Teacher t = new Teacher();
		
		st.stName = "������";
		st.age = 33;
		p.address = "������3";
		p.point = 10.18;
		t.dept = "��ǻ�Ͱ���";
		t.gender = true;
		// .�� �����ȿ� ����ִٴ� �ǹ� 
		// (������).Ŭ������������ = �߰��ҳ����Է�
		
		System.out.println(st.stName);
		
		
		
	}

}
class Student { //(1)student ��� Ŭ������ ����! �ٵ� �̰� �����Ѵٰ� �̰� �޸𸮿� �ö󰡴°� �Ƴ�. main ���̰ŵ�. 
				//(2)main �ȿ� �ִ� �ֵ��� Ư���� �ֵ��̾�. �������ڸ��� �˾Ƽ� �޸𸮿� �ö󰡴¾ֵ��̰ŵ�!
				//(3)main�ۿ� �ִ� �ֵ��� main�� ���� ����Ǿ������ �޸𸮿� �ö󰥼��ִ°ž�.
	String stName;
	int age;
	// �޼��� �����ϱ� �����ϱ�
	// �޼��� ����
	// ����Ÿ�� �޼����(�� �޼��尡 ȣ��ɶ� ������ ���� ���� ����,�Է¹޴� ����,�־��ִ� �ڷ�) {----ó���� �����----}
	void m1() {
			System.out.println("�̰��� Student Ŭ������ m1 �޼ҵ� �Դϴ�");
	}
}

class Person{
	String address;
	double point;
}

class Teacher{
	String dept;
	boolean gender;
}