package javaBasic3.ch06.day01;

public class Car { 
	String carName;
	int carPrice;
	String carMan;
	
	public Car() { //생성자 : 클래스명이랑 똑같이 생긴 메소드라고 생각하면됨! return타입이 없어!
		System.out.println("이곳은 생성자 입니다. 언제 처리될까요?");
		carName="소나타";
		carPrice=5000;
		carMan="현대";
		
	}
	
	public Car(String carName,int carPrice,String carMan) {
		this.carName= carName;
		this.carPrice= carPrice;
		this.carMan= carMan;
	}
	
	public Car(String carName,int carPrice) {
		this.carName= carName;
		this.carPrice= carPrice;
	}
	
	public Car(String carName) {
		this.carName= carName;
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarMan() {
		return carMan;
	}
	public void setCarMan(String carMan) {
		this.carMan = carMan;
	}
			
	
}
