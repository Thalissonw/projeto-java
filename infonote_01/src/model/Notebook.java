package model;

public class Notebook {

	public int numeroNote;
	public 	String modelo;
	public	String descricao;
	public int estoque;
	public double pre�oUnitario;
	public String figura;
	public String dataCadrasto;
	
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
		return dataCadrasto;
	}
	public void setDataCadrasto(String dataCadrasto) {
		this.dataCadrasto = dataCadrasto;
	}
	@Override
	public String toString() {
		return "Notebook [numeroNote=" + numeroNote + ", modelo=" + modelo + ", descricao=" + descricao + ", estoque="
				+ estoque + ", pre�oUnitario=" + pre�oUnitario + ", figura=" + figura + ", dataCadrasto=" + dataCadrasto
				+ "]";
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
		this.dataCadrasto = dataCadrasto;
	}
	
	   public void mostrar() {
		   //Mostrar notebook
		System.out.println("n/nNumeroNote");   
		 System.out.println("Modelo:"+ this.modelo);
		 System.out.println("Descricao:"+ this.descricao);
		System.out.println("Estoque:" + this.estoque);
		System.out.println("Pre�oUnitario:" + this.pre�oUnitario);
		System.out.println("Figura:" + this.figura);
		System.out.println("DataCadrasto:" + this.dataCadrasto);
		
}
}

   
   
   
   
   

