package model;

public class Endereço {
	private int logradouro;
private 	String numero ;
private	String complemento;
private String bairro ;
private String cidade ;
private int getLogradouro() {
	return logradouro;
}
public void setLogradouro(int logradouro) {
	this.logradouro = logradouro;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public String getComplemento() {
	return complemento;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
@Override
public String toString() {
	return "Endereço [logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento + ", bairro="
			+ bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + "]";
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public String estado ;
public String cep ;


public Endereço() {
	super();
	// TODO Auto-generated constructor stub
}
public Endereço(int logradouro, String numero, String complemento, String bairro, String cidade, String estado,
		String cep) {
	super();
	this.logradouro = logradouro;
	this.numero = numero;
	this.complemento = complemento;
	this.bairro = bairro;
	this.cidade = cidade;
	this.estado = estado;
	this.cep = cep;
}
   
public void mostar() {
	// Mostrar Endereco
	System.out.println("n/nLogradouro:/n");
	System.out.println("Numero:" + this.numero);
	System.out.println("Complemento:" + this.complemento);
    System.out.println("Bairro:" + this.bairro);
    System.out.println("Cidade:" + this.cidade);
    System.out.println("Estado;" + this.estado);
    System.out.println("Cep:" + this.cep);
}
}

	
