package model;

public class Usuarios {
		
		public int matricular;
	public 	String login;
	public	String senha;
	public String nome;
	public String email;
	public String telefone;
	@Override
	public String toString() {
		return "Usuarios [matricular=" + matricular + ", login=" + login + ", senha=" + senha + ", nome=" + nome
				+ ", email=" + email + ", telefone=" + telefone + "]";
	}
	public int getMatricular() {
		return matricular;
	}
	public void setMatricular(int matricular) {
		this.matricular = matricular;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
		
	}

