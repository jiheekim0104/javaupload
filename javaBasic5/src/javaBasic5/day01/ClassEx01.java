package javaBasic5.day01;

import dao.BookDao;

public class ClassEx01 {

	public static void main(String[] args) {
		Ex01.a();
		
		Ex01 ex01 = new Ex01();
		ex01.b();

		BookDao bookdao = new BookDao();
		bookdao.setName("김지희");
		
	}

}
class Ex01 {
	static int k = 100;
	int s =200;
	static void a () {
		k += 200;
		//s+=10; 컴파일 오류, 인스턴스 변수는 정적 메소드안에서 사용 불가능.
		
	}
	void b() {
		s +=10;
		k+=100; // 인스턴스 메소드안에는 정적 변수 사용 가능 !
		
	}
} 