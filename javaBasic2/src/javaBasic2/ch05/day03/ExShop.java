package javaBasic2.ch05.day03;

public class ExShop {

	public static void main(String[] args) {
		Shop s = new Shop();
		s.setName("KT-hand");
		s.setType("핸드폰 가게");
		s.setsale(1000);
		
		System.out.println(s.getName()+" "+s.getType()+" "+s.getsale());
	}

}//class end
class Shop {
	String shopName;
	String shopType;
	int sale;
	
	void setName(String shopName) {
		this.shopName=shopName;
	}
	void setType(String shopType) {
		this.shopType=shopType;
	}
	void setsale(int sale) {
		this.sale=sale;
	}
	
	String getName() {
		return shopName;
	}
	
	String getType() {
		return shopType;
	}
	
	int getsale() {
		return sale;
	}
	
}
