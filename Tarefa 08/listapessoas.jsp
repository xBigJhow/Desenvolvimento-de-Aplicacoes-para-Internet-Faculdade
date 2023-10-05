<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.Pessoa" %>
<%@ page import="model.ListaPessoa" %>
<!DOCTYPE html>
<html>
<head>
<title>Lista de Pessoas Cadastradas</title>
</head>
<style>
body {
  background-color: #f0f0f0;
  font-family: "Arial", sans-serif;
  margin: 0;
  padding: 0;
}

h1 {
  text-align: center;
  padding: 20px 0;
  background-color: #007bff;
  color: #fff;
}

table {
  width: 80%;
  margin: 20px auto;
  border-collapse: collapse;
  background-color: #fff;
}

table, th, td {
  border: 1px solid #ccc;
}

th, td {
  padding: 10px;
  text-align: left;
}

th {
  background-color: #007bff;
  color: #fff;
}

.voltar-button {
  display: inline-block;
  margin-left: 20px;
  padding: 10px 20px;
  background-color: #007bff;
  color: #fff;
  text-decoration: none;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  transition: background-color 0.3s ease-in-out;
}

.voltar-button:hover {
  background-color: #0056b3;
}
</style>
<body>
    <h1>Lista de Pessoas Cadastradas</h1>
    
    <table border="1">
        <tr>
        	<th>Id</th>
            <th>Nome</th>
            <th>Usuário</th>
            <th>Email</th>
            <th>Telefone</th>
        </tr>
        
        <%
        ListaPessoa listaPessoaDao = new ListaPessoa();
        List<Pessoa> pessoas = listaPessoaDao.listarPessoas();
        
        for (Pessoa pessoa : pessoas) {
        %>
        <tr>
        	<td><%= pessoa.getId() %></td>
            <td><%= pessoa.getNome() %></td>
            <td><%= pessoa.getUsuario() %></td>
            <td><%= pessoa.getEmail() %></td>
            <td><%= pessoa.getTelefone() %></td>
        </tr>
        <%
        }
        %>
    </table>
    
    
       <a href="<%= request.getContextPath()%>/register" class="voltar-button">Voltar</a>
</body>
</html>