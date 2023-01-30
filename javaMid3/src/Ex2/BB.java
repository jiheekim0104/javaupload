package Ex2;


public class BB {
	int a =0;
	int endNum;
	int sum=0;
	
	public int sumM(int endNum) {
		for(a=0;a<endNum;a++) {
			sum += a;
		}
		return sum;
	}
	
	public int subM(int endNum) {
		sum -= endNum;
		return sum;
	}
	
}
