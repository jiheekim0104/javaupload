package ch02.sec01;

import java.util.Scanner;

public class VarEx30 {

	public static void main(String[] args) {
		System.out.println("-------------------------");
		System.out.println("체질량지수를 구하는 프로그램");
		System.out.println("-------------------------");
		
		Scanner sc = new Scanner(System.in); 

		System.out.print("몸무게:");
		String mom  =sc.next();
		
		System.out.print("키:");
		String key  =sc.next();
		
		/* System.out.print("성별:");
		String data = sc.next();
		if(data == "남자") {System.out.println("true");}
		else {System.out.println("false");} */
		
		 System.out.print("성별:");
		 boolean gender = sc.nextBoolean();

	
		double mom1 = Double.parseDouble(mom);
		double key1 = Double.parseDouble(key);
		double cul = mom1/(key1*key1)*10000;
		
	System.out.println(cul);
		System.out.println("-------------------------");
		System.out.println("당신의 체질량지수는:"+" "+ cul +"입니다.");
		
		if (cul<18.5) {System.out.println("저체중입니다.");}
		else if (18.5<=cul && cul<23) {System.out.println("정상입니다.");}
		else if (23<=cul && cul<25) {System.out.println("과체중입니다.");}
		else {System.out.println("비만입니다.");}
			
		System.out.println("-------------------------");
		
		
	}

}
