package javaBasic3.ch06.day01;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] array = input.split(" ");
		System.out.println("Name :"+ array[0]);
		System.out.println("School :"+ array[1]);
		System.out.println("Grade :"+ array[2]);

	}

}


	

