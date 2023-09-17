<%@page import="projeto.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="UTF-8">
<title>Página de Login</title>
</head>
<body>
	<form action="Autenticador" method="get">
	    <label>User:</label>
	    <input type="text" id="user" name="user"> 
	    <br/>
	    <label>Password:</label>
	    <input type="password" id="password" name="password">
	    <br/>
	    <input type="submit" value="Login">
	</form>
	
    <%
        Pessoa pessoaLogada = (Pessoa) session.getAttribute("pessoaLogada");
        if (pessoaLogada != null) {
    %>
        <h1>Dados do Usuário</h1> 
        <p>Nome: <%= pessoaLogada.getNome() %></p>
        <p>RG: <%= pessoaLogada.getRg() %></p>
        <p>CPF: <%= pessoaLogada.getCpf() %></p>
        <p>Data de Nascimento: <%= pessoaLogada.getDataNasc() %></p>
        <p>Estado Civil: <%= pessoaLogada.getEstadoCivil() %></p>
   <%
    }
	%>
</body>
</html>
