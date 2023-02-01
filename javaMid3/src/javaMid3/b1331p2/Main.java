package javaMid3.b1331p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Grade[] grades = new Grade[3];
		grades[0]=new Element();
		grades[1]=new Middle();
		grades[2]=new High(); 

		Scanner sc = new Scanner(System.in);
		boolean isClosed = false;
		while (!isClosed) {
			System.out.println("---------------");
			System.out.println("���� ���� ���α׷�");
			System.out.println("---------------");
			System.out.println("1.�Է� 2.��� 3.����");
			System.out.println("---------------");
			System.out.print("�޴�����>");
			String menu = sc.nextLine();
			String input;
			switch (menu) {
			case "1":
				do {
					System.out.println("---------------");
					System.out.println("1.�ʵ��л� 2.���л� 3.����л�");
					System.out.println("---------------");
					System.out.print("�޴�����>");
					int menuNumber = Integer.parseInt(sc.nextLine());
					grades[menuNumber-1].addGrade();
					System.out.println("�߰� �Է��Ͻðڽ��ϱ�?(y/n)");
					input = sc.nextLine();
					if (input.equals("n"))
						break;
				} while (input.equals("y"));
				
				break;
			case "2":
				for(Grade list : grades) {
					list.printAll();
				}
				break;
			case "3":
				System.out.println("���α׷� ����");
				isClosed = true;
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			}

		}
		
		
	}
	
}
