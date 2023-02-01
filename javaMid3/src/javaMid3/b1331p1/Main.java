package javaMid3.b1331p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Company[] companies = new Company[4];
		companies[0] = new Seoul();
		companies[1] = new Kyongin();
		companies[2] = new Kangwon();
		companies[3] = new Jeju();

		Scanner sc = new Scanner(System.in);
		boolean isClosed = false;
		while (!isClosed) {
			System.out.println("----------");
			System.out.println("�Ǹŷ����� ������Ʈ");
			System.out.println("----------");
			System.out.println("1.�Է� 2.��� 3.����");
			System.out.print("�޴�����>");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				do {
					System.out.println("----------");
					System.out.println("1.���� 2.���� 3.���� 4.����");
					System.out.println("----------");
					System.out.print("���缱��>");
					int menuNumber = Integer.parseInt(sc.nextLine());
					companies[menuNumber-1].addlist();
					System.out.println("�߰��Է��Ͻðڽ��ϱ�?");
					menu = sc.nextLine();
					if (menu.equals("n"))
						break;
				} while (menu.equals("y"));

				break;
			case "2":
				System.out.println("----------");
				System.out.println("�� ���纰 �Ǹ� ��Ȳ");
				System.out.println("----------");
				System.out.println("�����  ��ǰ��  ��ǰ����  �Ǹŷ�  ������Ȳ");
				for(Company company : companies)
					company.printAll();
				break;
			case "3":
				System.out.println("�ý����� �����մϴ�.");
				isClosed = true;
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է��ϼ���.");
			}
		}

	}

}
