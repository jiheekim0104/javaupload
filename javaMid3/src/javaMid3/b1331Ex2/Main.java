package javaMid3.b1331Ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		Elementary elementary = new Elementary();
		String menu;
		String input;
		while(flag) {
			System.out.println("--------");
			System.out.println("성적관리 프로그램");
			System.out.println("--------");
			System.out.println("1.입력 2.출력 3.종료 ");
			menu = sc.nextLine();
			int selectNumber;
			switch (menu) {
			case "1" : 
				do {
					System.out.println("1. 초등학교 2. 중학교 3. 고등학교 ");
					System.out.print("학교선택>");
					selectNumber = Integer.parseInt(sc.nextLine());

					if (selectNumber == 1) {
						System.out.println("과목명:");
						String subjectName = sc.nextLine();
						System.out.println("시험 - 중간고사:");
						int middlescore = Integer.parseInt(sc.nextLine());
						System.out.println(" 기말고사:");
						int endscore = Integer.parseInt(sc.nextLine());
						System.out.println(" 수행평가:");
						int actscore = Integer.parseInt(sc.nextLine());
						elementary.addScore(subjectName, middlescore, endscore, actscore);
					}
			
					if (selectNumber == 2) {
						
					}
					if (selectNumber == 3) {
					
					}
				
				
					System.out.println("계속 입력 하시겠습니까?");
					input = sc.nextLine();
					if (input.equals("n"))
						break;
				} while (input.equals("y"));

				break;
			case "2" : 
				break;
			case "3" : 
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			default : 
				System.out.println("잘못입력하셨습니다. 다시 선택하세요.");
			
			}
		}

	}

}
