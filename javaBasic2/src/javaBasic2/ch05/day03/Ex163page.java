package javaBasic2.ch05.day03;

public class Ex163page {

	public static void main(String[] args) {
		String board = "��ȣ,����,����,�۾���";
		String board1 = "��ȣ1 ����1 ����1 �۾���1";
		String board2 = "��ȣ2-����2-����2-�۾���2";
		String board3 = "��ȣ3:����3:����3:�۾���3";		
		String board4 = "ȫ�浿-20��,�̼���-25��,�ֿ�-30��";		
		
		String[] b = board.split(",");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		
		String[] b1 = board1.split(" ");
		System.out.println(b1[0]);
		System.out.println(b1[1]);
		System.out.println(b1[2]);
		System.out.println(b1[3]);
		
		String[] b2= board2.split("-");
		System.out.println(b2[0]);
		System.out.println(b2[1]);
		System.out.println(b2[2]);
		System.out.println(b2[3]);
		
		String[] b3 = board3.split(":");
		System.out.println(b3[0]);
		System.out.println(b3[1]);
		System.out.println(b3[2]);
		System.out.println(b3[3]);
		
		String[] b4 = board4.split(",");
		String[] b41 = b4[0].split("-");
		String[] b42 = b4[1].split("-");
		String[] b43 = b4[2].split("-");
		System.out.println(b41[0]);
		System.out.println(b41[1]);
		System.out.println(b42[0]);
		System.out.println(b42[1]);
		System.out.println(b43[0]);
		System.out.println(b43[1]);
		
	}

}
