package a;


import b.B; // �ٸ� ��Ű������ �����ö� 
import b.ba.BA;

public class Main {

	public static void main(String[] args) {
		System.out.println(B.getSb());
		
		B b = new B();
		System.out.println(b.getIb());
		
		a.aa.AA aa = new a.aa.AA(); //import �Ⱦ��� �����ڸ����
		System.out.println(aa.getName()+" "+aa.getPhone());
		
		BA ba = new BA();
		System.out.println(BA.getSd()+" "+ba.getId()); //sd�� static�̾ Ŭ����.���������� �ҷ����� ������
	}

}
