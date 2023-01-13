package javaBasic2.ch05.day02;

import java.util.Scanner;

public class ClassEx01 {

	public static void main(String[] args) {
		GiftSetSeller g = new GiftSetSeller();
		inputM(g); // (1) () 안에 변수를 써서 직접 번지를 알려줌!
		GiftSetSeller g1 = new GiftSetSeller();
		inputM(g1);
		GiftSetSeller g2 = new GiftSetSeller();
		inputM(g2);

		int salePrice = g.salePriceMethod(g.proPrice, g.proCnt);
		String attainMent = g.attainMentMethod(salePrice);
		System.out.println("출력하기");
		System.out.println("상품코드  상품명  가격  갯수  판매금액  달성");
		System.out.println( g.proID + "  " + g.proName + " " + g.proPrice + " " + g.proCnt + " " + salePrice + " " + attainMent);

		salePrice = g1.salePriceMethod(g1.proPrice, g1.proCnt);
		attainMent = g1.attainMentMethod(salePrice);
		System.out.println(g1.proID + "  " + g1.proName + " " + g1.proPrice + " " + g1.proCnt + " " + salePrice + " "+ attainMent);

		salePrice = g2.salePriceMethod(g2.proPrice, g2.proCnt);
		attainMent = g2.attainMentMethod(salePrice);
		System.out.println(g2.proID + "  " + g2.proName + " " + g2.proPrice + " " + g2.proCnt + " " + salePrice + " "+ attainMent);
		
	}

	static void inputM(GiftSetSeller g) { // (2) 여기서 변수형과 같이 들어오면됨 ㅇㅇ
		System.out.println("-------------------");
		System.out.println("선물 세트 판매");
		System.out.println("-------------------");
		System.out.println();
		System.out.println("입력화면");

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("상품 코드:");
		g.proID = sc.nextLine();
		System.out.print("상품명:");
		g.proName = sc.nextLine();
		System.out.print("상품 가격:");
		g.proPrice = sc.nextInt();
		System.out.print("판매갯수:");
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
			return "잘함";
		else
			return "노력";
	}

}
