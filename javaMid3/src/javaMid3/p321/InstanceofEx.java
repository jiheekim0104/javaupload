package javaMid3.p321;


public class InstanceofEx {
	
	
	public static void main(String[] args) {
		//Person p1 = new Person("홍길동");
		//personInfo(p1);
		//System.out.println();
		
		Person p2 = new Student("김길동",10);
		personInfo(p2);
	}
	
	public static void personInfo(Person person) {
		System.out.println("name: "+person.name);
		person.walk();
		
		//여기서 학생 넘버를 찍을수있을까? ㄴㄴ syso(person.studentNo) 불가능!! 
		Student student = (Student)person; // 다운 케스팅을 이용하여
		System.out.println(student.studentNo); // 이렇게 접근해줘야해!
		student.study(); //** 오버라이딩을사용한다면 다운 케스팅이 필요가 없는데, 오버라이딩 없이 자식 메소드를 호출하려면 다운케스팅이 필요하다는 소리야! 
		
		System.out.println(person instanceof Student);
		//if(person instanceof Student) {
		//System.out.println("studentNo: "+student.studentNo);
		//student.study();
		//}
	}
}
