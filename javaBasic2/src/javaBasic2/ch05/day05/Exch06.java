package javaBasic2.ch05.day05;

public class Exch06 {

	public static void main(String[] args) {
		//7번
		int[] array7 = {1,2,3,4,5};
		int max = 0;
		for(int a:array7) {
			if(a>max) {
				max = a;
			}
		}
		System.out.println(max);
		
		//8번
		int[][] array8 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum8 =0;
		int cnt8 = 0;
		for(int i=0;i<array8.length;i++) {
			for(int j=0;j<array8[i].length;j++) {
				sum8+=array8[i][j];
				cnt8++;
			}
		}
		System.out.println("전체 합: "+sum8+"  평균: "+(double)sum8/cnt8);
		
		
		
		
		
		
	}

}
