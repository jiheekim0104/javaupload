package javaBasic3.ch06.day01;

public class Car { 
	String carName;
	int carPrice;
	String carMan;
	
	public Car() { //������ : Ŭ�������̶� �Ȱ��� ���� �޼ҵ��� �����ϸ��! returnŸ���� ����!
		System.out.println("�̰��� ������ �Դϴ�. ���� ó���ɱ��?");
		carName="�ҳ�Ÿ";
		carPrice=5000;
		carMan="����";
		
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
