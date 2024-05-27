package edu.web.news.controller.command.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.Param;

import edu.web.news.bean.News;
import edu.web.news.controller.command.Command;
import edu.web.news.logic.LogicException;
import edu.web.news.logic.LogicProvider;
import edu.web.news.logic.NewsLogic;
import edu.web.news.util.GenerateId;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddNews implements Command {

	private final NewsLogic logic = LogicProvider.getInstance().getNewsLogic();
	private static List<News> newsList = new ArrayList<>();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String title = (request.getParameter("title"));
		String category = (request.getParameter("category"));
		String content = (request.getParameter("content"));
		String imgPath = (request.getParameter("imgPath"));
		try {
			logic.addNews(new News(GenerateId.nextId(), title, category, content, "images/" + imgPath));
		} catch (LogicException e) {
			response.sendRedirect("Controller?command=go_to_index_page&authError=Что-то пошло не так!");
		}
		News news = new News(GenerateId.nextId(), title, category, content, "images" + imgPath);
		newsList.add(news);
		response.sendRedirect("Controller?command=go_to_start_page");

	}

}
