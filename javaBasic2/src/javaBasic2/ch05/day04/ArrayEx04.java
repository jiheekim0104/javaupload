package javaBasic2.ch05.day04;

public class ArrayEx04 {

	public static void main(String[] args) {
		BuyMovie[] movieArr = {new BuyMovie(),new BuyMovie(),new BuyMovie()};
		movieArr[0].setName("1917");
		movieArr[0].setPrice(11000);
		movieArr[0].setAge(10);
		movieArr[0].setBuyMethod("인터넷");
		
		movieArr[1].setName("주디");
		movieArr[1].setPrice(15000);
		movieArr[1].setAge(25);
		movieArr[1].setBuyMethod("현장");
		
		movieArr[2].setName("인비저블맨");
		movieArr[2].setPrice(12500);
		movieArr[2].setAge(40);
		movieArr[2].setBuyMethod("쿠폰");
		
		
		System.out.println("영화명   금액   나이   실구매금액");
		for(int i=0; i<movieArr.length;i++) {
			movieArr[i].getBuyMethod(); // 구매 방법에 따라서 할인 퍼센트가 정해지니까, 할인 퍼센트 호출전에 구매 방법을 먼저 호출함!
			movieArr[i].getSalePercent(); // 할인 퍼센트가 구해진 다음에 실가격이 계산되니까, 먼저 호출해주는 칸이 필요함! but 출력은 필요가 없음!
			System.out.println(movieArr[i].getName()+" "+movieArr[i].getPrice()+" "+movieArr[i].getAge()+" "+  movieArr[i].getRealPrice() );
		}
		
		
	}

}//class end

class BuyMovie {
	String name;
	int price;
	int age;
	String buyMethod;
	int salePercent;
	int realPrice;
	
	
	public int getRealPrice() {
		realPrice= price *(100-salePercent)/100;
		return realPrice;
	}
	public void setRealPrice(int realPrice) {
		this.realPrice=realPrice;
	}
	public int getSalePercent() {
		if (age<20) {
			salePercent=25;
		} else if (20<=age && age<30) {
			salePercent=20;
		} else {
			salePercent=15;	
		}
	
		if (buyMethod.equals("인터넷")) {
			salePercent +=5;
		} else if (buyMethod.equals("쿠폰")) {
			salePercent +=10;
		} 
			return salePercent;
	}
	public void setSalePercent(int salePercent) {
		
		this.salePercent=salePercent;
		
	}
	public String getBuyMethod() {
		return buyMethod;
	}
	public void setBuyMethod(String buyMethod) {
		this.buyMethod = buyMethod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
}
