package javaMid3.b1328;

public class PolyMain {

	public static void main(String[] args) {
		CaptionTv ca = new CaptionTv();
		ca.channel = 11;
		ca.power = true;
		ca.text = "�ĳ��";
		ca.caption();
		ca.channelDown();
		ca.channelUp();
		
		
		TV tv = new TV();
		tv.channel = 7;
		tv.power = false;
		tv.channelDown();
		tv.channelUp(); // �θ�� �ڱ�͸� �����ִ� !
		
		TV ctv = new CaptionTv();
		ctv.channel = 18;
		ctv.power = true;
		ctv.channelDown();
		ctv.channelUp();
		//ctv.text = "�ĳ��"; ����
		//ctv.caption(); ������ ���� �������⼭ �ذ��Ϸ���...
		
		// 1. �θ�Ŭ������ ���� �޼ҵ�÷��� �ڽĸ޼ҵ忡�� �������̵�
		// 2. �׳� �ٿ��ɽ����ؼ� �ҷ�����! 
		
		ctv.caption(); //�̰� 1�������� 
		
		CaptionTv captionTv = (CaptionTv)tv;
		captionTv.text = "��~~���"; //�̰� 2�� ������ 
		
	}

}
