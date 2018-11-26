package model;

public class Endereço {
	public int logradouro;
public 	String numero ;
public	String complemento;
public String bairro ;
public String cidade ;
public int getLogradouro() {
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

}
 
	 
 

	
