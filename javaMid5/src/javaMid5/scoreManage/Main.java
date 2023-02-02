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
			System.out.println("성적관리 프로그램");
			System.out.println("------메인------");
			System.out.println("1.입력 2.출력 3.종료");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				System.out.println("1.초등학교 2.중학교 3.고등학교");
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
				System.out.println("프로그램을 종료합니다.");
				isClosed = true;
				break;

			default:
				System.out.println("잘못선택하셨습니다. 다시 입력하세요.");
			}

		}

	}

	private static void highStudent(SungJuk h1) {
		boolean end = false;
		do {
			System.out.println("-----------------");
			System.out.println("고등 관리");
			System.out.println("-----------------");
			System.out.println("1.입력 2.출력 3.학교선택");
			System.out.println("-----------------");
			System.out.print("선택>");
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
			System.out.println("중등 관리");
			System.out.println("-----------------");
			System.out.println("1.입력 2.출력 3.학교선택");
			System.out.println("-----------------");
			System.out.print("선택>");
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
			System.out.println("초등 관리");
			System.out.println("-----------------");
			System.out.println("1.입력 2.출력 3.학교선택");
			System.out.println("-----------------");
			System.out.print("선택>");
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
