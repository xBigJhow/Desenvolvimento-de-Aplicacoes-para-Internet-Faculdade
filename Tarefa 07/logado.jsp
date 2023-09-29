<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Página de Sucesso</title>
</head>
<body>
    <h1>Você fez login com sucesso!</h1>
    <p>Você está autenticado como <%= request.getSession().getAttribute("username") %>.</p>

</body>
</html>