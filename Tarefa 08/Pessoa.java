package model;

public class Pessoa {
	private int id;
    private String nome;
    private String telefone;
    private String usuario;
    private String senha;
    private String email;
    
    public Pessoa() {
    }

    public Pessoa(int id, String nome, String usuario, String email, String senha, String telefone) {
    	this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        
    }
    public int getId() {
        return id;
    }
    public void setId(int Id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}