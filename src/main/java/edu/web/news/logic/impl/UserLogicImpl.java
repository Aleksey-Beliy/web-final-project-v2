package edu.web.news.logic.impl;

import edu.web.news.bean.AuthInfo;
import edu.web.news.bean.RegistrationInfo;
import edu.web.news.bean.User;
import edu.web.news.dao.DaoException;
import edu.web.news.dao.DaoProvider;
import edu.web.news.dao.NewsDao;
import edu.web.news.logic.LogicException;
import edu.web.news.logic.UserLogic;

public class UserLogicImpl implements UserLogic {

	private NewsDao dao = DaoProvider.getInstance().getNewsDao();

	@Override
	public User checkAuth(AuthInfo authInfo) throws LogicException {
		try {
			User user = dao.checkAuth(authInfo);
			return user;
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public User registrationUser(RegistrationInfo regInfo) throws LogicException {
		try {
			User user = dao.registrationUser(regInfo);
			return user;
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void validUser() throws LogicException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User rememberMe(String token) {
		// TODO Auto-generated method stub
		return null;
	}

}
