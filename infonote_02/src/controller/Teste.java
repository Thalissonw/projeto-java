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
		 
		System.out.println(user.toString());

		
		Endereço end = new Endereço();
		end.setBairro("tijuca");
		end.setCep("232425");
		end.setCidade("Rio de Janeiro");
		end.setComplemento("");
		end.setEstado("RJ");
		end.getLogradouro();
		end.setNumero("45");
		  
		System.out.println(end.toString());
		
		
		
		Pedido pdd = new Pedido();
		pdd.setDataEmisao("");
		pdd.setFormaDePagamento("");
		pdd.setNumero(numero);
		pdd.setSituacao("");
		pdd.getValorTotal();
		 
		System.out.println(pdd.toString());
		
		
		
	}

}
