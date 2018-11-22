package model;

public class Pedido {

	public int numero ;
public 	String dataEmisao ;
public	String formaDePagamento;
public double valorTotal ;
public String situacao;
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getDataEmisao() {
	return dataEmisao;
}
public void setDataEmisao(String dataEmisao) {
	this.dataEmisao = dataEmisao;
}
public String getFormaDePagamento() {
	return formaDePagamento;
}
public void setFormaDePagamento(String formaDePagamento) {
	this.formaDePagamento = formaDePagamento;
}
public double getValorTotal() {
	return valorTotal;
}
public void setValorTotal(double valorTotal) {
	this.valorTotal = valorTotal;
}
public String getSituacao() {
	return situacao;
}
public void setSituacao(String situacao) {
	this.situacao = situacao;
}
@Override
public String toString() {
	return "Pedido [numero=" + numero + ", dataEmisao=" + dataEmisao + ", formaDePagamento=" + formaDePagamento
			+ ", valorTotal=" + valorTotal + ", situacao=" + situacao + "]";
}

}


