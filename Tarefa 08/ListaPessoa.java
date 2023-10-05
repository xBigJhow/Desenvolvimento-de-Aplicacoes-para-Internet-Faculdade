package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ListaPessoa {

    private String url = "jdbc:mysql://localhost:3306/cadastro_pessoa";
    private String user = "admin";
    private String password= "123456";

    private static final String listaPessoa = "SELECT * FROM pessoa";

    public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(listaPessoa)) {
            
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
            	int id = rs.getInt("id");
                String nome = rs.getString("nome_completo");
                String usuario = rs.getString("usuario");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                String telefone = rs.getString("telefone");

                Pessoa pessoa = new Pessoa(id, nome, usuario, email, senha, telefone);
                pessoas.add(pessoa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return pessoas;
    }
}