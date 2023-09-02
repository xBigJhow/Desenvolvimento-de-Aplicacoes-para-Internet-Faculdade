<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<link rel="stylesheet" href="stylejsp.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora</title>
</head>
<body>
    
    <% String valor1 = request.getParameter("valor1");
       String valor2 = request.getParameter("valor2");

       double num1 = Double.parseDouble(valor1);
       double num2 = Double.parseDouble(valor2);
    %>

    <h1>Resultado do Cálculo</h1>
    <p>Valor 1: <%= num1 %></p>
    <br/>
    <p>Valor 2: <%= num2 %></p>
	<br/>
    <p>Soma: <%= num1 + num2 %></p>
    <br/>
    <p>Subtração: <%= num1 - num2 %></p>
    <br/>
    <p>Multiplicação: <%= num1 * num2 %></p>
    <br/>
    <p>Divisão: <%= num1 / num2 %></p>
</body>
</html>