package javaMid3.p321;


public class InstanceofEx {
	
	
	public static void main(String[] args) {
		//Person p1 = new Person("ȫ�浿");
		//personInfo(p1);
		//System.out.println();
		
		Person p2 = new Student("��浿",10);
		personInfo(p2);
	}
	
	public static void personInfo(Person person) {
		System.out.println("name: "+person.name);
		person.walk();
		
		//���⼭ �л� �ѹ��� ������������? ���� syso(person.studentNo) �Ұ���!! 
		Student student = (Student)person; // �ٿ� �ɽ����� �̿��Ͽ�
		System.out.println(student.studentNo); // �̷��� �����������!
		student.study(); //** �������̵�������Ѵٸ� �ٿ� �ɽ����� �ʿ䰡 ���µ�, �������̵� ���� �ڽ� �޼ҵ带 ȣ���Ϸ��� �ٿ��ɽ����� �ʿ��ϴٴ� �Ҹ���! 
		
		System.out.println(person instanceof Student);
		//if(person instanceof Student) {
		//System.out.println("studentNo: "+student.studentNo);
		//student.study();
		//}
	}
}
