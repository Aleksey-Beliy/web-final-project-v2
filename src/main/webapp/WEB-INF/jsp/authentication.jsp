
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Авторизация</title>

<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
<style>
.container {
	max-width: 400px;
	padding: 70px;
	margin: auto;
	background-color: white;
	border-radius: 7px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
}

.text-java {
	color: #00796b;
}
</style>
</head>
<body>
		<header>
		<nav>
			<ul>
				<li><a href="#">Главная</a></li>
				<li><a href="#">Новости</a></li>
				<li><a href="#">Контакты</a></li>
				<li><a href="#">О нас</a></li>
				<li><a href="Controller?command=go_to_authentication_page">Войти</a></li>
				<li><a href="Controller?command=go_to_admin_page">Панель
						администратора</a></li>
			</ul>
		</nav>
		</header>



	<form action="Controller" method="post">
		<input type="hidden" name="command" value="do_auth">
		<div class="container text-center">
			<h2 class="text-java">Вход на сайт</h2>

			<div class="error-message" id="error-message">
				<c:if test="${not (param.authError eq null)}">
					<c:out value="${param.authError }" />
				</c:if>
			</div>

			<div class="form-group">
				<label for="login"></label> <input class="form-control" type="email"
					name="login" placeholder="Логин" required>
			</div>
			<div class="form-group">
				<label for="password"></label> <input class="form-control"
					type="password" name="password" placeholder="Пароль" required>
			</div>
			<p>
				<button class="button" type="submit">Войти</button>
			</p>
			<input type="hidden" name="command" value="go_to_registration_page">
			<div class="checkbox mb-3">
				<label><input type="checkbox" value="remember-me"
					name="remember-me"> Запомнить меня</label>
			</div>
			<a href="Controller?command=go_to_registration_page">Регистрация
				нового аккаунта</a>

		</div>
	</form>
	<footer>
		<div class="footer-content">
			<div class="about-us">
				<h3>О нас</h3>
				<p>Наш новостной сайт предоставляет самые свежие и актуальные
					новости из разных сфер жизни.</p>
			</div>
			<div class="contact">
				<h3>Контакты</h3>
				<p>Email: info@newswebsite.com</p>
				<p>Телефон: +7 (123) 456-7890</p>
			</div>
			<div class="footer-links">
				<h3>Навигация</h3>
				<ul>
					<li><a href="#">Главная</a></li>
					<li><a href="#">Политика</a></li>
					<li><a href="#">Экономика</a></li>
					<li><a href="#">Спорт</a></li>
					<!-- Добавьте больше ссылок на другие категории, если необходимо -->
				</ul>
			</div>
		</div>
		<div class="footer-bottom">&copy; 2024 Новостной сайт. Все права
			защищены.</div>
	</footer>
</body>
</html>