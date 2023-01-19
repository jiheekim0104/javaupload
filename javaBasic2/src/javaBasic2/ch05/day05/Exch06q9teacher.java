package javaBasic2.ch05.day05;

import java.util.Scanner;

public class Exch06q9teacher {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		boolean flage = true;
		int scount =0;
		int[] scores = null;
		
		while (flage) {
			System.out.println("----------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------");
			System.out.print("메뉴선택: ");
			String menu = sc.nextLine();
			
			
			
			switch ( menu ) {
			case "1" : 
				scount = studentCount();
				break;
				
			case "2" : 
				scores = input(scount);
				break;
				
			case "3" : 
				list(scores); 
				break;
				
			case "4" : 
				analyze(scores);
				break;
			
			case "5" : 
				System.out.println("프로그램 종료");
				flage = false;
				break;
			default : System.out.println("메뉴번호를 다시 입력해주세요.");
			}		
		}
	}

	private static void analyze(int[] scores) {
		int best=0;
		int sum=0;
		for(int i :scores) {
			if(i>=best) {
				best=i;
			}
			sum+=i;
		}
		System.out.println("최고 점수: "+ best);
		System.out.println("평균 점수: "+ (double)sum/(scores.length));
	}

	private static void list(int[] scores) {
		for(int i =0;i<scores.length;i++) {
			System.out.println("score["+i+"]:"+scores[i]);
		}
		
	}

	private static int[] input(int scount) {
		int[] scores = new int[scount];
		for(int i =0;i<scount;i++) {
			System.out.print("score["+i+"]:");
			scores[i]=sc.nextInt();
			sc.nextLine();
		}
		return scores;
		
	}

	private static int studentCount() {
		System.out.print("학생수: ");
		int scount= sc.nextInt();
		sc.nextLine();
		return scount;
	}
	
	
	


	


}


