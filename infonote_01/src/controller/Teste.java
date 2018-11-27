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
		 
		System.out.println(user.toString());

		
		Endereco end = new Endereco();
		end.setBairro("tijuca");
		end.setCep("232425");
		end.setCidade("Rio de Janeiro");
		end.setComplemento("102");
		end.setEstado("RJ");
		end.setLogradouro(2);
		end.setNumero("45");
		  
		System.out.println(end.toString());
		
		
		
		Pedido pdd = new Pedido();
		pdd.setDataEmisao("12/11/18");
		pdd.setFormaDePagamento("Dinheiro");
		pdd.setNumero(1);
		pdd.setSituacao("Novo");
		pdd.setValorTotal(102);
		 
		System.out.println(pdd.toString());
		
		Notebook not = new Notebook();
		not.setModelo("novo");
		not.setNumeroNote(10);
		not.setFigura("2");
		not.setEstoque(4);
		not.setDescricao("564");
		not.setPreçoUnitario(509);
		not.setDataCadrasto("11/10/18");
		
		System.out.println(not.toString());
		
		Notebook note = new Notebook();
		note.setModelo("semi-novo");
		note.setNumeroNote(20);
		note.setFigura("4");
		note.setEstoque(6);
		note.setDescricao("574");
		note.setPreçoUnitario(987);
		note.setDataCadrasto("9/10/18");
		
		System.out.println(note.toString());
		
		Notebook nots = new Notebook();
		nots.setModelo("usado");
		nots.setNumeroNote(11);
		nots.setFigura("5");
		nots.setEstoque(7);
		nots.setDescricao("098");
		nots.setPreçoUnitario(876);
		nots.setDataCadrasto("7/9/18");
		
		System.out.println(nots.toString());
	}

}
