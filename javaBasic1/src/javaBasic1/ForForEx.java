package javaBasic1;

public class ForForEx {

	public static void main(String[] args) {
		/*
		for(int i=1;i<5;i++) {
			for(int j=1;j<3;j++) {
				System.out.print(i+" "+j+" ");
			}
		}
		*/
		/*
		
		for(int i=2;i<=4;i++) {
			for(int j=5;j>=i;j--) {
				System.out.println(i+" "+j+" ");
			}
		}
		*/
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("["+i+","+j+"]");
			}
			System.out.println();
		}

		System.out.println("------------------");
		
		for(int a=1;a<=2;a++) {
			for(int b=1;b<=2;b++) {
				for(int c=1;c<=2;c++) {
					System.out.print("["+a+","+b+","+c+"]");
				}
				System.out.println();
			}
		}
		
		System.out.println("------------------");
		
		for(int num1=2;num1<=9;num1++) {
			for(int num2=1;num2<=9;num2++) {
				System.out.printf("%3d x %1d =%2d",num1,num2,num1 * num2);
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		
		for(int num3=1;num3<=9;num3++) {
			for(int num4=2;num4<=9;num4++) {
				System.out.printf("%3d x %1d =%2d",num4,num3,num3 * num3);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		}

}
