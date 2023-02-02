package javaMid5.scoreManage;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Business business = new Business();

	public static void main(String[] args) {
		SungJuk e1 = new ElementaryStudent();
		SungJuk m1 = new MIddleStudent();
		SungJuk h1 = new HighStudent();

		boolean isClosed = false;

		while (!isClosed) {
			System.out.println("-------------");
			System.out.println("�������� ���α׷�");
			System.out.println("------����------");
			System.out.println("1.�Է� 2.��� 3.����");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				System.out.println("1.�ʵ��б� 2.���б� 3.����б�");
				int menuNumber = Integer.parseInt(sc.nextLine());
				if (menuNumber == 1) {
					elementaryStudent(e1);
				}

				if (menuNumber == 2) {
					middleStudent(m1);
				}

				if (menuNumber == 3) {
					highStudent(h1);
				}

				break;
			case "2":
				e1.printAll();
				m1.printAll();
				h1.printAll();
				break;

			case "3":
				System.out.println("���α׷��� �����մϴ�.");
				isClosed = true;
				break;

			default:
				System.out.println("�߸������ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			}

		}

	}

	private static void highStudent(SungJuk h1) {
		boolean end = false;
		do {
			System.out.println("-----------------");
			System.out.println("��� ����");
			System.out.println("-----------------");
			System.out.println("1.�Է� 2.��� 3.�б�����");
			System.out.println("-----------------");
			System.out.print("����>");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				business.input(h1);
				break;
			case "2":
				business.print(h1);
				break;
			case "3":
				end = true;
				break;

			}

		} while (!end);

	}


	private static void middleStudent(SungJuk m1) {
		boolean end = false;
		do {
			System.out.println("-----------------");
			System.out.println("�ߵ� ����");
			System.out.println("-----------------");
			System.out.println("1.�Է� 2.��� 3.�б�����");
			System.out.println("-----------------");
			System.out.print("����>");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				business.input(m1);
				break;
			case "2":
				business.print(m1);
				break;
			case "3":
				end = true;
				break;

			}

		} while (!end);

	}

	private static void elementaryStudent(SungJuk e1) {
		boolean end = false;
		do {
			System.out.println("-----------------");
			System.out.println("�ʵ� ����");
			System.out.println("-----------------");
			System.out.println("1.�Է� 2.��� 3.�б�����");
			System.out.println("-----------------");
			System.out.print("����>");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				business.input(e1);
				break;
			case "2":
				business.print(e1);
				break;
			case "3":
				end = true;
				break;

			}

		} while (!end);

	}

}
