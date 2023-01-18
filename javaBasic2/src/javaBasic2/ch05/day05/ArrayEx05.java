package javaBasic2.ch05.day05;

public class ArrayEx05 {

	public static void main(String[] args) {
		//다차원 배열
		int[][] a = new int[2][3];
		a[0][0] = 5;
		a[1][1] = 10;
		
		int[][]b = {
				{1,2,3},
				{4,5,6}
		};
		
		
		int[][]c = {
				{4,3},
				{5,7}
		};
		
		int [][] d = {
				{1,2,3,4},
				{5,6,7,8}
		};
		
		String [][] e = {
				{"a","b","c"},
				{"d","e","f"},
				{"g","h","i"}
		};
		
		int [][][] f = {
				{{1},{2}},
				{{3},{4}},
				{{5},{6}},
				{{7},{8}},
		};
		
		int[][] bb = new int[2][3];
		
		String [][] ee= new String[3][3];
		int [][][] ff = new int[4][2][1];
		
		System.out.println(b[0][0]+""+b[0][1]+""+b[0][2]);
		System.out.println(b[1][0]+""+b[1][1]+""+b[1][2]);
		
		System.out.println(e[0][0]+e[0][1]+e[0][2]);
		System.out.println(e[1][0]+e[1][1]+e[1][2]);
		System.out.println(e[2][0]+e[2][1]+e[2][2]);
		
		
		
	}

}//class end 
