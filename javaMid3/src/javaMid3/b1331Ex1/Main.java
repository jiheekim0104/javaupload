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
			System.out.println("     판매량 관리 프로젝트");
			System.out.println("------------------------");
			System.out.println("1. 입력  2. 출력 3. 종료");
			System.out.print("선택>");
			String input = sc.nextLine();
			String inputProduct;
			int selectNumber;
			int saleCnt;
			
			
			switch (input) {
			case "1":
				do {
					System.out.println("1. 서울지사 2. 경인지사 3. 강원지사 4. 제주지사");
					System.out.print("지사선택>");
					selectNumber = Integer.parseInt(sc.nextLine());

					System.out.print("제품입력>");
					inputProduct = sc.nextLine();

					System.out.print("판매량>");
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
					

					System.out.println("계속 입력 하시겠습니까?");
					input = sc.nextLine();
					if (input.equals("n"))
						break;
				} while (input.equals("y"));

				break;

			case "2":
				System.out.println("서울지사" + " " + seoul.productName + " " + seoul.productCnt + " " + seoul.total);
				System.out.println("경인지사" + " " + koungin.productName + " " + koungin.productCnt + " " + koungin.total);
				System.out.println("강원지사" + " " + kangwon.productName + " " + kangwon.productCnt + " " + kangwon.total);
				System.out.println("제주지사" + " " + jeju.productName + " " + jeju.productCnt + " " + jeju.total);
				break;

			case "3":
				System.out.println("프로그램 종료");
				flag = false;
				break;

			default:
				System.out.println("잘못입력하셨습니다. 다시 선택하세요.");

			}

		}

	}

}
