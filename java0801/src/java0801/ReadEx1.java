package java0801;


import java.io.FileOutputStream;
import java.io.OutputStream;

public class ReadEx1 {
	public static void main(String [] args) throws Exception {
		OutputStream os = new FileOutputStream("C://Temp/test1.db");
		
		byte[] array = {10, 20, 30, 40};
//		byte a = 10;
//		byte b = 20;
//		byte c = 30;
//		
//		os.write(a);
//		os.write(b);
//		os.write(c);
		
		os.write(array);
		os.flush();
		os.close();
	}
	
}
