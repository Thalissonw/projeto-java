package model;

public class Usuario {

	private int matricular;
	private String login;
	private String senha;
	private String nome;
	private String email;
	private String telefone;
	private Endereco enderecos[] = new Endereco[10];
	private Pedido pedidos[] = new Pedido[10];

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

	// inserir o pedido no vetor
	public boolean inserirPedido(Pedido pedido) {
		for (int i = 0; i < pedidos.length; i++) {
			if (pedidos[i] == null) {
				pedidos[i] = pedido;
				return true;
			}
		}
		return false;
	}

	// inserir o endereco no vetor
	public boolean inserirEndereco(Endereco end) {
		for (int i = 0; i < enderecos.length; i++) {
			if (enderecos[i] == null) {
				enderecos[i] = end;
				return true;
			}
		}
		return false;
	}

	public void mostrar() {
		// Mostrar Usuário
		System.out.println("/n/nUsuário:/n");
		System.out.println("Matricula:" + this.matricular);
		System.out.println("Login:" + this.login);
		System.out.println("Senha:" + this.senha);
		System.out.println("Nome:" + this.nome);
		System.out.println("Email:" + this.email);
		System.out.println("Telefone:" + this.telefone);

	}

	public Endereco[] getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}

	public Pedido[] getPedidos() {
		return pedidos;
	}
	/*
	 * public void setPedidos(Pedido[] pedidos) { this.pedidos = pedidos; }
	 */

}
