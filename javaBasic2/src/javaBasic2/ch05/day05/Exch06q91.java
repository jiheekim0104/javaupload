package javaBasic2.ch05.day05;

import java.util.Scanner;

public class Exch06q91 {
	
	static Scanner sc = new Scanner(System.in);
	static String input;
	static int studentNumber=0;
	static int[] array;
	
	
	public static void main(String[] args) {
		
		boolean flage = true;
		
		while (flage) {
			System.out.println("----------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------");
			System.out.print("메뉴선택: ");
			String menu = sc.nextLine();

			switch ( menu ) {
			case "1" : 
				studentCount();
				break;
				
			case "2" : 
				input();
				break;
				
			case "3" : 
				list(); 
				break;
				
			case "4" : 
				analyze();
				break;
			
			case "5" : 
				System.out.println("프로그램 종료");
				flage = false;
				break;
			default : System.out.println("메뉴번호를 다시 입력해주세요.");
			}		
		}
	}
	


	private static void analyze() {
		int best=0;
		int sum=0;
		int cnt=0;
		for(int score:array) {
			if(score>=best) {
				best = score;
			}
			sum+=score;
			cnt++;
			}
		System.out.println("최고 점수: "+best);
		System.out.println("평균 점수: "+ (double)sum/cnt );
		}
		
	
	private static void list() {
		for(int i=0;i<studentNumber;i++)  {
			System.out.println("array["+i+"]: "+array[i]);
		}
		
	}

	private static void input() {
		for(int i=0;i<studentNumber;i++) {
			System.out.print("array["+i+"]: ");
			array[i]=Integer.parseInt(sc.nextLine());
		}
		
	}

	private static void studentCount() {
		System.out.print("학생수:");
		input = sc.nextLine();
		studentNumber = Integer.parseInt(input);
		array = new int[studentNumber];
	}


}


