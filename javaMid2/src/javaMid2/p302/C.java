package javaMid2.p302;

import javaMid2.p301.A;

public class C { //A가 있는곳과 다른 패키지
	void m() {
		A a = new A();
		//a.value = 500;  value가 protected로 선언되었기때문에!
	}
}
