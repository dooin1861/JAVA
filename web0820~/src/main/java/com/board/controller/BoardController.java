package com.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.db.*;
import com.board.service.BoardService;

@WebServlet("/")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("====>" + new BoardDao().countBoard2());

		String view = null;

		// URL에서 프로젝트 이름 뒷 부분의 문자열 얻어내기
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());

		if (com.equals("/")) { // 사용자가 루트 경로를 요청하면 index.jsp로 이동
			view = "index.jsp"; 
		} else if (com.equals("/index")) {
			view = "index.jsp";
		} else if (com.equals("/index2")) {
			view = "index2.jsp";
		} else if (com.equals("/logout")) {
			view = "logout.jsp";
		} else if (com.equals("/login_main2")) {
			view = "login_main2.jsp";
		} else if (com.equals("/member_join_form")) {
			view = "member_join_form.jsp";
		} else if (com.equals("/memberList")) {
			view = "memberList.jsp";
			
		} else if (com.equals("/list")) { // list를 불러오고 데이터베이스의 데이터를 불러와서 list.jsp에 집어넣음
			String tmp = request.getParameter("page");
			int pageNo = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp) : 1;

			request.setAttribute("msgList", new BoardService().getMsgList(pageNo));
			request.setAttribute("pgnList", new BoardService().getPagination(pageNo));
			System.out.println(new BoardService().getPagination(pageNo));
			view = "list.jsp";

		} else if (com.equals("/view")) {
			int num = Integer.parseInt(request.getParameter("num"));

			request.setAttribute("msg", new BoardService().getMsg(num));
			view = "view.jsp";

		} else if (com.equals("/write")) {
			String tmp = request.getParameter("num");
			int num = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp) : 0;

			BoardDto dto = new BoardDto();
			String action = "insert";

			if (num > 0) {
				dto = new BoardService().getMsgForWrite(num);
				action = "update?num=" + num;
			}

			request.setAttribute("msg", dto);
			request.setAttribute("action", action);
			view = "write.jsp";

		} else if (com.equals("/insert")) {
			request.setCharacterEncoding("utf-8");
			String writer = request.getParameter("writer");
			String title = request.getParameter("title");
			String content = request.getParameter("content");

			try {
				new BoardService().writeMsg(writer, title, content);
				view = "redirect:list";

			} catch (Exception e) {
				request.setAttribute("errorMessage", e.getMessage());
				view = "errorBack.jsp";
			}

		} else if (com.equals("/update")) {
			request.setCharacterEncoding("utf-8");
			int num = Integer.parseInt(request.getParameter("num"));
			String writer = request.getParameter("writer");
			String title = request.getParameter("title");
			String content = request.getParameter("content");

			try {
				new BoardService().updateMsg(writer, title, content, num);
				view = "redirect:list";

			} catch (Exception e) {
				request.setAttribute("errorMessage", e.getMessage());
				view = "errorBack.jsp";
			}

		} else if (com.equals("/delete")) {
			int num = Integer.parseInt(request.getParameter("num"));

			new BoardService().deleteMsg(num);
			view = "redirect:list";
		}

		// view에 담긴 문자열에 따라 포워딩 또는 리다이렉팅
		if (view.startsWith("redirect:")) {
			response.sendRedirect(view.substring(9));
		} else {
			request.getRequestDispatcher(view).forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}