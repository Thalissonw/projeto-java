package model;

public class Usuario {
		
		public int matricular;
	public 	String login;
	public	String senha;
	public String nome;
	public String email;
	public String telefone;
	@Override
	public String toString() {
		return "Usuario [matricular=" + matricular + ", login=" + login + ", senha=" + senha + ", nome=" + nome
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
			 
		
public Usuario() {
	super();
	// TODO Auto-generated constructor stub
	  
	
}
public Usuario(int matricular, String login, String senha, String nome, String email, String telefone) {
	super();
	this.matricular = matricular;
	this.login = login;
	this.senha = senha;
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
}
		 public void mostrar() {
			 //Mostrar Usu�rio
			 System.out.println("/n/nUsu�rio:/n");
			 System.out.println("Matricula:" + this.matricular);
			 System.out.println("Login:" + this.login);
			 System.out.println("Senha:" + this.senha);
			 System.out.println("Nome:" + this.nome);
			 System.out.println("Email:" + this.email);
			 System.out.println("Telefone:" + this.telefone);
			 
		 }
	}


