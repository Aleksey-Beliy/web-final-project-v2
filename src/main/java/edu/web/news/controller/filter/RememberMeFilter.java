package edu.web.news.controller.filter;

import java.io.IOException;

import edu.web.news.bean.User;
import edu.web.news.logic.LogicException;
import edu.web.news.logic.LogicProvider;
import edu.web.news.logic.UserLogic;
import edu.web.news.util.TokenGenerator;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebFilter(urlPatterns = {"Controller"})
public class RememberMeFilter extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;

	private final UserLogic userLogic = LogicProvider.getInstance().getUserLogic();

	public RememberMeFilter() {
		super();
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		try {
			HttpSession session = ((HttpServletRequest) request).getSession(false);

			if (session == null || session.getAttribute("user") == null) {
				Cookie[] cookies = ((HttpServletRequest) request).getCookies();

				if (cookies != null) {
					for (Cookie c : cookies) {
						if (c.getName().equals("remember-me")) {
							User user = userLogic.rememberMe(TokenGenerator.generateToken(25));

							session.setAttribute("user", user);
						}
					}
				}
			}
			chain.doFilter(request, response);

		} catch (LogicException e) {
			((HttpServletResponse) response)
					.sendRedirect("Controller?command=go_to_start_page&authError=Wrong login or password!");
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}