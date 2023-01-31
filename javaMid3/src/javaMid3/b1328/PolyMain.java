package javaMid3.b1328;

public class PolyMain {

	public static void main(String[] args) {
		CaptionTv ca = new CaptionTv();
		ca.channel = 11;
		ca.power = true;
		ca.text = "파노라마";
		ca.caption();
		ca.channelDown();
		ca.channelUp();
		
		
		TV tv = new TV();
		tv.channel = 7;
		tv.power = false;
		tv.channelDown();
		tv.channelUp(); // 부모는 자기것만 쓸수있다 !
		
		TV ctv = new CaptionTv();
		ctv.channel = 18;
		ctv.power = true;
		ctv.channelDown();
		ctv.channelUp();
		//ctv.text = "파노라마"; 못씀
		//ctv.caption(); 원래는 못씀 이제여기서 해결하려면...
		
		// 1. 부모클래스에 같은 메소드올려서 자식메소드에서 오버라이딩
		// 2. 그냥 다운케스팅해서 불러내기! 
		
		ctv.caption(); //이건 1번쓴거임 
		
		CaptionTv captionTv = (CaptionTv)tv;
		captionTv.text = "파~~노라마"; //이건 2번 쓴거임 
		
	}

}
