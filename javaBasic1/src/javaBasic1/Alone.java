package javaBasic1;

import java.util.Scanner;

public class Alone {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է�:");
		int a = sc.nextInt(); // ������ int�� ����
		
		String text1 = null;
		String text2 = null;
		
		System.out.print("�ι�° ���� �Է�:");
		text1 = sc.next();
		
		
		System.out.print("����° ���� �Է�:");
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
		System.out.print("�Է�:");
		String word = sc.nextLine(); // "�����ٶ�"
		char []wordnumber = word.toCharArray(); // {��,��,��,��} 
		char []newwordnumber = new char[word.length()]; // {  ,  ,  ,  }
		for(int i=0;i<word.length();i++) {
			newwordnumber[i]=wordnumber[word.length()-1-i];  // {��,��,��,��}
		}
		//String newword = newwordnumber.toString(); --> �ٽ� �����غ���!
		String newword = new String(newwordnumber); //��ٳ��� 
		System.out.print("���:"+newword);
		
		sc.close();
		
		
		
	}
}
