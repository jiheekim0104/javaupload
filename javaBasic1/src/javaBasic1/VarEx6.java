package javaBasic1;

import java.util.Scanner;

public class VarEx6 {

	public static void main(String[] args) {
		/* �̸� , �⵵ �Է� ������ ���̸� ����ϴ� ���α׷� �ۼ� */
		System.out.println("---------------");
		System.out.println("���� ��� ���α׷�");
		System.out.println("---------------");

		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�:");
		String name = sc.next();

		System.out.println("����⵵:");
		int year = sc.nextInt();

		int age = 2023 - year;
		System.out.println("����:" + age);

		/*
		 * if (0<= age && age<=7)
		 * {System.out.println("�����Դϴ�.");System.out.println("������ ���� ������ 100������ ��������.");
		 * } else if (8<= age && age<=13)
		 * {System.out.println("����Դϴ�.");System.out.println("����� ��� ������ 50������ ��������.");
		 * } else if (14<= age && age<=19)
		 * {System.out.println("û�ҳ��Դϴ�.");System.out.println("û�ҳ��ΰ�� ������ 20������ ��������.");}
		 * else if (20<= age && age<=60)
		 * {System.out.println("��Դϴ�.");System.out.println("��� ��� ������ 20������ ������.");}
		 * else
		 * {System.out.println("�����Դϴ�.");System.out.println("�����ΰ�� ������ 30������ ��������.");}
		 */

		/*
		 * ageType : ���̺� Ÿ�� (����, ��� .... ) subsidy = 100 -20 (�޴°��� +�� , ���°��� -�� )
		 */
		String ageType; // ���̺� Ÿ��
		int subsidy; // ������

		if (0 <= age && age <= 7) {
			ageType = "����";
			subsidy = 100;
		} else if (8 <= age && age <= 13) {
			ageType = "���";
			subsidy = 50;
		} else if (14 <= age && age <= 19) {
			ageType = "û�ҳ�";
			subsidy = 20;
		} else if (20 <= age && age <= 60) {
			ageType = "�";
			subsidy = 20;
		} else {
			ageType = "����";
			subsidy = 30;
			;
		}

		/*
		 * if (subsidy < 0) { System.out.println("���ϴ�" + ageType + "�Դϴ�." + "������" +
		 * subsidy + "�� ������."); } else { System.out.println("���ϴ�" + ageType + "�Դϴ�." +
		 * "������" + subsidy + "�� ��������."); }
		 */

		/* ���� �ֽ��ϱ�? ���� ������ true ������ false , ��� ���� ������ 10%������ ������ ���� ������ 10%�� �ޱ� */

		System.out.println("���� �ֽ��ϱ�?");
		String home = sc.next();

		/*
		 * System.out.println("--------------------"); if ((home.equals("false") &&
		 * ageType.equals("�"))||(home.equals("false") && ageType.equals("����"))) {
		 * System.out.println("���ϴ�" + ageType + "�Դϴ�." + "������" + Math.abs(subsidy) +
		 * "�� ������."); // ���밪�� �ҷ����ִ� �Լ��� ! } else if (home.equals("true") &&
		 * ageType.equals("����")) { System.out.println("���ϴ�" + ageType + "�Դϴ�." + "������" +
		 * Math.abs(subsidy) + "�� ������.");} else { System.out.println("���ϴ�" + ageType +
		 * "�Դϴ�." + "������" + Math.abs(subsidy) + "�� ������.");
		 * 
		 * }
		 * 
		 * 
		 * if (home.equals("true") && ageType.equals("�")) {
		 * System.out.println("���ϴ� ���� �ִ� ��Դϴ�." + "������" + (int) (subsidy * 1.1) +
		 * "�� ������."); }
		 * 
		 * if (home.equals("true") && ageType.equals("����")) {
		 * System.out.println("���ϴ� ���� �ִ� �����Դϴ�." + "������" + (int) (subsidy * 0.9) +
		 * "�� ������."); }
		 */

		if (home.equals("true") && ageType.equals("�")) {
			System.out.println("���ϴ� ���� �ִ� ��Դϴ�." + "������" + (int) (subsidy * 1.1) + "�� ������.");
		}

		else if (home.equals("false") && ageType.equals("�")) {
			System.out.println("���ϴ�" + ageType + "�Դϴ�." + "������" + subsidy + "�� ������.");
		}

		else if (home.equals("true") && ageType.equals("����")) {
			System.out.println("���ϴ� ���� �ִ� �����Դϴ�." + "������" + (int) (subsidy * 0.9) + "�� ��������.");
		}

		else {
			System.out.println("���ϴ�" + ageType + "�Դϴ�." + "������" + subsidy + "�� ��������.");

		}
		sc.close();

	}
}
