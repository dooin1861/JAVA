package drive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

import board.BoardDAO;
import board.BoardDTO;

public class ReadEx01 {
	public static void main(String [] args) throws Exception {
		
		String line = "";
		
		BufferedReader br = new BufferedReader(new FileReader("C://Temp/board1.csv"));
		while ((line = br.readLine()) != null) {
			String[] data = line.split(", ");
			
			BoardDAO dao = new BoardDAO();
			BoardDTO dto = new BoardDTO(0, data[0], data[1], data[2], null, 0);
			dao.insertBoard(dto);
			System.out.println(dto);
			System.out.println("입력 성공");
//			System.out.println(data[0]);
//			System.out.println(data[1]);
//			System.out.println(data[2]);
			
			// 분리된 데이터 출력
//			for (String element : data) {
//				System.out.println(element + " ");
//			}
//			System.out.println();
		}
	br.close();
	}
}