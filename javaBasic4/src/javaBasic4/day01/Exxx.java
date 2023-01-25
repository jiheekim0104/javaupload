package javaBasic4.day01;

public class Exxx {

	public static void main(String[] args) {
		System.out.println(Student1.major0+" "+Student1.id0);
		
		Student1 st1 = new Student1();
		System.out.println(st1.major1+" "+ st1.id1);

	}

}

class Student1 {
	static String major0= " 교육학";
	static int id0 = 11589;
	
	String major1 = "물리학";
	int id1 = 22156;
	
}
