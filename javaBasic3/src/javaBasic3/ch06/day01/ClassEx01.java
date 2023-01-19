package javaBasic3.ch06.day01;

public class ClassEx01 {

	public static void main(String[] args) {
		// 두개의 클래스(여기랑 car)가 사용관계! 
		Car c = new Car(); // 기본생성자를 호출, 인스턴스화했어요!
		// 생성자는 객체가 생성될때만 수행
		// 생성자의 용도는 객체가 생성될때 처음으로 넣을 값을 지정한다.
		Car c1 = new Car("그랜저");
		Car c2 = new Car("K5",4000);
		Car c3 = new Car("Model Y",10000,"테슬라");
		
		System.out.println(c.getCarName());
		System.out.println(c.getCarPrice());
		System.out.println(c.getCarMan());
		
		
		System.out.println(c1.carName);
		System.out.println(c1.carPrice);
		System.out.println(c1.carMan);
		
		System.out.println(c2.carName+" "+c2.carPrice);
		
		System.out.println(c3.carName+" "+c3.carPrice+" "+c3.carMan);
		System.out.println(c3.getCarName()+" "+c3.getCarPrice()+" "+c3.getCarMan());
	}

} 
