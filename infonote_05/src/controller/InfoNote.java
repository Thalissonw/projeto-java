package controller;

import model.Usuario;
import util.Teclado;

public class InfoNote {
	public static void main(String[] args) {
		InfoNote info = new InfoNote();
		int opcao = 8;
do	{

	{
	  info.mostrarMenu();
	  opcao = Teclado.lerInt("Digite sua opção");
	  switch (opcao) {
	 	 case 1: 
	 		 info.efetuarLogin();
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
	 			 System.out.println("Opção invalida!");		 
	 			 {
	   Teclado.lertexto("Pressione uma tecla para continuar....");
	  }while(opcao!=8);
		 
	   }
  
		public void efetuarLogin() {
			String login, senha;
			login = Teclado.lertexto("Digite o login:");
			senha = Teclado.lertexto("Digite a senha:");
			
			if (login.equals("admin") && senha.equals("3232")) {
				System.out.println("Login efetuado com sucesso.");
				logado = true;
			}else {
				System.out.println("Login ou Senha inválida");
				efetuarLogin();
			} 
	
  
	 Usuario user;
	 
	 boolean logado = false;}

	public void mostrarMenu() {
		System.out.println("=================================");
		System.out.println("InfoNote - se não é Info não vendemos. ");
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
			System.out.println("Login ou Senha inválida");
			efetuarLogin();
		   
		}
	
	 
	public void CadastrarUsuario() {
		System.out.println("==========");
		System.out.println("InfoNote - Cadastro de Usuário");
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
		System.out.println("buscarNotebook - Em Construção");

	}

	public void manterCarrinho() {
		System.out.println("manterCarrinho - Em Contrução");
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Contrução");
	

	}
	  }

		

