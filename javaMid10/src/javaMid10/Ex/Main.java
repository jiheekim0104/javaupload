package javaMid10.Ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Score score = new Score();
		String answer = null;
	
			try {
				System.out.print("당신의 토익 점수를 치세요>>");
				do {
					int input = Integer.parseInt(sc.nextLine());
					score.getScore(input);
					System.out.println("당신의 토익점수는 "+ input +"입니다.");
					System.out.println("계속하시겠습니까? (y/n) ");
					answer = sc.nextLine();
					if(answer.equals("n")) break;
				}  while (answer.equals("y")); 
				
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}


	}


