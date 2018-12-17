package model;

import java.text.NumberFormat;
import java.util.Locale;

public class Notebook {

	private int numeroNote;
	private 	String modelo;
	private	String descricao;
	private int estoque;
	private double pre�oUnitario;
	private String figura;
	private String dataCadastro;
       public int getNumeroNote() {
		return numeroNote;
	}
	public void setNumeroNote(int numeroNote) {
		this.numeroNote = numeroNote;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getPre�oUnitario() {
		return pre�oUnitario;
	}
	public void setPre�oUnitario(double pre�oUnitario) {
		this.pre�oUnitario = pre�oUnitario;
	}
	public String getFigura() {
		return figura;
	}
	public void setFigura(String figura) {
		this.figura = figura;
	}
	public String getDataCadrasto() {
		return dataCadastro;
	}
	public void setDataCadrasto(String dataCadrasto) {
		this.dataCadastro = dataCadrasto;
	}
	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		Locale local = new Locale("pt","BR");
		
		retValue = "Informa��es sobre Notebook:" + ENTER +
				"N�mero de S�rie do Notebook: " + numeroNote + ENTER +
				"Modelo: " + modelo + ENTER +
				"Descricao: " + descricao + ENTER +
				"Estoque: " + estoque + ENTER +
				"Pre�o Unitario: " +
				NumberFormat.getCurrencyInstance(local).format(this.getPre�oUnitario()) +
				ENTER +
				"Figura: " + figura + ENTER +
				"Data de cadastro: " + dataCadastro;
				return retValue;
	}
	public Notebook() {
		super();
		// TODO Auto-generated constructor stub
	}
  

	public Notebook(int numeroNote, String modelo, String descricao, int estoque, double pre�oUnitario, String figura,
			String dataCadrasto) {
		super();
		this.numeroNote = numeroNote;
		this.modelo = modelo;
		this.descricao = descricao;
		this.estoque = estoque;
		this.pre�oUnitario = pre�oUnitario;
		this.figura = figura;
		this.dataCadastro = dataCadrasto;
	}
	
	   public void mostrar() {
		   //Mostrar notebook
		System.out.println("n/nNumeroNote");   
		 System.out.println("Modelo:"+ this.modelo);
		 System.out.println("Descricao:"+ this.descricao);
		System.out.println("Estoque:" + this.estoque);
		System.out.println("Pre�oUnitario:" + this.pre�oUnitario);
		System.out.println("Figura:" + this.figura);
		System.out.println("DataCadrasto:" + this.getDataCadrasto());
		
		   
		   
		   
		   
	   }
}