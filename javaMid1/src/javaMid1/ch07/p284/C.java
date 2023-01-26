package javaMid1.ch07.p284;

public class C extends B {
	String school;
	
	public void printMMM() {
		System.out.println(getSchool());
		System.out.println(getAge());
		System.out.println(getName());
		System.out.println(getPhone());
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	
	
}
