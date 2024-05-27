package edu.web.news.dao;

import edu.web.news.dao.impl.NewsDaoImpl;

public class DaoProvider {

	private static final DaoProvider INSTANCE = new DaoProvider();

	private DaoProvider() {
	}

	private NewsDao vehicleDao = new NewsDaoImpl();

	public NewsDao getNewsDao() {
		return vehicleDao;
	}

	public static DaoProvider getInstance() {
		return INSTANCE;
	}
}
