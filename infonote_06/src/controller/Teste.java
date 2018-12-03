package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemDePedido Idp1 = new ItemDePedido();
		Idp1.setQtde(2);
		Idp1.setSubtotal(22.98);
		System.out.println(Idp1.toString());

		ItemDePedido Idp2 = new ItemDePedido();
		Idp2.setQtde(1);
		Idp2.setSubtotal(98.75);
		System.out.println(Idp2.toString());
		
		Usuario user = new Usuario();
		user.setNome("thalysson");
		user.setSenha("2211");
		user.setLogin("*****");
		user.setTelefone("98768870");
		user.setMatricular(301);
		user.setEmail("pedro@.com");
		 
		Usuario user1 = new Usuario(1,"Pedro","climbler","Pedro climbler","pedroclimbler@gmail.com","3354-4556");
		
		      //Mostrar Usuário
		  user1.mostrar();
		
		Endereco end = new Endereco();
		end.setBairro("tijuca");
		end.setCep("232425");
		end.setCidade("Rio de Janeiro");
		end.setComplemento("65");
		end.setEstado("RJ");
		end.setLogradouro(5);
		end.setNumero("45");
		//public Endereco(int logradouro, String numero, String complemento, String bairro, String cidade, String estado,String cep) {
		Endereco end4 = new Endereco(5,"45","65","tijuca","Rio de janeiro","Rj","232425");
				//Mostrar Endereco
		end4.mostar();		
				
		
		//	public Pedido(int numero, String dataEmisao, String formaDePagamento, double valorTotal, String situacao) {
		Pedido pdd = new Pedido(1,"12/11/18","Dinheiro",102,"Novo");
		   pdd.mostrar();
		
	
		// public Notebook(int numeroNote, String modelo, String descricao, int estoque, double preçoUnitario, String figura,	String dataCadrasto) {
		Notebook not = new Notebook (10,"Novo","564",06,509,"2","11/10/18");
		//Mostrar Notebook
		not.mostrar();
	
		
		//	public Notebook(int numeroNote, String modelo, String descricao, int estoque, double preçoUnitario, String figura,	String dataCadrasto) {
		Notebook note = new Notebook (20,"Semi-Novo","574",06,987,"4","09/10/18");
			note.mostrar();
		
		
		//	public Notebook(int numeroNote, String modelo, String descricao, int estoque, double preçoUnitario, String figura,String dataCadrasto) {
		Notebook nots = new Notebook(11,"Usado","098",07,876,"05","07/08/18");
		
		nots.mostrar();
		
		
		
	}
 
}
