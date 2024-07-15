package Project2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EX04 {

	public static void main(String[] args) {
		Member[] list = new Member[10];
		int memCnt = 0;
		try (FileInputStream fis = new FileInputStream("c:\\temp\\members.dat");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {
			Member[] list2 = (Member[]) ois.readObject();			
			System.arraycopy(list2,  0, list2, 0, list2.length);
			System.out.println("파일에서 객체를 가져왔습니다.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (Member member : list) {
			if (member != null) {
				System.out.println(member);
				++memCnt;
			}
		}
	}
}
