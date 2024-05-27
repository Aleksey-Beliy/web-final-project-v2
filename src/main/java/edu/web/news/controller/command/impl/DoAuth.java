package edu.web.news.controller.command.impl;

import java.io.IOException;

import edu.web.news.bean.AuthInfo;
import edu.web.news.bean.User;
import edu.web.news.controller.command.Command;
import edu.web.news.logic.LogicException;
import edu.web.news.logic.LogicProvider;
import edu.web.news.logic.UserLogic;
import edu.web.news.util.TokenGenerator;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DoAuth implements Command {

	private final LogicProvider provider = LogicProvider.getInstance();
	private final UserLogic logic = provider.getUserLogic();
	private final TokenGenerator token = new TokenGenerator();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		System.out.println("Perform user authentication and authorization. Login: " + login);
		User user;
		try {
			user = logic.checkAuth(new AuthInfo(login, password));
			
			if(user != null) {
				HttpSession session = (HttpSession) request.getSession(true);
				session.setAttribute("user", user);

				String rememberMe = request.getParameter("remember-me");
				if (rememberMe != null) {
					Cookie cookie = new Cookie("rememberMe", token.generateToken(25));
					cookie.setHttpOnly(true);
					cookie.setSecure(true);
					response.addCookie(cookie);
				}
				response.sendRedirect("Controller?command=go_to_start_page");
			} else {
				response.sendRedirect(
						"Controller?command=go_to_authentication_page&authError=Wrong login or password!");
			}
		} catch (LogicException e) {
			response.sendRedirect("Controller?command=go_to_authentication_page&authError=Что-то пошло не так-!");
		}
	}
}