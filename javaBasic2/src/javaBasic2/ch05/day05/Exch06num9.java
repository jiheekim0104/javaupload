package javaBasic2.ch05.day05;

import java.util.Scanner;

public class Exch06num9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;

				
		boolean flage = true;
		
		while (flage) {
			System.out.println("----------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------");
			System.out.println("메뉴선택: ");
			String menu = sc.nextLine();

			switch ( menu ) {
			case "1" : 
				System.out.print("학생수: ");
				input = sc.nextLine();
				studentCount(Integer.parseInt(input));
				
				break;
				
			case "2" : input();
				
				break;
				
			case "3" : list(); 
				break;
				
			case "4" : analyze();
				
				break;
			
			case "5" : 
				flage = false;
				break;
			default : System.out.println("메뉴번호를 다시 입력해주세요.");
			}
			
			
			
			
		}
		

	}
	
	
private static void studentCount(int parseInt) {
		// TODO Auto-generated method stub
		
	}
class ExamProgram{
	int studentent;
	

	void studentCount(int studentent) {
		this.studentent=studentent;
	}

}

}
