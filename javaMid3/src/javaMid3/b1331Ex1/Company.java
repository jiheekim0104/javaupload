package javaMid3.b1331Ex1;

public class Company {
	static final int computerPrice = 200;
	static final int printerPrice = 50;
	
	String productName;
	int productCnt;
	int total;
	
	public void add(String productName,int productCnt ) {
		this.productName = productName;
		this.productCnt = productCnt;
	}
	
	public int getTotal(String productName,int productCnt ) {
		int productPrice=0;
		if(productName.equals("컴퓨터")) {
			productPrice = computerPrice;
		}
		if(productName.equals("프린터")) {
			productPrice = printerPrice;
		}
		
		return total = productPrice * productCnt;
	}
	
	public int getTotal() {
		return this.total;
	}
	
}
