<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
<title>TopNews</title>
</head>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f4f4f4;
}

.container {
	width: 80%;
	margin: auto;
	overflow: hidden;
}

.content {
	padding: 20px;
	background: #fff;
	border-radius: 5px;
	margin-top: 20px;
}

.content h2 {
	margin-top: 0;
}

.form-group {
	margin-bottom: 15px;
}

.form-group label {
	display: block;
	margin-bottom: 5px;
}

.form-group input, .form-group textarea {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
}

.form-group button {
	padding: 10px 15px;
	background: #333;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

.form-group button:hover {
	background: #555;
}



table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 20px;
}

table, th, td {
	border: 1px solid #ddd;
}


th, td {
	padding: 15px;
	text-align: left;
}

th {
	background-color: #333;
	color: white;
}

.actions {
	display: flex;
	gap: 10px;
}

.actions button {
	padding: 5px 10px;
	border: none;
	border-radius: 3px;
	cursor: pointer;
}

.actions .edit-btn {
	background-color: #4CAF50;
	color: white;
}

.actions .delete-btn {
	background-color: #f44336;
	color: white;
}
</style>
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
	<div class="container">
		<div class="content">
			<h2>Add New Article</h2>
			<form action="Controller" method="get" enctype="multipart/form-data">
				<input type="hidden" name="command" value="add_news">
				<div class="form-group">
					<label for="title">Title</label> <input type="text" name="title"
						id="title" required>
				</div>
				<div class="form-group">
					<label for="category">Category</label> <input type="text"
						name="category" id="category" required>
				</div>
				<div class="form-group">
					<label for="content">Content</label>
					<textarea name="content" id="content" rows="5" required></textarea>
				</div>
				<div class="form-group">
					<label for="imgPath">Image</label> <input type="file"
						name="imgPath" id="imgPath" required>
				</div>
				<div class="form-group">
					<button type="submit">Add Article</button>
				</div>
			</form>
			
		</div>
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