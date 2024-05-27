package edu.web.news.dao;

import java.util.List;

import edu.web.news.bean.AuthInfo;
import edu.web.news.bean.News;
import edu.web.news.bean.RegistrationInfo;
import edu.web.news.bean.User;
import edu.web.news.logic.LogicException;

public interface NewsDao {

	public List<News> newsSave(News news) throws DaoException;
	
	public List<News> newsDelete(int id) throws DaoException;
	
	public List<News> returnNews() throws DaoException;
	
	public User checkAuth(AuthInfo authInfo) throws DaoException;
	
	public User registrationUser(RegistrationInfo regInfo) throws DaoException;
}
