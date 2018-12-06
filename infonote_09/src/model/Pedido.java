package model;

public class Pedido {

	private int numeroPedido;
	private String dataEmisao;
	private String formaDePagamento;
	private double valorTotal;
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

}
