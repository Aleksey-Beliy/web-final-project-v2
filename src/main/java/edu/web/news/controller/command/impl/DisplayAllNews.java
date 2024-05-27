package edu.web.news.controller.command.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.web.news.bean.News;
import edu.web.news.controller.command.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayAllNews implements Command{

	private final List<News> newsList = new ArrayList<>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

}
