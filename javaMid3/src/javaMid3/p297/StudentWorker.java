package javaMid3.p297;

public class StudentWorker extends Student {
	
	public void work() {
		System.out.println("학교에서 일하시는 분들");
	}

	@Override
	public void study() {
		System.out.println("공부하는 학생들을 도와주는것");
		super.study();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		super.walk();
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		super.talk();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}
	
	
}
