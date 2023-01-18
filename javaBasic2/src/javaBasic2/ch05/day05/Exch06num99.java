package javaBasic2.ch05.day05;

import java.util.Scanner;

public class Exch06num99 {

	public static void main(String[] args) {
		ScoreManagement sm = new ScoreManagement();
		Scanner sc = new Scanner(System.in);
		int[] array=null;
				
		boolean flage = true;
		
		while (flage) {
			System.out.println("----------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------");
			System.out.print("메뉴선택: ");
			String menu = sc.nextLine();

			switch ( menu ) {
			case "1" :
				array = sm.studentCount(sc);
				break;
				
			case "2" :
				sm.input(array,sc);
				break;
				
			case "3" : 
				sm.list(array); 
				break;
				
			case "4" : 
				sm.analyze(array);
				break;
			
			case "5" : 
				System.out.println("프로그램 종료");
				flage = false;
				break;
			default : System.out.println("메뉴번호를 다시 입력해주세요.");
			}
						
		}		

	}

} // class end

class ScoreManagement {	
	int[] studentCount(Scanner sc) {
		System.out.print("학생수: ");
		String input = sc.nextLine();
		int studentNumber =Integer.parseInt(input);
		return new int[studentNumber];
	}
	
	void input(int[] array,Scanner sc) {
		for(int i=0;i<array.length;i++) {
			System.out.print("scores["+i+"]: ");
			array[i]=Integer.parseInt(sc.nextLine());
		}
	}
	
	void list(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println("scores["+i+"]: "+array[i]);	
		}
		
	}
	
	void analyze(int[] array) {
		int sum = 0;
		int best = 0;
		for(int score:array) {
			sum+=score;
			if(score>=best) {
				best=score;
			}
		}
		System.out.println("최고 점수: "+ best);
		System.out.println("평균 점수: "+ (double)sum/array.length);
		
	}
	
  
	
}

