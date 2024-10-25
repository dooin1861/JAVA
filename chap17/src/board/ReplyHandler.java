package board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;

public class ReplyHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		
		return "/WEB-INF/view/reply.jsp";
	}

}