package edu.web.news.controller.command.impl;

import java.io.IOException;

import edu.web.news.bean.RegistrationInfo;
import edu.web.news.controller.command.Command;
import edu.web.news.logic.LogicException;
import edu.web.news.logic.LogicProvider;
import edu.web.news.logic.UserLogic;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DoRegistration implements Command {

	private UserLogic logic = LogicProvider.getInstance().getUserLogic();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email = request.getParameter("email");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		try {
			logic.registrationUser(new RegistrationInfo(email, name, password));
		} catch (LogicException e) {
			
		}RequestDispatcher dispatcher = request.getRequestDispatcher("Controller?command=go_to_authentication_page");
			dispatcher.forward(request, response);

	}
}
