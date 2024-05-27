package edu.web.news.logic;

import edu.web.news.bean.AuthInfo;
import edu.web.news.bean.RegistrationInfo;
import edu.web.news.bean.User;

public interface UserLogic {

	public User checkAuth(AuthInfo authInfo) throws LogicException;
	
	public void validUser() throws LogicException;
	
	public User registrationUser(RegistrationInfo regInfo) throws LogicException;

	public User rememberMe(String token) throws LogicException;
	
	
	
}
