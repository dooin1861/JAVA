package java0801;

import java.io.FileInputStream;

import java.io.InputStream;

public class WriteEx1 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C://Temp/test1.db");
		int cnt = 0;
		byte[] buf = new byte[100];
		
		int data = is.read(buf, 2, 3);
		for (int i = 0; i < buf.length; i++) {
			System.out.println(buf[i]);
		}
		
//		while(true) {
//			++cnt;
//			int data = is.read();
//			System.out.println(data);
//			if(data == -1) break;
//			for (int i = 0; i < data; i++) {
//				System.out.println(buf[i]);
//			}
//		}
//		System.out.println(cnt);
		is.close();
	}
}
