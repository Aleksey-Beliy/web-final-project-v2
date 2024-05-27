package edu.web.news.logic;

import java.util.List;

import edu.web.news.bean.News;

public interface NewsLogic {

	public void addNews(News news) throws LogicException;
	
	public void deleteNews(int id) throws LogicException;
	
	public void updateNews() throws LogicException;
	
	public void displayAllNews() throws LogicException;
	
	public List<News> returnNews() throws LogicException;
}
