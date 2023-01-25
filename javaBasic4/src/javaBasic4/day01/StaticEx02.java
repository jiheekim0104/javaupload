package javaBasic4.day01;

public class StaticEx02 {

		static int a = 100;
		static double b = 3.14;
		static String name = "홍길동";
		
		int c = 200;
		double d = 5.5;
		String addr = "하남시";
		
		public static void main(String[] args) {	
			System.out.println(a+" "+ b+" "+name);

			StaticEx02 se02 = new StaticEx02();
			System.out.println(se02.c+" "+ se02.d+" "+se02.addr);
			
			
	}

}
