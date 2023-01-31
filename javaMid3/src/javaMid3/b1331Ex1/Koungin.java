package javaMid3.b1331Ex1;

public class Koungin extends Company {
	String productName;
	int productCnt;
	int total;
	
	@Override
	public void add(String productName,int productCnt ) {
		this.productName = productName;
		this.productCnt = productCnt;
	}
	
	@Override
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
	
	public void total() {
		this.total = getTotal(productName, productCnt);
	}
}
