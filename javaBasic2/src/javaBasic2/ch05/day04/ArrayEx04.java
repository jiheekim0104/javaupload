package javaBasic2.ch05.day04;

public class ArrayEx04 {

	public static void main(String[] args) {
		BuyMovie[] movieArr = {new BuyMovie(),new BuyMovie(),new BuyMovie()};
		movieArr[0].setName("1917");
		movieArr[0].setPrice(11000);
		movieArr[0].setAge(10);
		movieArr[0].setBuyMethod("���ͳ�");
		
		movieArr[1].setName("�ֵ�");
		movieArr[1].setPrice(15000);
		movieArr[1].setAge(25);
		movieArr[1].setBuyMethod("����");
		
		movieArr[2].setName("�κ������");
		movieArr[2].setPrice(12500);
		movieArr[2].setAge(40);
		movieArr[2].setBuyMethod("����");
		
		
		System.out.println("��ȭ��   �ݾ�   ����   �Ǳ��űݾ�");
		for(int i=0; i<movieArr.length;i++) {
			movieArr[i].getBuyMethod(); // ���� ����� ���� ���� �ۼ�Ʈ�� �������ϱ�, ���� �ۼ�Ʈ ȣ������ ���� ����� ���� ȣ����!
			movieArr[i].getSalePercent(); // ���� �ۼ�Ʈ�� ������ ������ �ǰ����� ���Ǵϱ�, ���� ȣ�����ִ� ĭ�� �ʿ���! but ����� �ʿ䰡 ����!
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
	
		if (buyMethod.equals("���ͳ�")) {
			salePercent +=5;
		} else if (buyMethod.equals("����")) {
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
