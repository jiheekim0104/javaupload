package javaBasic2.ch05.day03;

public class Ex01 {

	public static void main(String[] args) {
		/*
		null
		Student st = null; // ���ظ޸𸮿� ���� ������ �����, ���⿡ ���� ���� ���� ���� ����(=st�� �������� ��������ʴ�.) ���޸𸮿��� �ö���� �ʾұ⶧���� ���� �ּҴ� ���� �ʰڴٴ� �Ҹ�!
		
		NullPointerException
		String str = null;
		System.out.println(str.length());
		*/
		
		
		/* �ٸ� Ŭ������ ���� �ִ� ���
		 1 ���� �ʵ忡 �ִ´�. b1.kind --> �������� �ʾ�!
		 2 �޼ҵ带 ���ؼ� �ִ´�.  --> 2�� �Ǵ� 2-1���� ���� ���̽�!
		  setKind ( String kind ) { }
		 2-1 �޼ҵ带 ���ؼ� ���� ����Ѵ�. 
		 3 �����ڸ� ����ؼ� �� �ֱ� (17�� ���� ����)
		 */
		
		
		//2��
		Student s1 = new Student();
		s1.setname("������");
		s1.setphone("010-4910-5488");
		s1.setkor(100);
		System.out.println(s1.name+" "+s1.phone+" "+s1.kor);
		
		
		
		//2�� -1
		System.out.println(s1.getname()+" "+s1.getphone()+" "+s1.getkor());
		
	}

} //class end 

class Student {
	String name;
	String phone;
	int kor;
	
	void setname (String name) { //2��
		this.name = name;
	}
	
	void setphone (String phone) { //2��
		this.phone = phone;
	}
	
	void setkor (int kor) { //2��
		this.kor = kor;
	}
	
	String getname() { // 2��-1
		return name; //���⼭�� this�Ƚᵵ �������!
	}
	
	String getphone() { // 2��-1
		return phone; 
	}
	
	int getkor() { // 2��-1
		return kor; 
	}
	
	
}
