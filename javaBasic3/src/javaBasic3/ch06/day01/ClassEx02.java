package javaBasic3.ch06.day01;

public class ClassEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		Student st1 = new Student("±èÁöÈñ");
		Student st2 = new Student("010-4910-5488",100);
		Student st3 = new Student("±èÁöÈñ",90);
		Student st4 = new Student(85,"010-4910-5488");
		Student st5 = new Student("±èÁöÈñ",100,"010-4910-5488");
		Student st6 = new Student("010-4910-5488");
	}

}

class Student{
	String name;
	String phone;
	int scores;
	
	public Student(String name, int scores, String phone) {
		System.out.println(name+" "+scores+" "+phone);
	}
	
	public Student(int scores, String phone) {
		System.out.println(scores+" "+phone);
	}
	
	public Student(String name, int scores) {
		System.out.println(name+" "+scores);
	}
	
	public void Student0(String phone, int scores) {
		System.out.println(phone+" "+scores);
	}
	
	public Student(String name) {
		System.out.println(name);
	}
	
	public Student() {
		System.out.println("¿©±â!");
	}
}
