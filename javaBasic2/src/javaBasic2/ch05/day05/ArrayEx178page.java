package javaBasic2.ch05.day05;

public class ArrayEx178page {

	public static void main(String[] args) {
		int [][] scores = {
				{80,90,96},
				{76,88}
		};
		
		System.out.println("�迭 ���� ����: "+scores.length);
		System.out.println("0�� ���� ����: "+scores[0].length);
		System.out.println("1�� ���� ����: "+scores[1].length);
		System.out.println("1��°�� 3��° �л��� ����: "+ scores[0][2]);
		System.out.println("2��°�� 2��° �л��� ����: "+ scores[1][1]);

		
		int sum1 =0 ;
		int cnt1 =0 ;
		for (int i =0;i<scores[0].length;i++) {
			sum1 +=scores[0][i];
			cnt1 ++;
		}
		System.out.println("ù��° ���� ���: "+(double)sum1/cnt1);
		
		int sum2 =0 ;
		int cnt2 =0 ;
		for (int i =0;i<scores[1].length;i++) {
			sum2 +=scores[1][i];
			cnt2 ++;
		}
		System.out.println("�ι�° ���� ���: "+(double)sum2/cnt2);
		
		int sum =0;
		for (int s : scores[1]) {
			sum +=s;
		}
		
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		for(int i=0;i<oldIntArray.length;i++) {
			newIntArray[i]=oldIntArray[i];
		}
		
		for (int n : newIntArray) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		newIntArray[3]=4;
		newIntArray[4]=5;
		
		for (int n : newIntArray) {
			System.out.print(n+" ");
		}
		
		int[] newArr1 = new int[10];
		System.arraycopy(newIntArray, 0, newArr1, 0, newIntArray.length);
		
		System.out.println();
		
		int[] ss = {10,25,30,35};
		int[] newSS = new int[7];
		System.arraycopy(ss, 0, newSS, 2,ss.length);
		for (int n : newSS) {
			System.out.print(n+" ");
		}
	
		
	
	
	
	
	}

}
