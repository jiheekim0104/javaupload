package javaBasic4.day01;


public class StaticEx04 {

	public static void main(String[] args) {
		System.out.println(Student.a+" "+Student.b+" "+Student.c); // static�̶� �޸𸮿��� �ö������ϱ�, Ŭ���� ���� �տ� �ٿ��ָ�� ���� 
		Student.sM();
		
		Student st = new Student();
		System.out.println(st.ia +" "+ st.ib + " "+ st.ic);
		st.iM();
		
		System.out.println(Student.getA());
		System.out.println(st.getIb());
	}

} 

class Student {
	static int a = 10;
	static float b = 1.1f;
	static double c = 5.5;
	
	int ia =100;
	float ib = 2.2f;
	
	double ic = 6.6;
	
	public static int getA() {
		return a;
	}

	public float getIb() {
		return ib;
	}

	public static void sM() {
		System.out.println("�̰��� ���� �޼ҵ�"+a+b+c);
		System.out.println(Person.name +" "+ Person.addr);
	}
	
	public void iM() {
		System.out.println("�̰��� �ν��Ͻ� �޼ҵ�"+a+b+c+ia+ib+ic);
	}
}

class Person{
	static String name ="ȫ�浿";
	static String addr ="����";
}
