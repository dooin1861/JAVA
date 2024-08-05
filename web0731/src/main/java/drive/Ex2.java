package drive;

import board.BoardDAO;
import board.BoardDTO;

public class Ex2 {

	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = new BoardDTO(0, "박하나", "이터널리턴", "ABC망겜", "", 0);
		dao.insertBoard(dto);
		System.out.println("입력 성공!");

	}

}
