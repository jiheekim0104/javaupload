package ch02.sec01;

import java.util.Scanner;

public class VarEx3 {

	public static void main(String[] args) {
		/*이름 : 홍길동
		국어 : 100
		영어 : 80
		수학 : 90
		
		출력화면 :
		-----------------------------
		홍길동 100 80 90 270 90 1등 
		---------------------------- */
		
		Scanner sc = new Scanner(System.in); 

		System.out.print("이름:");
		String name  =sc.next(); // 이거 대신에 int kor =sc.netInt();써도됨 ㅇㅅㅇ!
		
		System.out.print("국어:");
		String kor  =sc.next();
		
		System.out.print("영어:");
		String eng  =sc.next();
		
		System.out.print("수학:");
		String math  =sc.next();
		
		int kor1 = Integer.parseInt(kor);
		int eng1 = Integer.parseInt(eng);
		int math1 = Integer.parseInt(math);
		int total = kor1 + eng1 + math1;
		
		System.out.println("-------------------------");
		System.out.println(name +" "+ kor +" "+ eng +" "+ math +" "+total +" " + (total/3) +" " + "1");
		System.out.println("-------------------------");
		
		
	}

}
