package javaMid3.b1331p2;

import java.util.Scanner;

public abstract class Grade {
	
	String subjectName;
	int midScore;
	int endScore;
	int actScore;
	int totalScore;
	String school;
	Scanner sc = new Scanner(System.in);
	
	
	public Grade (String school) {
		this.school = school; 
	}
	
	
	
	public void addGrade() {
		
	}
	
	public void printAll() {
		System.out.println("---------------");
		System.out.println(school+ " �����Դϴ�.");
		System.out.println("---------------");
		System.out.println("�����:"+subjectName);
		System.out.println("����: �߰����("+midScore+"), �⸻���("+endScore+"), ������("+actScore+")");
		System.out.println("����: "+totalScore);
	}
	
}
