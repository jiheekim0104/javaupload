package javaMid3.b1328Ex2;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	Product[] item = new Product[10];
	 
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}
		money -= p.price; 
		bonusPoint += p.bonusPoint; 
		item[i++] = p; 
		System.out.println(p + "을/를 구입하셨습니다."); // 사실 p.toString 임 ㅇㅅㅇ
	
	}
	
	void summary() {
		int sum = 0;
		int bonusSum=0;
		System.out.print( "구입하신 제품은 ");
		for (int i=0;i<item.length;i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			bonusSum += item[i].bonusPoint;
			System.out.print(item[i]);
			
			if(item[++i]!=null) System.out.print(",");
		
		}
		System.out.print( "입니다. ");
		System.out.println();
		System.out.println( "구입하신 물품 총금액은" + sum + "만원입니다.");
		System.out.println( "총 포인트는" + bonusSum + "입니다.");
	}
	
	
	
	
	
}
