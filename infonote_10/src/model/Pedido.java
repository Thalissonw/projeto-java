package model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Pedido {

	private int numeroPedido;
	private String dataEmisao;
	private String formaDePagamento;
	private double valorTotal;
	private String valorTotalFormatado;
	private String situacao;
	private String endercoDeEntrega;

	public void setNumero(int numero) {
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

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(int numeroPedido, String dataEmisao, String formaDePagamento, double valorTotal, String situacao,
			Endereco enderecoEntrega) {
		super();
		this.numeroPedido = numeroPedido;
		this.dataEmisao = dataEmisao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;
		this.enderecoEntrega = enderecoEntrega;
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

	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";

		retValue = "Informações sobre Pedido:" + ENTER + "Número do Pedido:" + numeroPedido + ENTER + "Data de Emissão:"
				+ dataEmisao + ENTER + "Forma de pagamento:" + formaDePagamento + ENTER + "ValorTotal:" + valorTotal
				+ ENTER + "Situação: " + situacao + ENTER + "Endereço de Entrega:" + ENTER + "Itens:"; 
		
		for (int i = 0; i < itens.length; i++) {
			retValue += itens[i] + ENTER;
		}
		return retValue;

		
		}
	

	private Endereco enderecoEntrega;
	private ItemDePedido itens[] = new ItemDePedido[10];

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
	
	public void setFormat()
	{
		NumberFormat f = NumberFormat.getCurrencyInstance();
		this.valorTotalFormatado = f.format(this.valorTotal);
	}
	/*
		public static void main(String[] args) {

			System.out.println("Sem formatação: " + valor);
			System.out.println("Formatado: " + f.format(valor));
			NumberFormat p = NumberFormat.getPercentInstance();
			double porcento = 0.05;
			System.out.println("Sem formatação: " + porcento);
			System.out.println("Formatado: " + p.format(porcento));	
		
			NumberFormat n = NumberFormat.getNumberInstance();
			double numero = 100.50;
			System.out.println("Sem formatação: " + numero);
			System.out.println("Formatado: " + n.format(numero));
			double valor2 = 12000.5;
			DecimalFormat df = new DecimalFormat("R$ ###,###,###.00");
			System.out.println("Sem formatação: " + valor2);
			System.out.println("Formatado: " + df.format(valor2));
			}
	*/
}



