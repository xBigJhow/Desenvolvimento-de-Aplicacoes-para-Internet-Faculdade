<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrar Pessoa</title>

<style>
body {
  background-color: #f0f0f0;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
  margin: 0;
  font-family: "Arial", sans-serif;
}

.container {
  background-color: #fff;
  border: 1px solid #ccc;
  border-radius: 8px;
  padding: 35px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  width: 300px;
  margin: 0 auto;
  text-align: center;
}

h1 {
  font-size: 24px;
  margin-bottom: 20px;
}

label {
  display: inline-block;
  margin-bottom: 5px;
  font-weight: bold;
  width: 70px; /* Largura fixa para os rótulos */
  text-align: right; /* Alinhar os rótulos à direita */
  padding-right: 10px; /* Adicionar um espaçamento à direita */
}

input[type="text"],
input[type="password"],
input[type="email"] {
  width: 180px; /* Largura fixa para os campos de entrada */
  padding: 10px;
  margin-bottom: 15px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

.button {
  display: inline-block;
  padding: 10px 20px;
  background-color: #007bff;
  color: #fff;
  text-decoration: none;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.button:hover {
  background-color: #0056b3;
}
</style>

</head>
<body>
<div class="container">
    <h1>Registrar Pessoa</h1>
    <form action="<%= request.getContextPath()%>/register" method="post">
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome" />

        <label for="usuario">Usuário:</label>
        <input type="text" name="usuario" id="usuario" />

        <label for="senha">Senha:</label>
        <input type="password" name="senha" id="senha" />

        <label for="email">Email:</label>
        <input type="email" name="email" id="email" />

        <label for="telefone">Telefone:</label>
        <input type="text" name="telefone" id="telefone" />

        <br/>
        <input type="submit" value="Registrar" class="button"/>

        <a class="button" href="<%= request.getContextPath()%>/listapessoas.jsp">Listar Pessoas</a>
    </form>
</div>
</body>
</html>