package javaBasic2.ch05.day03;

public class Ex02 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setssn("940104-2000000");
		p.setaddress("경기도 하남시");
		p.setage(29);
		p.setgender(false);
		
		System.out.println(p.ssn+" "+p.address+" "+p.age+" "+p.gender);

		System.out.println(p.getssn()+" "+p.getaddress()+" "+p.getage()+" "+p.getgender());
	}

}//class end

class Person {
	String ssn;
	String address;
	int age;
	boolean gender;
	
	void setssn(String ssn) {
		this.ssn=ssn;
	}
	void setaddress(String address) {
		this.address=address;
	}
	void setage(int age) {
		this.age=age;
	}
	void setgender(boolean gender) {
		this.gender=gender;
	}
	
	String getssn() {
		return ssn;
	}
	
	String getaddress() {
		return address;
	}
	
	int getage() {
		return age;
	}
	
	boolean getgender() {
		return gender;
	}
}



