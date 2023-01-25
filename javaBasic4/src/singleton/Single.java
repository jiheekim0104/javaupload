package singleton;

public class Single {
	private static Single s = new Single(); //(2) 
	
	private Single() { //(1) �ٸ� Ŭ�������� �ƿ� ����! ���⼭�� ��������.
		
	}
	
	private static String now() {
		return "2023-01-25";
	}
	
	public static Single getInstance() { // 1���� �޼ҵ常 public���� �������. static���� ���������� ��������(?)
		return s;
	}
}
