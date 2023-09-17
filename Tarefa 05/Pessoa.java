package projeto;

public class Pessoa {
    // Esta classe imita como se fosse uma pessoa no banco de dados
    // Variáveis da pessoa 
    private String user = "usuario01";
    private String password = "senha123";
    private String nome = "Carlos Eduardo de Souza";
    private String rg = "50.476.328-2";
    private String cpf = "253.686.123-72";
    private String data_nasc = "14/08/1977"; 
    private String estado_civil = "casado";

    // Getters para acessar os atributos
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNasc() {
        return data_nasc;
    }

    public String getEstadoCivil() {
        return estado_civil;
    }
}

