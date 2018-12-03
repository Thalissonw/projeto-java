package controller;

import model.Notebook;
import model.Pedido;
import model.Usuario;
import util.Teclado;


public class InfoNote {
 Usuario user;
	Notebook notebooks[] = new Notebook[10];
	Pedido pedido;
 
 
	 boolean logado = false;
	 
	 public InfoNote() {
		 notebooks [0] = new Notebook (1, "Negativo N22BR","CPU Intel Core 2 Duo,Memoria 2 GB,HD 250 GB",6,1200.00,"img\\n22br.jpg","19/05/2011");
	
		 notebooks [1] new Notebook (2,"Bell B55BR","CPU Intel I3, Memoria 4 GB, HD 500 GB",3,1800.00,"img\\b55br.jpg","20/05/2011");
	
		 notebooks [2] = new Notebook(3, "Pompaq p41BR","CPU Intel I3 Memoria 3 GB, HD 320 GB",1,1600.00,"img\\p41br.jpg","21/05/2011");
		 
	    notebooks [3] = new Notebook(4,"CCF CR71CH","CPU Intel Dual Core, Memoria 2 GB, HD 160 GB",5,1100.00,"img\\cr71ch.jpg","10/06/2011");
	     
	    notebooks [4] = new Notebook(5,"BradescoTech BD22BR","CPU AMD Phenon II, Memoria 4 GB, HD 500 GB",2,1900.00,"img\\bd22br.jpg","10/06/2011");
	 
	 } 
	 
	public static void main(String[] args) {
		InfoNote info = new InfoNote();
		int opcao = 8;
do	{

	  info.mostrarMenu();
	  opcao = Teclado.lerInt("Digite sua op��o");
	  
	  switch (opcao) {
	  
	  
	 	 case 1: 
	 		 info.EfetuarLogin ();
	 		 break;
	 	 case 2:
	 		 info.CadastrarUsuario();
	 		 break;
	 	 case 3:
	 		 info.buscarNotebook();
	 		 break;
	 	 case 4:
	 		 info.manterCarrinho();
	 		 break;
	 		 
	 	 case 5:
	 		 info.manterCarrinho();
	 		 break;
	 	 
	 	 case 6:
	 		 info.manterCarrinho();
	 		 break;
	 		  
	 	 case 7:
	 		 if (!info.logado) {
	 			 System.out.println("Efetue login para efetuar comprar.");
	 			 break;
	 		 } else {
	 			 info.efetuarCompra();
	 			 break;
	 		 }
	 	 case 8:
	 		 System.out.println("Saida do Sistema.");
	 		 break;
	 		 
	 		 default:
	 			 System.out.println("Op��o invalida!");		 
	  }
	   Teclado.lertexto("Pressione uma tecla para continuar....");
} while(opcao !=8);


}

	public void mostrarMenu() {
		System.out.println("=================================");
		System.out.println("InfoNote - se n�o � Info n�o vendemos. ");
		System.out.println("==========================");
		System.out.println("1-Login");
		System.out.println("2-Cadastrar Cliente");
		System.out.println("3- Buscar Notebook");
		System.out.println("4- Inserir Notebook no carrinho");
		System.out.println("5-Remover Notebook no carrinho");
		System.out.println("Efetuar Compra");
		System.out.println("Sair");
	}
	public void EfetuarLogin() {
		String login, senha;
		login = Teclado.lertexto("Digite o login:");
		senha = Teclado.lertexto("Digite a senha:");
		
		if (login.equals("admin") && senha.equals("3232")) {
			System.out.println("Login efetuado com sucesso.");
			logado = true;
		}else {
			System.out.println("Login ou Senha inv�lida");
			EfetuarLogin();}
	  
	}

	public void CadastrarUsuario() {
		System.out.println("==========");
		System.out.println("InfoNote - Cadastro de Usu�rio");
		System.out.println("=============");
		int matricula = Teclado.lerInt("Matricula:");
		String login = Teclado.lertexto("Login");
		String senha = Teclado.lertexto("Senha");
		String nome = Teclado.lertexto("Nome");
		String email = Teclado.lertexto("Email");
		String telefone = Teclado.lertexto("Telefone");

		user = new Usuario(matricula, login, senha, nome, email, telefone);
		
		System.out.println("=================");
		System.out.println("Usuarios Cadastrado Com Sucesso.");
		System.out.println("==================");

		System.out.println(user);
	}

	public void buscarNotebook() {
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] !=null) {
		System.out.println(notebooks[i].getNumeroNote() +"------");
          notebooks[i].getModelo();
			}
		}
	}

	public void manterCarrinho() {
		public void inserirNotebook() {
			//L� o notebook escolhido do teclado
			String numeroNote = Teclado.lertexto("Informe o n�mero do notebook" + "para compra:");
			 
			//criar pedido
			if (pedido == null) {
				pedido = new pedido();
				
				Notebook aux = null;
				for (int i = 0 i < notebooks.length; i++) {
					if (notebooks[i] != null && numeroNote.equals(notebooks[i].getNumeroNote())) {
						aux = notebooks[i];
					}
				}
				if (aux == null) {
					return;
				}
				ItemDePedido item = new ItemPedido(1,aux.getPrecoUnitario(),aux);
				
				pedido.inserirItem(item);
			}
			System.out.println("buscarNotebook - Em Constru��o");
			}
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Contru��o");
	

	}
	  }

		

