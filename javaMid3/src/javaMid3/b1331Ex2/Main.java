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
			System.out.println("�������� ���α׷�");
			System.out.println("--------");
			System.out.println("1.�Է� 2.��� 3.���� ");
			menu = sc.nextLine();
			int selectNumber;
			switch (menu) {
			case "1" : 
				do {
					System.out.println("1. �ʵ��б� 2. ���б� 3. ����б� ");
					System.out.print("�б�����>");
					selectNumber = Integer.parseInt(sc.nextLine());

					if (selectNumber == 1) {
						System.out.println("�����:");
						String subjectName = sc.nextLine();
						System.out.println("���� - �߰����:");
						int middlescore = Integer.parseInt(sc.nextLine());
						System.out.println(" �⸻���:");
						int endscore = Integer.parseInt(sc.nextLine());
						System.out.println(" ������:");
						int actscore = Integer.parseInt(sc.nextLine());
						elementary.addScore(subjectName, middlescore, endscore, actscore);
					}
			
					if (selectNumber == 2) {
						
					}
					if (selectNumber == 3) {
					
					}
				
				
					System.out.println("��� �Է� �Ͻðڽ��ϱ�?");
					input = sc.nextLine();
					if (input.equals("n"))
						break;
				} while (input.equals("y"));

				break;
			case "2" : 
				break;
			case "3" : 
				System.out.println("���α׷��� �����մϴ�.");
				flag = false;
				break;
			default : 
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �����ϼ���.");
			
			}
		}

	}

}
