package q8;

import java.io.IOException;

public class FileWriter implements AutoCloseable {
	public FileWriter(String filepath) throws IOException{
		System.out.println(filepath + "������ ���ϴ�.");
	}
	
	public void Write(String data) throws IOException {
		System.out.println(data+ "�� ���Ͽ� �����մϴ�.");

	}
	
	@Override
	public void close() throws IOException{
		System.out.println("������ �ݽ��ϴ�.");
	}
}
