<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--Verificando se tem uma mensagem de erro e caso tenha vai exibir --%>
	
	<% String erroMensagem = (String) request.getAttribute("erroMensagem"); %>
	<% if (erroMensagem != null) { %>
	    <div class="erro-mensagem">
	        <%= erroMensagem %>
	    </div>
	<% } %>
	<!--  Aqui faco um formulario, metodo post para enviar username e senha de forma segura -->
	<br/>
	<form action="VerificaLogin" method="post">
	<!--  Usuario e senha comum e ira chamar um servlet que ira analisar
	se usuario e senha bate com o usuario e senha guardados como "banco de dados" -->
	<label>Usuario:</label>
	<input type="text" id="username" name="username">
	<br/>
	<label>Senha:</label>
	<input type="password" id="password" name="password">
	<br/>
	<input type="submit" value="Entrar">
	</form>
</body>
</html>