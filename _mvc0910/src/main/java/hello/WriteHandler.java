package hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardDto;
import command.CommandHandler;

public class WriteHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		String tmp = req.getParameter("num");
        int num = (tmp != null && tmp.length() > 0)
                ? Integer.parseInt(tmp) : 0;

        BoardDto dto = new BoardDto();
        String action = "insert";
        
		return "/WEB-INF/view/write.jsp";
	}

}
