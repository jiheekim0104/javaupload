package javaBasic2.ch05;

public class RefEx02 {

	public static void main(String[] args) { //static�� �ִ� �ֵ��� Ư���� �ֵ�� �ν���, �ø��ڸ��� �ٷ� ���ؿ� �ö󰥼��־�!
		Car c1 = new Car();
		c1.carKind = "�ҳ�Ÿ";
		c1.carPrice = 3500;
		System.out.println(c1.carKind+" "+c1.carPrice);
		
		Car c2 = new Car();
		c2.carKind = "�׷���";
		c2.carPrice = 5000;
		System.out.println(c2.carKind+" "+c2.carPrice);
		
		City a1 = new City();
		a1.cityName = "�ϳ���";
		a1.cityLocation = "��⵵";
		a1.cityTex = 0.125;
		a1.cityGood = true;
		System.out.println(a1.cityName+" "+a1.cityLocation+" "+a1.cityTex+" "+a1.cityGood);
		
		City a2 = new City();
		a2.cityName = "�λ��";
		a2.cityLocation = "���ϱ�";
		a2.cityTex = 0.134;
		a2.cityGood = true;
		System.out.println(a2.cityName+" "+a2.cityLocation+" "+a2.cityTex+" "+a2.cityGood);
		
	}

}

class Car {
	String carKind;
	int carPrice;
	
}

class City {
	String cityName;
	String cityLocation;
	double cityTex;
	boolean cityGood;
}