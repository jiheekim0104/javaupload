package javaBasic1;



public class WhileEx {

	public static void main(String[] args) {
		int n = 5;
		while (n <= 10) {
			System.out.println(n);
			n++;
		}

		System.out.println("------------------------------");

		int a = 10;
		while (a >= 5) {
			System.out.println(a + " ");
			a++;
			if (a == 13)
				break;
		}

		System.out.println("------------------------------");

		int num = 1;
		while (num <= 10) {
			System.out.print(num + " ");
			num++;
		}
		
		System.out.println(" ");
		System.out.println("------------------------------");

		int num1 = 0;
		while (num1 <= 100) {
			System.out.print(num1 + " ");
			num1 = num1 + 5;
		}
		
		System.out.println(" ");
		System.out.println("------------------------------");

		int num2 = -100;
		while (num2 <= 100) {
			System.out.print(num2 + " ");
			num2 = num2 + 50;

		}

		System.out.println(" ");
		System.out.println("--------------------------");
		
		
		 /*char text = 'A'; 
		 while ( text <= 'Z') { 
		 System.out.print(text+" "); 
		 text++; 
		 }
		 */
		
		/*
		 char f = 'A'; 
		 while ( f <= 90){
		 	System.out.print(Character.toChars(f));
		 	f++;
		 }
		 */

		
		int textnumber = 65;
		while (textnumber <= 90) {
			char text = (char)textnumber;
			System.out.print(text);
			textnumber = textnumber + 1;
		}
		
		 
		System.out.println(" ");
		System.out.println("--------------------------");

		/* 
		Scanner sc = new Scanner(System.in);
		int num3 = 1;
		while (num3 <= 3) {
			System.out.println("학생 이름" + num3 + ":");
			String name = sc.next();
			num3 = num3 + 1;
		}
		System.out.println("종료되었습니다.");

		System.out.println("--------------------------"); 
		*/
		
		
		
		

		
		
	}
}
