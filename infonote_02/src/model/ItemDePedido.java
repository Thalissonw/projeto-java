package model;

public class ItemDePedido {

	 int qtde ;
 double subtotal ;
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
@Override
public String toString() {
	return "ItemDePedido [qtde=" + qtde + ", subtotal=" + subtotal + "]";
}

public ItemDePedido() {
	super();}
	// TODO Auto-generated constructor stub

public ItemDePedido(int qtde, double subtotal) {
	super();
	this.qtde = qtde;
	this.subtotal = subtotal;
 System.out.println("n/nqtde");
 System.out.println("subtotal:this.subtotal");
}
}
