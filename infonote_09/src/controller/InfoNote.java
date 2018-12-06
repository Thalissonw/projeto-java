package controller;

import model.*;
import util.GerarSenha;
import util.Teclado;

public class InfoNote {
	Usuario user;
	Notebook notebooks[] = new Notebook[10];
	Pedido pedido;

	private static Cliente clienteGlobal = null;
	private static Funcionario funcionarioGlobal = null;

	boolean logado = false;

	public InfoNote() {
		notebooks[0] = new Notebook(1, "Negativo N22BR", "CPU Intel Core 2 Duo,Memoria 2 GB,HD 250 GB", 6, 1200.00,
				"img\\n22br.jpg", "19/05/2011");

		notebooks[1] = new Notebook(2, "Bell B55BR", "CPU Intel I3, Memoria 4 GB, HD 500 GB", 3, 1800.00,
				"img\\b55br.jpg", "20/05/2011");

		notebooks[2] = new Notebook(3, "Pompaq p41BR", "CPU Intel I3 Memoria 3 GB, HD 320 GB", 1, 1600.00,
				"img\\p41br.jpg", "21/05/2011");

		notebooks[3] = new Notebook(4, "CCF CR71CH", "CPU Intel Dual Core, Memoria 2 GB, HD 160 GB", 5, 1100.00,
				"img\\cr71ch.jpg", "10/06/2011");

		notebooks[4] = new Notebook(5, "BradescoTech BD22BR", "CPU AMD Phenon II, Memoria 4 GB, HD 500 GB", 2, 1900.00,
				"img\\bd22br.jpg", "10/06/2011");

	}

	public static void main(String[] args) {
		InfoNote info = new InfoNote();
		int opcao = 8;
		do {

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
			}
			Teclado.lertexto("Pressione uma tecla para continuar....");
		} while (opcao != 8);

	}

	public void mostrarMenu() {
		System.out.println("=================================");
		System.out.println("InfoNote - se não é Info não vendemos. ");
		System.out.println("==========================");
		
		if (logado == true) {
			System.out.println("Seja bem vindo," + clienteGlobal.getNomeInvertido());
		}
		System.out.println("1-Login");
		System.out.println("2-Cadastrar Cliente");
		System.out.println("3- Buscar Notebook");
		System.out.println("4- Inserir Notebook no carrinho");
		System.out.println("5-Remover Notebook no carrinho");
		System.out.println("Efetuar Compra");
		System.out.println("Sair");
	}

	public void efetuarLogin() {
		String login, senha;
		login = Teclado.lertexto("Digite o login:");
		senha = Teclado.lertexto("Digite a senha:");
		if (clienteGlobal != null)
			logado = clienteGlobal.validarLogin(login, senha);
		if (logado) {
			System.out.println("login efetuado com sucesso!");
		} else {
			System.out.println("Usuário ou senha invalidar.");
		}
	}

	public void CadastrarUsuario() {
		System.out.println("==========");
		System.out.println("InfoNote - Cadastro de Usuário");
		System.out.println("=============");
		String login = Teclado.lertexto("Login");
		String senha = Teclado.lertexto("Senha");
		int tipo = 1;
		String codigoCliente = Teclado.lertexto("codigo Cliente");
		String nome = Teclado.lertexto("Nome");
		String email = Teclado.lertexto("Email");
		String telefone = Teclado.lertexto("Telefone");

		int longradouro = Teclado.lerInt("Logradouro");
		String numero = Teclado.lertexto("Número");
		String complemento = Teclado.lertexto("Complemento");
		String bairro = Teclado.lertexto("Bairro");
		String cidade = Teclado.lertexto("Cidade");
		String estado = Teclado.lertexto("Estado");
		
		String cep = Teclado.lertexto("CEP");
		if (senha.equals("") || senha == null) {
			senha = GerarSenha.gerarSenha();
			System.out.println("Senha gerada:" + senha);
		}
		Endereco endereco = new Endereco(longradouro, numero, complemento, bairro, cidade, estado, cep);

		Cliente cliente = new Cliente(login, senha, tipo, codigoCliente, nome, email, telefone, endereco);
		clienteGlobal = cliente;

		System.out.println("=================");
		System.out.println("Usuarios Cadastrado Com Sucesso.");
		System.out.println("==================");
		System.out.println(cliente);
		System.out.println(endereco);

	}

	public void buscarNotebook() {
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null) {
				System.out.println(notebooks[i].getNumeroNote() + "------");
				notebooks[i].getModelo();
			}
		}
	}

	public void inserirNotebook() {
		// Lê o notebook escolhido do teclado
		String numeroNote = Teclado.lertexto("Informe o número do notebook" + " para compra: ");
		// Cria pedido
		if (pedido == null) {
			pedido = new Pedido();
		}
		// Busca notebook selecionado
		Notebook aux = null;
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null && numeroNote.equals(notebooks[i].getNumeroNote())) {
				aux = notebooks[i];
			}
		}
		// Se não existir, interrompe
		if (aux == null) {
			return;
		}
		// Cria item
		ItemDePedido item = new ItemDePedido(1, aux.getPreçoUnitario(), aux);
		// Insere item no pedido
		pedido.inserirItem(item);
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Contrução");

	}

	public void manterCarrinho() {
		System.out.println("manterCarrinho - Em Contrucão");
	}
}
