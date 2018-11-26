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
		
		Usuarios user = new Usuarios();
		user.setNome("thalysson");
		user.setSenha("2211");
		user.setLogin("*****");
		user.setTelefone("98768870");
		user.setMatricular(301);
		user.setEmail("pedro@.com");
		 
		Usuarios user1 = new Usuarios(1,"Pedro","climbler","Pedro climbler","pedroclimbler@gmail.com","3354-4556");
		
		      //Mostrar Usuário
		  user1.mostrar();
		
		Endereço end = new Endereço();
		end.setBairro("tijuca");
		end.setCep("232425");
		end.setCidade("Rio de Janeiro");
		end.setComplemento("");
		end.setEstado("RJ");
		end.getLogradouro();
		end.setNumero("45");
				
				
				
		Pedido pdd = new Pedido();
		pdd.setDataEmisao("");
		pdd.setFormaDePagamento("");
		pdd.setNumero(18);
		pdd.setSituacao("");
		pdd.getValorTotal();
		 
		Notebook not = new Notebook();
		not.setModelo("");
		not.setNumeroNote(10);
		not.setFigura("");
		not.getEstoque();
		not.setDescricao("");
		not.getPreçoUnitario();
		not.setDataCadrasto("");
		
	
		
		Notebook note = new Notebook();
		note.setModelo("");
		note.setNumeroNote(20);
		note.setFigura("");
		note.getEstoque();
		note.setDescricao("");
		note.getPreçoUnitario();
		note.setDataCadrasto("");
		
		
		
		Notebook nots = new Notebook();
		nots.setModelo("");
		nots.setNumeroNote(11);
		nots.setFigura("");
		nots.getEstoque();
		nots.setDescricao("");
		nots.getPreçoUnitario();
		nots.setDataCadrasto("");
		
		
		
		
	}
 
}
