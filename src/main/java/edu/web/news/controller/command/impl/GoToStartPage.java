package edu.web.news.controller.command.impl;

import java.io.IOException;
import java.util.List;

import edu.web.news.bean.News;
import edu.web.news.controller.command.Command;
import edu.web.news.logic.LogicException;
import edu.web.news.logic.impl.NewsLogicImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GoToStartPage implements Command {
	private final NewsLogicImpl logic = new NewsLogicImpl();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<News> mainNews = logic.returnNews();
			request.setAttribute("mainNews", mainNews);
		} catch (LogicException e) {

		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/start_page.jsp");
		dispatcher.forward(request, response);

	}
}
