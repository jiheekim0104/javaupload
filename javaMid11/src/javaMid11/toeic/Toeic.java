package javaMid11.toeic;

import java.util.Scanner;

public class Toeic  {
	int toeicScore;
	Scanner scanner = new Scanner(System.in);
	boolean isClosed = false;
	String continueValue;
	void input() throws Exception  {
		while(!isClosed) {
			System.out.print("토익 점수: ");
			toeicScore = Integer.parseInt(scanner.nextLine());
			if(toeicScore<0) {
				throw new ScoreMinException("0점 미만의 점수는 나올수 없습니다.");
			} else if (toeicScore>0) {
				throw new ScoreMaxException("990점 초과의 점수는 나올수 없습니다.");
			} else {
				System.out.println("당신의 토익 점수는 "+ toeicScore + "점 입니다.");
			}
			System.out.println("계속 하시겠습니까? (y/n)");
			continueValue  = scanner.nextLine();
			if(continueValue.equalsIgnoreCase("n")) {
				isClosed = true;
			}
		}
		
	}
}
