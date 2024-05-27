package edu.web.news.controller.command.impl;

import java.io.IOException;

import edu.web.news.controller.command.Command;
import edu.web.news.logic.LogicException;
import edu.web.news.logic.LogicProvider;
import edu.web.news.logic.NewsLogic;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteNews implements Command {

	private final NewsLogic logic = LogicProvider.getInstance().getNewsLogic();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		try {
			logic.deleteNews(id);
		} catch (LogicException e) {

		}
		response.sendRedirect("Controller?command=go_to_start_page");
	}

}
