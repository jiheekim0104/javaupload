package javaMid11.toeic;

import java.util.Scanner;

public class Toeic  {
	int toeicScore;
	Scanner scanner = new Scanner(System.in);
	boolean isClosed = false;
	String continueValue;
	void input() throws Exception  {
		while(!isClosed) {
			System.out.print("���� ����: ");
			toeicScore = Integer.parseInt(scanner.nextLine());
			if(toeicScore<0) {
				throw new ScoreMinException("0�� �̸��� ������ ���ü� �����ϴ�.");
			} else if (toeicScore>0) {
				throw new ScoreMaxException("990�� �ʰ��� ������ ���ü� �����ϴ�.");
			} else {
				System.out.println("����� ���� ������ "+ toeicScore + "�� �Դϴ�.");
			}
			System.out.println("��� �Ͻðڽ��ϱ�? (y/n)");
			continueValue  = scanner.nextLine();
			if(continueValue.equalsIgnoreCase("n")) {
				isClosed = true;
			}
		}
		
	}
}
