package javaBasic2.ch05.day02;

public class ClassEx153page {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String name1 = "ȫ�浿";
		String name2 = new String("ȫ�浿");
		
		name.replace("ȫ�浿", "������");
		
		
		String personId = "940104-2000000";
		String year = personId.substring(0,2);
		System.out.print(19+year+"�� ");
		
		String month = personId.substring(2,4);
		System.out.print(month+"�� ");
		
		String day = personId.substring(4,6);
		System.out.print(day+"�� ");
		
		String gender = personId.substring(7,8);
		if (gender.equals('1')||gender.equals('3')) {
			System.out.print("����");
		} else {
			System.out.print("����");
		}
		
		/* ���ڷ� ��ȯ�ؼ� Ǯ�� 
		String gender1 = personId.substring(7,8);
		int numgender1 = Integer.parseInt(gender1);
		if (numgender1==1||numgender1==3) {
			System.out.print("����");
		} else {
			System.out.print("����");
		}
		*/
		
		
				

	}

}
