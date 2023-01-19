package javaBasic3.ch06.day01;

public class ClassEx03 {

	public static void main(String[] args) {
		//생성자끼리 호출하기
		Book b = new Book();
		System.out.println(b.bookTitle+" "+b.bookPrice);
	}

}

class Book {
	String bookTitle;
	int bookPrice;
	
	public Book() {
		this(30000); //생성자가 또 다른 생성자를 호출!
		System.out.println("이곳은 기본 생성자이다.");
	}
	
	public Book(int bookPrice) {
		this("이것이 css이다.");
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
