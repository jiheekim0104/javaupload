package javaMid3.b1331p1;

import java.util.Scanner;

public class Company {
	static final int computerPrice = 2000000;
	static final int printerPrice = 500000;
	String area;
	String productName;
	int productCnt;
	int productPrice;
	int total;
	Scanner sc = new Scanner(System.in);
	
	public Company(String area) {
		this.area=area;
	}
	public void addlist() {
		System.out.print("��ǰ�Է�>");
		productName = sc.nextLine();
		
		System.out.print("�Ǹŷ�>");
		productCnt = Integer.parseInt(sc.nextLine());
		
		if(productName.equals("��ǻ��")) {
			productPrice = computerPrice;
		} 
		if(productName.equals("������")) {
			productPrice = printerPrice; 
		}
		total = productPrice * productCnt;
		 
	}
	
	public void printAll() {
		System.out.println(area+"���� "+productName+" "+productPrice+" "+productCnt+" "+total);
	}
}
