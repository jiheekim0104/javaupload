package Ex3;

public class Tank extends Unit {
	int x;
	int y;
	
	@Override
	public void move(int x,int y) {
		this.x = x - 50;
		this.y = y + 50;
		System.out.println("��ũ�� ��ġ: "+this.x+","+this.y);
	}

	 void changeMode() {
		 System.out.println("��ũ ���ݸ�带 ��ȯ�Ѵ�.");
	 }
}
