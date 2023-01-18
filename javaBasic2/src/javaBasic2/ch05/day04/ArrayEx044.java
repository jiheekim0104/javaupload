package javaBasic2.ch05.day04;

import java.util.Scanner;

public class ArrayEx044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie[] m = {new Movie(),new Movie(),new Movie()};
		for(int i=0;i<m.length;i++) {
			
			System.out.println((i+1)+"��° ���ڵ�(��):");
			System.out.print("��ȭ��:");
			String moviename =sc.nextLine(); 
			System.out.print("��ȭ����:");
			int movieprice =sc.nextInt();
			sc.nextLine();
			System.out.print("����:");
			int age =sc.nextInt();
			sc.nextLine();
			System.out.print("���Ź��:");
			String type =sc.nextLine();
			m[i].setMovieName(moviename);
			m[i].setPrice(movieprice);
			m[i].setAge(age);
			m[i].setType(type);
			m[i].priceCalc();
		}
		System.out.printf("%10s %10s %10s %10s","��ȭ��","�ݾ�","����","�Ǳ��űݾ�");
		System.out.println();
		for(int i=0;i<m.length;i++) {
		System.out.printf("%10s %10s %10s %10d",m[i].getMovieName(),m[i].getMoviePrice(),m[i].getAge(),m[i].getPrice());	
		System.out.println();
		}
	}

} //class end

class Movie {
	String movieName;
	int moviePrice;
	int age;
	String type;
	int price;
	double rate;
	
	int priceCalc() {
		if (age<20) {
			rate=0.25;
		} else if (20<=age && age<30) {
			rate=0.2;
		} else {
			rate=0.15;
		}
	
		if (type.equals("���ͳ�")) {
			rate +=0.05;
		} else if (type.equals("����")) {
			rate +=0.10;
		} 
		price = (int) (moviePrice * (1-rate));
			return price;
	}
		
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getMoviePrice() {
		return moviePrice;
	}

	public void setMoviePrice(int moviePrice) {
		this.moviePrice = moviePrice;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int moviePrice) {
		this.moviePrice = moviePrice;
	}

	
}
