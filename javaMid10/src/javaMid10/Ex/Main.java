package javaMid10.Ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Score score = new Score();
		String answer = null;
	
			try {
				System.out.print("����� ���� ������ ġ����>>");
				do {
					int input = Integer.parseInt(sc.nextLine());
					score.getScore(input);
					System.out.println("����� ���������� "+ input +"�Դϴ�.");
					System.out.println("����Ͻðڽ��ϱ�? (y/n) ");
					answer = sc.nextLine();
					if(answer.equals("n")) break;
				}  while (answer.equals("y")); 
				
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}


	}


