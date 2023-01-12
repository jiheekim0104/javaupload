package javaBasic2.ch05;

public class RefEx03 {

	public static void main(String[] args) { // 여긴 힙메모리에 메소드까지 같이 올라간거야!
		Student1 s1 = new Student1(); 
		s1.stName = "김지희";
		s1.age = 29;
		s1.m1(); // m1을 호출해라!! void 줄로가서 실행했다가 다시 돌아옴!
		System.out.println("이곳은 main()"+s1.stName);
		s1.m2();
		
		Person1 a1 = new Person1();
		a1.address = "하남시";
		a1.point = 301.3;
		a1.getAddress(); // 메서드명을 p1 이렇게 만들면 뭐하는 앤지 알수가 없음..! 그래서 알아들을수있는 이름을 쓰는게 좋아!  
		a1.getPoint();
		a1.getAll();
		
		//(1) 메서드를 이용해서 값을 전달하기 (여기에 쓰는게 아니고, 메서드부르고 값을 쓴뒤에 그값을 넣어준다!) **메서드에 값을 넣어주는 다른 방법임, 두가지 다 해볼것!
		a1.setAddress("하남시"); // (2) ()안에 들어가는 값을 가지고 메서드로 넘어간단 소리야!
		a1.setPoint(301.3);
		a1.setAll("강동구",40.2);
		a1.setEx(5,true,"홍길동",5.8);
		
		
	}

}
class Student1 { 
	String stName;
	int age;
	void m1() { // 메소드 삽입함 ㅇㅇ 
			System.out.println("이곳은 Student 클래스의 m1 메소드 입니다");
	}
	
	void m2() { // m2를 만들고 여기서 나이를 출력할수있게 만든거임! 
		System.out.println("이곳은 Student 클래스"+age+" "+stName); 
	}
}

class Person1 { 
	// 멤버필드 (여기변수)
	String address;
	double point;
	// 멤버 메소드 (밑에 변수들)
	void getAddress() {
		System.out.println(address);
	}
	void getPoint() {
		System.out.println(point);
	}
	void getAll() {
		System.out.println(address+" "+point);
	}
	void setAddress(String address) { //(3) ()여기 안에는 위에서 데려온 값을 받아올 변수를 만들어줘! 여기가 비어있으면 데려온 값을 둘곳이없으니 에러가나~~
		this.address =address ;
	}
	void setPoint(double point) {
		this.point = point ;
	}
	void setAll(String address , double point) { 
		//(4) 위에서 데려온 값을 멤버필드에게 주는걸 하고싶은거임 ㅇㅇ 
		this.address =address ; // (5) 앞에 address는 멤버필드(this.를 사용함) , 뒤에는 위에서 데려온 값 address
		this.point = point ;
	}	
	void setEx(int e , boolean f , String g , double h) {
		System.out.println(e+" "+f+" "+g+" "+h + "이곳은 Person1 클래스의 메소드임!");
	}
}

class Teacher1 {
	String dept;
	boolean gender;
}