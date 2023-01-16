package javaBasic2.ch05.day03;

public class Ex01 {

	public static void main(String[] args) {
		/*
		null
		Student st = null; // 스텍메모리에 먼저 변수를 만들고, 여기에 값을 아직 넣지 않은 상태(=st에 참조값이 들어있지않다.) 힙메모리에는 올라오지 않았기때문에 아직 주소는 넣지 않겠다는 소리!
		
		NullPointerException
		String str = null;
		System.out.println(str.length());
		*/
		
		
		/* 다른 클래스에 값을 넣는 방법
		 1 직접 필드에 넣는다. b1.kind --> 권장하지 않아!
		 2 메소드를 통해서 넣는다.  --> 2번 또는 2-1번이 가장 많이써!
		  setKind ( String kind ) { }
		 2-1 메소드를 통해서 값을 출력한다. 
		 3 생성자를 사용해서 값 넣기 (17일 수업 예정)
		 */
		
		
		//2번
		Student s1 = new Student();
		s1.setname("김지희");
		s1.setphone("010-4910-5488");
		s1.setkor(100);
		System.out.println(s1.name+" "+s1.phone+" "+s1.kor);
		
		
		
		//2번 -1
		System.out.println(s1.getname()+" "+s1.getphone()+" "+s1.getkor());
		
	}

} //class end 

class Student {
	String name;
	String phone;
	int kor;
	
	void setname (String name) { //2번
		this.name = name;
	}
	
	void setphone (String phone) { //2번
		this.phone = phone;
	}
	
	void setkor (int kor) { //2번
		this.kor = kor;
	}
	
	String getname() { // 2번-1
		return name; //여기서는 this안써도 결과같음!
	}
	
	String getphone() { // 2번-1
		return phone; 
	}
	
	int getkor() { // 2번-1
		return kor; 
	}
	
	
}
