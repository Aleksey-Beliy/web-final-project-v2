package edu.web.news.controller.command.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.web.news.bean.News;
import edu.web.news.controller.command.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateNews implements Command {

	private static List<News> news = new ArrayList<>();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String category = request.getParameter("category");
		String content = request.getParameter("content");
		String imgPath = (request.getParameter("imgPath"));
		// String image = encodeFileToBase64(imagePart);

		for (News newsList : news) {
			if (newsList.getId() == id) {
				newsList.setTitle(title);
				newsList.setCategory(category);
				newsList.setContent(content);
				newsList.setImgPath(imgPath);
				break;
			}
		}
		response.sendRedirect("Controller?command=go_to_start_page");
	}
}