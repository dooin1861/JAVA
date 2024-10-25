package mvc.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class GoodByeHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		req.setAttribute("goodBye", "안녕히가세요!");
		return "/WEB-INF/view/goodBye.jsp";
	}

}
