package edu.web.news.dao.impl;

import java.util.ArrayList;
import java.util.List;

import edu.web.news.bean.AuthInfo;
import edu.web.news.bean.News;
import edu.web.news.bean.RegistrationInfo;
import edu.web.news.bean.User;
import edu.web.news.dao.DaoException;
import edu.web.news.dao.NewsDao;

public class NewsDaoImpl implements NewsDao {
	List<News> newNews = new ArrayList<>();

	@Override
	public List<News> newsSave(News news) throws DaoException {
		newNews.add(news);
		return newNews;

	}

	@Override
	public User checkAuth(AuthInfo authInfo) throws DaoException {
		if ("user@mail.ru".equals(authInfo.getLogin())) {
			return new User("Aleksey", "admin");
		}
		return null;
	}

	@Override
	public User registrationUser(RegistrationInfo regInfo) throws DaoException {

		return new User("Aleksey", "admin");
	}

	@Override
	public List<News> returnNews() throws DaoException {

		return newNews;
	}

	@Override
	public List<News> newsDelete(int id) throws DaoException {
		newNews.remove(id);
		return newNews;
	}

}
