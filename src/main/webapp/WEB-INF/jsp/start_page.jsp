<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="<c:url value="css/style.css"/>">
<title>TopNews</title>
<style>
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
	<main>
		<c:forEach var="news" items="${requestScope.mainNews}">
			<section class="news-block">
				<div class="article-content">
					<img src="${news.imgPath}" alt="Images" class="news-image">
					<p>${news.title}</p>
					<p class="category">${news.category}</p>
					<p>${news.content}</p>
					<a href="Controller?command=#" class="read-more">Читать далее</a>
				</div>
			</section>
		</c:forEach>
	</main>
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