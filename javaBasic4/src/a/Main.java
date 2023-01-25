package a;


import b.B; // 다른 패키지에서 데려올때 
import b.ba.BA;

public class Main {

	public static void main(String[] args) {
		System.out.println(B.getSb());
		
		B b = new B();
		System.out.println(b.getIb());
		
		a.aa.AA aa = new a.aa.AA(); //import 안쓰고 생성자만들기
		System.out.println(aa.getName()+" "+aa.getPhone());
		
		BA ba = new BA();
		System.out.println(BA.getSd()+" "+ba.getId()); //sd는 static이어서 클래스.변수명으로 불러줬음 ㅇㅅㅇ
	}

}
