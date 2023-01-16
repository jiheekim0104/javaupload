package javaBasic2.ch05.day03;

public class Ex163page {

	public static void main(String[] args) {
		String board = "번호,제목,내용,글쓴이";
		String board1 = "번호1 제목1 내용1 글쓴이1";
		String board2 = "번호2-제목2-내용2-글쓴이2";
		String board3 = "번호3:제목3:내용3:글쓴이3";		
		String board4 = "홍길동-20살,이순신-25살,최영-30살";		
		
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
