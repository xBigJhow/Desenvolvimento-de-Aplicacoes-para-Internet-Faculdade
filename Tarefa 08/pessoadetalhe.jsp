<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pessoa Registrada</title>
</head>
<style>
	body {
  background-color: #f0f0f0; 
  font-family: "Arial", sans-serif; 
  margin: 0;
  padding: 0;
}

.container {
  background-color: #fff; 
  border: 1px solid #ccc;
  border-radius: 8px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); 
  width: 320px; 
  margin: 50px auto;
  text-align: center;
  padding: 20px;
}

h1 {
  font-size: 24px;
  margin-bottom: 20px;
  color: #333;
}

.voltar-button {
  display: inline-block;
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
    <div class="container">
        <h1>Pessoa Registrada com Sucesso</h1>
        <a href="<%= request.getContextPath()%>/register" class="voltar-button">Voltar</a>
    </div>
</body>
</html>