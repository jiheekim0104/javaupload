package javaBasic2.ch05.day04;

public class ArrayEx01 {

	public static void main(String[] args) {
		/*
		int[] a3 = {1,2,3,4,5};
		System.out.println(a3[0]);
		*/
		
		double[] number = {1.1,3.3,5.4,10.3,8.9,11.23};
		System.out.println(number[3]-number[1]);
		for(int a =0; a<number.length;a++) {
			System.out.print(number[a]+" ");
		}
		for (double e:number) {
			System.out.print(e+" ");
		}
		System.out.println();
		
		boolean[] ox = {true,false,false,true,true,false,false,true};
		System.out.println(ox[7]);
		for(int b =0; b<ox.length;b++) {
			System.out.print(ox[b]+" ");
		}
		for (boolean f:ox) {
			System.out.print(f+" ");
		}
		System.out.println();
		
		String[] food = {"µ·±î½º","±è¹ä","¶±ººÀÌ","ÇÇÀÚ"};
		System.out.println(food[1]+" "+food[2]);
		for(int c =0; c<food.length;c++) {
			System.out.print(food[c]+" ");
		}
		for (String g:food) {
			System.out.print(g+" ");
		}
		System.out.println();
		
		int[] a3 = {1,2,3,4,5};
		for (int i=0;i<a3.length;i++) {
			System.out.print(a3[i]+" ");
		}
		for(int d:a3) { //Çâ»óµÈ for¹®
			System.out.print(d+" ");
		}
		System.out.println();
		
		System.out.println(food[0].length());
		
		System.out.println("-------------------");
		
		
		
		
		
		
		
		
	
		
		
		
				
		
		
		

	}

}
