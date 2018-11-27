ackage controller;

import model.;

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
		
		Endereco end4 = new Endereco();
		end4.setBairro("tijuca");
		end4.setCep("232425");
		end4.setCidade("Rio de Janeiro");
		end4.setComplemento("65");
		end4.setEstado("RJ");
		end4.setLogradouro(5);
		end4.setNumero("45");		
			Endereco4 end = new Endereco4("tijuca","232425","Rio de Janeiro","65","RJ",5,"45");
				
		Pedido pdd = new Pedido();
		pdd.setDataEmisao("12/11/18");
		pdd.setFormaDePagamento("Dinheiro");
		pdd.setNumero(1);
		pdd.setSituacao("Novo");
		pdd.setValorTotal(102);
		  Pedido pdd  = new Pedido(1,"Dinheiro","Novo","12/11/18","102");
		  
		Notebook not1 = new Notebook();
		not1.setModelo("Novo");
		not1.setNumeroNote(10);
		not1.setFigura("2");
		not1.setEstoque(4);
		not1.setDescricao("574");
		not1.setPreçoUnitario(509);
		not1.setDataCadrasto("11/10/18");
	Notebook not = new Notebook ("Novo",10,"2",4,"574",509,"11/10/18");
		
	
		Notebook note2 = new Notebook();
		note2.setModelo("Semi-Novo");
		note2.setNumeroNote(20);
		note2.setFigura("4");
		note2.setEstoque(6);
		note2.setDescricao("574");
		note2.setPreçoUnitario(987);
		note2.setDataCadrasto("09/10/18");
		Notebook note = new Notebook("Semi-Novo",20,"4",6,"574",987,"09/10/18");
		
		
		Notebook nots3 = new Notebook();
		nots3.setModelo("");
		nots3.setNumeroNote(11);
		nots3.setFigura("");
		nots3.getEstoque();
		nots3.setDescricao("");
		nots3.getPreçoUnitario();
		nots3.setDataCadrasto("");
		
		
		
		
	}
 
}
