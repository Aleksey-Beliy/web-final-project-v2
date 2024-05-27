<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Регистрация</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
<style>
.text-java {
	color: #00796b; /* Teal color */
}

.container {
	max-width: 400px;
	padding: 70px;
	margin: auto;
	background-color: white;
	border-radius: 7px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
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
	<div class="container text-center">


		<h1 class="text-java">Регистрация на сайте</h1>
		<form action="Controller" method="post">
			<input type="hidden" name="command" value="do_registration">
			<%-- <div class="error-message" id="message">
				<c:if test="${not (param.message eq null)}">
					<c:out value="${param.message }" />
				</c:if>
			</div>  --%>
			<div class="form-group">
				<label for="username"></label> <input class="form-control"
					type="email" name="email" placeholder="Почта" required>
			</div>
			<div class="form-group">
				<label for="username"></label> <input class="form-control"
					type="text" name="name" placeholder="Имя" required>
			</div>
			<div class="form-group">
				<label for="username"></label> <input class="form-control"
					type="password" name="password" placeholder="Пароль" required>
			</div>
			<!-- <div class="form-group">
				<label for="password"></label> <input class="form-control"
					type="password" name="password" placeholder="Подтвердите пароль"
					required>
			</div> -->
			<p>
				<button class="btn btn-lg btn-success btn-block" type="submit">Зарегистрироваться</button>
			</p>
		</form>
	</div>
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