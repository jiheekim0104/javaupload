package javaBasic2.ch05.day03;

public class Ex03 {

	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.setComputerName("IBM I7-5700");
		com1.setPrice(2500000);
		com1.setManufactuer("삼성");
		System.out.println(com1.getComputerName()+" "+com1.getPrice()+" "+com1.getManufactuer());
		


	}

}


class Computer{
	//필드 클래스멤버**
	String computerName;
	int price;
	String manufactuer;
	
	
	//메서드 동작**
	// setter메서드와 getter메서드를 자동으로 생성해준다고!!!? Source > generate g & s 
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getManufactuer() {
		return manufactuer;
	}
	public void setManufactuer(String manufactuer) {
		this.manufactuer = manufactuer;
	}



	
	
}