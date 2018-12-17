package model;

import java.text.NumberFormat;

public class ItemDePedido {

	int qtde;
	double subtotal;
	private Notebook notebook;
	private String subtotalFormatado;
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public Notebook getNotebook() {
		return notebook;
	}
	public void setNotebook(Notebook notebook) {
		this.notebook = notebook;
	}
	public ItemDePedido(int qtde, double subtotal, Notebook notebook) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
		this.notebook = notebook;
	}
	public ItemDePedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setFormat()
	{

		NumberFormat f = NumberFormat.getCurrencyInstance();
		this.subtotalFormatado = f.format(this.subtotal);
	}
}
