package javaBasic2.ch05.day02;

import java.util.Scanner;

public class ClassEx01 {

	public static void main(String[] args) {
		GiftSetSeller g = new GiftSetSeller();
		inputM(g); // (1) () �ȿ� ������ �Ἥ ���� ������ �˷���!
		GiftSetSeller g1 = new GiftSetSeller();
		inputM(g1);
		GiftSetSeller g2 = new GiftSetSeller();
		inputM(g2);

		int salePrice = g.salePriceMethod(g.proPrice, g.proCnt);
		String attainMent = g.attainMentMethod(salePrice);
		System.out.println("����ϱ�");
		System.out.println("��ǰ�ڵ�  ��ǰ��  ����  ����  �Ǹűݾ�  �޼�");
		System.out.println( g.proID + "  " + g.proName + " " + g.proPrice + " " + g.proCnt + " " + salePrice + " " + attainMent);

		salePrice = g1.salePriceMethod(g1.proPrice, g1.proCnt);
		attainMent = g1.attainMentMethod(salePrice);
		System.out.println(g1.proID + "  " + g1.proName + " " + g1.proPrice + " " + g1.proCnt + " " + salePrice + " "+ attainMent);

		salePrice = g2.salePriceMethod(g2.proPrice, g2.proCnt);
		attainMent = g2.attainMentMethod(salePrice);
		System.out.println(g2.proID + "  " + g2.proName + " " + g2.proPrice + " " + g2.proCnt + " " + salePrice + " "+ attainMent);
		
	}

	static void inputM(GiftSetSeller g) { // (2) ���⼭ �������� ���� ������� ����
		System.out.println("-------------------");
		System.out.println("���� ��Ʈ �Ǹ�");
		System.out.println("-------------------");
		System.out.println();
		System.out.println("�Է�ȭ��");

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("��ǰ �ڵ�:");
		g.proID = sc.nextLine();
		System.out.print("��ǰ��:");
		g.proName = sc.nextLine();
		System.out.print("��ǰ ����:");
		g.proPrice = sc.nextInt();
		System.out.print("�ǸŰ���:");
		g.proCnt = sc.nextInt();
		sc.nextLine();

	}
} // CLASS END

class GiftSetSeller {
	String proID;
	String proName;
	int proPrice;
	int proCnt;

	int salePriceMethod(int proPrice, int proCnt) {
		return proPrice * proCnt;
	}

	String attainMentMethod(int salePrice) {
		if (salePrice >= 100000)
			return "����";
		else
			return "���";
	}

}
