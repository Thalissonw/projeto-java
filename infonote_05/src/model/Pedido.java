package model;

public class Pedido {

	private int numero ;
private	String dataEmisao ;
private	String formaDePagamento;
private double valorTotal ;
private String situacao;
private int getNumero() {
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
public Pedido() {
	super();
	// TODO Auto-generated constructor stub
}
public Pedido(int numero, String dataEmisao, String formaDePagamento, double valorTotal, String situacao) {
	super();
	this.numero = numero;
	this.dataEmisao = dataEmisao;
	this.formaDePagamento = formaDePagamento;
	this.valorTotal = valorTotal;
	this.situacao = situacao;
}
public boolean inserirItem(ItemDePedido item) {
	for (int i = 0; i < itens.length; i++) {
		if (itens[i] == null) {
			itens[i] = item;
			return true;
		}
	}
	return false;
}
   public void mostrar() {
	   // Mostrar pedido
	   System.out.println("n/nNumero:/n");
	   System.out.println("DataEmisao:" + this.dataEmisao);
	   System.out.println("FormaDePagamento:" + this.formaDePagamento);
	   System.out.println("ValorTotal:" + this.valorTotal);
	   System.out.println("Situacao:" + situacao);
	   
	   System.out.println("\n\nItens do pedido:\n");
	   for (int i = O; i < itens.length; i++) {
		   if(itens [i] != null);
		   itens[i].mostrar();
	   }
   }
   private Endereco enderecoEntrega;
   private ItemDePedido itens [] = new ItemDePedido[10];
public Endereco getEnderecoEntrega() {
	return enderecoEntrega;
}
public void setEnderecoEntrega(Endereco enderecoEntrega) {
	this.enderecoEntrega = enderecoEntrega;
}
public ItemDePedido[] getItens() {
	return itens;
}
public void setItens(ItemDePedido[] itens) {
	this.itens = itens;
}

}


