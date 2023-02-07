package javaMid8.Ex422.q7;

public class Chatting {
	class chat{
		void start() {}
		void sendMessage(String message) {}
	}
	
	String nickName=null;
	
	void startChat(String chatId) {
		
		nickName = chatId;
		
		chat chat = new chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "æ»≥Á«œººø‰";
					String message = "["+ nickName +"]"+inputData;
					sendMessage(message);
				}
			}
		};
		
		chat.start();
	}
}
