package javaBasic5.day01;

import dao.BookDao;

public class ClassEx01 {

	public static void main(String[] args) {
		Ex01.a();
		
		Ex01 ex01 = new Ex01();
		ex01.b();

		BookDao bookdao = new BookDao();
		bookdao.setName("������");
		
	}

}
class Ex01 {
	static int k = 100;
	int s =200;
	static void a () {
		k += 200;
		//s+=10; ������ ����, �ν��Ͻ� ������ ���� �޼ҵ�ȿ��� ��� �Ұ���.
		
	}
	void b() {
		s +=10;
		k+=100; // �ν��Ͻ� �޼ҵ�ȿ��� ���� ���� ��� ���� !
		
	}
} 