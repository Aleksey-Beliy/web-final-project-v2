package edu.web.news.logic.impl;

import java.util.ArrayList;
import java.util.List;

import edu.web.news.bean.AuthInfo;
import edu.web.news.bean.News;
import edu.web.news.bean.User;
import edu.web.news.dao.DaoException;
import edu.web.news.dao.DaoProvider;
import edu.web.news.dao.NewsDao;
import edu.web.news.logic.LogicException;
import edu.web.news.logic.NewsLogic;

public class NewsLogicImpl implements NewsLogic {
	private NewsDao dao = DaoProvider.getInstance().getNewsDao();

	public void addNews(News news) throws LogicException {
		try {
			dao.newsSave(news);
			System.out.println(news.getId());
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public List<News> returnNews() throws LogicException {
		List<News> lastNews;
		try {
			lastNews = dao.returnNews();
		} catch (DaoException e) {
			throw new LogicException(e);
		}
		return lastNews;
	}

	@Override
	public void deleteNews(int id) throws LogicException {
		try {
			dao.newsDelete(id);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void updateNews() throws LogicException {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayAllNews() throws LogicException {

	}
}
