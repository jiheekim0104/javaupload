package javaMid3.b1331Ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Seoul seoul = new Seoul();
		Koungin koungin = new Koungin();
		Kangwon kangwon = new Kangwon();
		Jeju jeju = new Jeju();
		boolean flag = true;
		while (flag) {
			System.out.println("------------------------");
			System.out.println("     �Ǹŷ� ���� ������Ʈ");
			System.out.println("------------------------");
			System.out.println("1. �Է�  2. ��� 3. ����");
			System.out.print("����>");
			String input = sc.nextLine();
			String inputProduct;
			int selectNumber;
			int saleCnt;
			
			
			switch (input) {
			case "1":
				do {
					System.out.println("1. �������� 2. �������� 3. �������� 4. ��������");
					System.out.print("���缱��>");
					selectNumber = Integer.parseInt(sc.nextLine());

					System.out.print("��ǰ�Է�>");
					inputProduct = sc.nextLine();

					System.out.print("�Ǹŷ�>");
					saleCnt = Integer.parseInt(sc.nextLine());

					if (selectNumber == 1) {
						seoul.add(inputProduct, saleCnt);
						seoul.getTotal(inputProduct, saleCnt);
					}
			
					if (selectNumber == 2) {
						koungin.add(inputProduct, saleCnt);
						koungin.getTotal(inputProduct, saleCnt);
					}
					if (selectNumber == 3) {
						kangwon.add(inputProduct, saleCnt);
						kangwon.getTotal(inputProduct, saleCnt);
					}
					if (selectNumber == 4) {
						jeju.add(inputProduct, saleCnt);
						jeju.getTotal(inputProduct, saleCnt);
					}
					

					System.out.println("��� �Է� �Ͻðڽ��ϱ�?");
					input = sc.nextLine();
					if (input.equals("n"))
						break;
				} while (input.equals("y"));

				break;

			case "2":
				System.out.println("��������" + " " + seoul.productName + " " + seoul.productCnt + " " + seoul.total);
				System.out.println("��������" + " " + koungin.productName + " " + koungin.productCnt + " " + koungin.total);
				System.out.println("��������" + " " + kangwon.productName + " " + kangwon.productCnt + " " + kangwon.total);
				System.out.println("��������" + " " + jeju.productName + " " + jeju.productCnt + " " + jeju.total);
				break;

			case "3":
				System.out.println("���α׷� ����");
				flag = false;
				break;

			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �����ϼ���.");

			}

		}

	}

}
