package Ex3;

public class Marine extends Unit {
	//int x;
	//int y; (2) ��� �̰� �Ƚᵵ �Ǵ°��̾���..! 
	
	@Override
	public void move(int x, int y) {
		this.x =x + 10; // (1) ���� �ʵ忡 int x,y�� �� Ŭ������ �����ٸ� �θ� ������ �ٷ� ���� ����
		this.y =y - 10;
		System.out.println("������ ��ġ: "+this.x+","+ this.y);
	}
	
	void stimPack() {
		System.out.println("���� �������� ����Ѵ�.");
	}
}
