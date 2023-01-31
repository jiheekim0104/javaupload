package javaMid3.b1328Ex2;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	Product[] item = new Product[10];
	 
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			return;
		}
		money -= p.price; 
		bonusPoint += p.bonusPoint; 
		item[i++] = p; 
		System.out.println(p + "��/�� �����ϼ̽��ϴ�."); // ��� p.toString �� ������
	
	}
	
	void summary() {
		int sum = 0;
		int bonusSum=0;
		System.out.print( "�����Ͻ� ��ǰ�� ");
		for (int i=0;i<item.length;i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			bonusSum += item[i].bonusPoint;
			System.out.print(item[i]);
			
			if(item[++i]!=null) System.out.print(",");
		
		}
		System.out.print( "�Դϴ�. ");
		System.out.println();
		System.out.println( "�����Ͻ� ��ǰ �ѱݾ���" + sum + "�����Դϴ�.");
		System.out.println( "�� ����Ʈ��" + bonusSum + "�Դϴ�.");
	}
	
	
	
	
	
}
