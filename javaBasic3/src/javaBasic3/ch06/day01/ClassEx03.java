package javaBasic3.ch06.day01;

public class ClassEx03 {

	public static void main(String[] args) {
		//�����ڳ��� ȣ���ϱ�
		Book b = new Book();
		System.out.println(b.bookTitle+" "+b.bookPrice);
	}

}

class Book {
	String bookTitle;
	int bookPrice;
	
	public Book() {
		this(30000); //�����ڰ� �� �ٸ� �����ڸ� ȣ��!
		System.out.println("�̰��� �⺻ �������̴�.");
	}
	
	public Book(int bookPrice) {
		this("�̰��� css�̴�.");
		this.bookPrice=bookPrice;
	}
	
	public Book(String bookTitle) {
		this.bookTitle=bookTitle;
	}
	
	public Book(String bookTitle, int bookPrice) {
		this.bookTitle=bookTitle;
		this.bookPrice=bookPrice;
	}
	
	
	
	
}
