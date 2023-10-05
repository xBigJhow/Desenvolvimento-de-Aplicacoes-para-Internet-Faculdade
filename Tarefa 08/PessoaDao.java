package dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Pessoa;


public class PessoaDao {
	
	public int registerPessoa(Pessoa pessoa) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO pessoa" + 
			"(nome_completo, usuario, email, senha, telefone) VALUES" + 
			" (?, ?, ?, ?, ?);";
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/cadastro_pessoa";
		String user = "admin";
		String password = "123456";
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			PreparedStatement preparedstatement = connection.prepareStatement(INSERT_USERS_SQL);
			preparedstatement.setString(1, pessoa.getNome());
			preparedstatement.setString(2, pessoa.getUsuario());
			preparedstatement.setString(3, pessoa.getEmail());
			preparedstatement.setString(4, pessoa.getSenha());
			preparedstatement.setString(5, pessoa.getTelefone());
			
			System.out.println(preparedstatement);
			
			result = preparedstatement.executeUpdate();
			
			connection.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	
}
