package model;

public class Cliente extends Usuario {
private	String codigoCliente;
private	String nome;
private	String email;
private	String telefone;
private	Endereco enderecos[] = new Endereco[10];
private	Pedido pedido[] = new Pedido[10];
	
@Override
public String toString() {
	return "Cliente [codigoCliente=" + codigoCliente + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
			+ ", enderecos=" + enderecos + ", pedido=" + pedido + "]";
}
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
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
	public Endereco[] getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}
	public Pedido[] getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}
  public Cliente() {
	  super();
  }
public Cliente(String login, String senha, int tipo) {
	super(login, senha, tipo);
	// TODO Auto-generated constructor stub
	
	
}

}
