package javaBasic4.day01;

public class StaticEx05 {
	public static void main(String[] args) {
	System.out.println("메인 메소드 부분입니다."); // 여기서부터 두줄이 없더라도, 아래에 static 메소드 실행됨 ㅇㅇ 	
	System.out.println(Car.a);
	
	Car car = new Car();
	System.out.println(car.ia);
	
	}
}

class Car{
	static int a;
	int ia;
	
	static { //static 변수 출력전에 여기부터 들림!
		System.out.println("이곳은 정적 블록입니다.- 이곳은 정적 멤버들을 처리할때 이곳먼저 들려요");
		System.out.println("이곳에서는 정적멤버들의 초기값을 넣을 때 주로 사용해요.");
		a=200;
	}
	
	
	
	{ // 기본생성자로 가기전에 여기먼서 들림! 
		System.out.println("이곳은 인스턴스 블록입니다.");
		ia = 1000;
	}
	
	public Car() {
		System.out.println("이곳은 기본생성자 부분입니다.");
		ia=2000;
	}
	
}
