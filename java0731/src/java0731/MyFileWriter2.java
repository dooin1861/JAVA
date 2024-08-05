package java0731;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFileWriter2 {

	public static void main(String[] args) throws IOException {
		File dir = new File("c://Temp/file");
		if (dir.exists() == false) {
			dir.mkdir(); // 폴더 생성
		}
		
		Writer writer = new FileWriter("c://Temp/file/data.txt");
		String str = "마이 뉴 기어";
		writer.write(str);
		writer.flush();
		writer.close();
		System.out.println("성공");
	}
}
