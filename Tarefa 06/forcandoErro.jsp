<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tarefa 06</title>
</head>
<body>
    <h1>Aqui força o erro Null Pointer Exception</h1>
    
    <% 
    // string recebe valor nulo e depois tento acessar o tamanho da string, que no caso é nulo
    String mensagem = null;
    out.println(mensagem.length()); // forçando o erro e indo para a pagina de erro jsp
    %>
    
</body>
</html>