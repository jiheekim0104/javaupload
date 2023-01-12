package javaBasic1;

import java.util.Scanner;

public class Alone {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력:");
		int a = sc.nextInt(); // 다음을 int로 받음
		
		String text1 = null;
		String text2 = null;
		
		System.out.print("두번째 숫자 입력:");
		text1 = sc.next();
		
		
		System.out.print("세번째 숫자 입력:");
		text2 = sc.next();
		
		int []array0 = new int[3];
		System.out.println(array0[0]+" "+array0[1]+" "+array0[2]);
		System.out.println("---------------------------");
		
		String text = "1234";
		char[] array1 = text.toCharArray();
		char[] newarray1 = new char[4];
		for(int i=0;i<4;i++) {
			newarray1[i]=array1[3-i];
		}
		System.out.println(newarray1[0]+" "+newarray1[1]+" "+newarray1[2]+" "+newarray1[3]);
		System.out.println("---------------------------");
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		String word = sc.nextLine(); // "가나다라"
		char []wordnumber = word.toCharArray(); // {가,나,다,라} 
		char []newwordnumber = new char[word.length()]; // {  ,  ,  ,  }
		for(int i=0;i<word.length();i++) {
			newwordnumber[i]=wordnumber[word.length()-1-i];  // {라,다,나,가}
		}
		//String newword = newwordnumber.toString(); --> 다시 생각해볼것!
		String newword = new String(newwordnumber); //라다나가 
		System.out.print("결과:"+newword);
		
		sc.close();
		
		
		
	}
}
