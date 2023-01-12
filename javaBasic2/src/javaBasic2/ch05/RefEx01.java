package javaBasic2.ch05;

import java.util.Scanner;

public class RefEx01 {
		/* 
		객체에 대해서 배웠다. 여러가지가 있지만 오늘은 class를 배웠어.
		main 안에 모든 것을 써넣기에는 공간이 부족해. 
		*/
	public static void main(String[] args) {
		int a = 10 ; // 스텍에 a라는 공간이 생기고 10이 할당됨
		String name = "김지희"; // string와 같은것이 클래스임! 
		// 힙메모리에 김지희라는 공간이 생기면서 주소가 생김, 근데 자바에서는 힙메모리 접근이 불가능해! but 스텍메모리는 접근가능해. 
		// 그래서 변수명(name)은 스텍메모리에 생기고 힙메모리의 주소를 가지고있는거야!
		Scanner sc = new Scanner(System.in);
		// sc라는 스캐너 클래스..!
		// 힙메모리에 스케너라는 클래스를 올려주세요! 그럼 그거의 주소가 생김! 그 주소를 sc라는 변수((in 스텍메모리))한테 주는거야.		
		
		Student st = new Student(); 
		// 자료형 변수명   = new 클래스명()   -> new 해당 클래스를 힙메모리에 올려라!
		// (4)이제서야 힙메모리에 올라가고 주소가 생겼으니까 스텍메모리에있는 변수(st)에 그 주소를 줘! 근데 그 자료의 타입이 Student인거야.
		Person p = new Person();
		Teacher t = new Teacher();
		
		st.stName = "이재훈";
		st.age = 33;
		p.address = "랑데르3";
		p.point = 10.18;
		t.dept = "컴퓨터공학";
		t.gender = true;
		// .은 무엇안에 들어있다는 의미 
		// (변수명).클래스하위내용 = 추가할내용입력
		
		System.out.println(st.stName);
		
		
		
	}

}
class Student { //(1)student 라는 클래스가 생김! 근데 이걸 저장한다고 이게 메모리에 올라가는게 아냐. main 밖이거든. 
				//(2)main 안에 있는 애들이 특별한 애들이야. 저장하자마자 알아서 메모리에 올라가는애들이거든!
				//(3)main밖에 있는 애들은 main과 끈이 연결되어야지만 메모리에 올라갈수있는거야.
	String stName;
	int age;
	// 메서드 동작하기 실행하기
	// 메서드 형식
	// 리턴타입 메서드명(이 메서드가 호출될때 들어오는 값을 받을 변수,입력받는 변수,넣어주는 자료) {----처리할 내용들----}
	void m1() {
			System.out.println("이곳은 Student 클래스의 m1 메소드 입니다");
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