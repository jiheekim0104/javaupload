package q8;

import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("file.txt")){
			fw.Write("java");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
