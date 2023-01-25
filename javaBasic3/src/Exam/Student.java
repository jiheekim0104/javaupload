package Exam;

import java.util.Scanner;

public class Student {
	String Name;
	String School;
	int grade;


	public void Student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ют╥б: ");
		String input = sc.nextLine();
		String[] array = input.split(" ");
		this.Name = array[0];
		this.School = array[1];
		this.grade = Integer.parseInt(array[2]);
		System.out.println("Name :"+ Name);
		System.out.println("School :"+ School);
		System.out.println("Grade :"+ grade);
		
		
	}
}
