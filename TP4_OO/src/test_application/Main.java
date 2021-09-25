package test_application;

import java.util.ArrayList;
import java.util.Scanner;

import control.ControleBebida;
import control.ControleCliente;
import control.ControleEstabelecimento;
import control.ControleEstoque;
import control.ControlePastel;
import control.ControleVenda;
import modelo.Bebida;
import modelo.Cliente;
import modelo.Estabelecimento;
import modelo.Pastel;
import modelo.Telefone;
import modelo.Venda;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Cliente> clientes;
	public static ArrayList<Bebida> bebidas;
	public static ArrayList<Pastel> pasteis;
	public static ArrayList<Integer> estoque_pastel;
	public static ArrayList<Integer> estoque_bebida;
	public static ArrayList<Estabelecimento> estabelecimentos;
	public static ArrayList<Venda> vendas;

	public static void main(String[] args) {

		// Todas as ArraysUtilizadas, Aqui est�o tambem dados pr�-cadastrados.

		int caseSelect = 0;
		clientes = new ArrayList<Cliente>();
		bebidas = new ArrayList<Bebida>();
		pasteis = new ArrayList<Pastel>();
		estoque_pastel = new ArrayList<Integer>();
		estoque_bebida = new ArrayList<Integer>();
		estabelecimentos = new ArrayList<Estabelecimento>();
		vendas = new ArrayList<Venda>();

		clientes.add(new Cliente("Mateus", "Bras�lia", "11111111111", new Telefone("61", "123456789")));
		clientes.add(new Cliente("Matheus", "Valpara�so", "22222222222", new Telefone("61", "987654321")));

		bebidas.add(new Bebida("�gua", (float) 4.99, 1, "Uma garrafa de �gua", "0", "�gua", "500"));
		bebidas.add(new Bebida("Coca-cola", (float) 7.99, 2, "Uma lata de Coca-cola", "85", "Refrigerante", "300"));
		bebidas.add(new Bebida("Coca-cola light", (float) 7.99, 3, "Uma lata de Coca-cola light", "2", "Refrigerante",
				"300"));

		pasteis.add(new Pastel("Pastel de queijo pequeno", (float) 13.99, 1, "Pastel recheado com queijo", "215",
				"Salgado", "10"));
		pasteis.add(new Pastel("Pastel de carne pequeno", (float) 13.99, 2, "Pastel recheado com carne", "149",
				"Salgado", "10"));
		pasteis.add(new Pastel("Pastel de chocolate m�dio", (float) 15.99, 3, "Pastel recheado com carne", "250",
				"Doce", "15"));

		estabelecimentos.add(new Estabelecimento("Bras�lia", "11111111", new Telefone("61", "111112222")));
		estabelecimentos.add(new Estabelecimento("Valpara�so", "22222222", new Telefone("61", "222221111")));

		estoque_pastel.add(10);
		estoque_pastel.add(20);
		estoque_pastel.add(30);
		estoque_bebida.add(30);
		estoque_bebida.add(40);
		estoque_bebida.add(50);
		
		vendas.add(new Venda(1, clientes.get(0), (float) 13.44));
		vendas.add(new Venda(2, clientes.get(1), (float) 44.13));
		
		mensagemBoasVindas();

		do {
			menuInicial();
			caseSelect = sc.nextInt();
			sc.nextLine();
			switch (caseSelect) {
			case 1: // Switch remete a fun��o de cadastrar clientes

				ControleCliente.cadastrarCliente();

				break;

			case 2: // Switch remete a fun��o de visualizar Clientes

				ControleCliente.visualizarClientes();

				break;

			case 3: // Switch remete a fun��o de Editar clientes, a fun��o visualizar � chamada para
					// auxiliar no processo.

				ControleCliente.visualizarClientes();
				ControleCliente.editarCliente(clientes);

				break;

			case 4: // Switch remete a fun��o de Deletar clientes, a fun��o visualizar � chamada
					// para
					// auxiliar no processo

				ControleCliente.visualizarClientes();
				ControleCliente.deletarCliente(clientes);

				break;

			case 5: // Switch remete a fun��o de cadastrar Bebida;

				ControleBebida.cadastrarBebida();

				break;

			case 6: // Switch remete a fun��o de visualizar bebida.

				ControleBebida.visualizarBebidas();

				break;

			case 7: // Switch remete a fun��o de editar bebida, a fun��o visualizar � chamada para
					// auxiliar.

				ControleBebida.visualizarBebidas();
				ControleBebida.editarBebida(bebidas);

				break;

			case 8: // Switch remete a fun��o de deletar bebida, a fun��o visualizar � chamada para
					// auxiliar.

				ControleBebida.visualizarBebidas();
				ControleBebida.deletarBebida(bebidas);

				break;

			case 9: // Switch remete a fun��o cadastrar Pastel.

				ControlePastel.cadastrarPastel();

				break;

			case 10: // Switch remete a fun��o visualizar Pastel.

				ControlePastel.visualizarPastel();
				break;

			case 11: // Switch remete a fun��o editar Pastel, a fun��o visualizar � chamada para
						// auxiliar.

				ControlePastel.visualizarPastel();
				ControlePastel.editarPastel(pasteis);

				break;

			case 12:  // Switch remete a fun��o deletar pastel.

				ControlePastel.visualizarPastel();
				ControlePastel.deletarPastel(pasteis);

				break;

			case 13: //Switch remete a fun��o cadastrar estabelecimento.

				ControleEstabelecimento.cadastrarEstabelecimento();

				break;

			case 14:  //Switch remete a fun��o visualizar estabelecimento.

				ControleEstabelecimento.visualizarEstabelecimentos();
				break;

			case 15:  //Switch remete a fun��o editar estabelecimento.

				ControleEstabelecimento.visualizarEstabelecimentos();
				ControleEstabelecimento.editarEstabelecimento(estabelecimentos);

				break;

			case 16: //Switch remete a fun��o deletar estabelecimento.

				ControleEstabelecimento.visualizarEstabelecimentos();
				ControleEstabelecimento.deletarEstabelecimento(estabelecimentos);

				break;

			case 17: //Switch remete a fun��o cadastrar estoque produto(De fato ela edita .... o cadastro em si � feito junto com cadastro do produto).

				ControleEstoque.cadastrarEstoqueProduto();
				break;

			case 18: //Switch visualizar estoque produto, vem embutido um filtro de estoque

				ControleEstoque.visualizarEstoqueProduto();
				break;

			case 19:  //Switch deletar estoque

				ControleEstoque.deletarEstoque();
				break;

			case 20: //Switch Cadastro venda para cliente

				ControleVenda.vendaCliente();
				break;

			case 21: //Switch de visualizar vendas

				ControleVenda.visualizarVendas();
				break;

			case 22: //Switch editar Venda

				ControleVenda.visualizarVendas();
				ControleVenda.editarVenda();
				break;

			case 23: //Switch deletar venda

				ControleVenda.deletarVenda();
				break;

			case 24: //Switch de filtro de pasteis por sabor

				ControlePastel.filtrarPastel(pasteis);
				break;

			case 25:  //Switch de filtro

				ControleEstoque.filtrarEstoque();
				break;

			case 26: //Exit do programa

				System.out.println("Programa finalizado");
				break;

			default: //Error
				System.out.println("error\nRetornando ao menu!");
				Main.menuInicial();
			}
		} while (caseSelect != 26);

		sc.close();
	}

	public static void menuInicial() {
		try {
			Thread.sleep(2000);
			System.out.println("\nEscolha uma op��o:\n" + "\n______________Op��es Cliente______________\n\n"
					+ "1.Cadastro de novo Cliente\n" + "2.Visualizar a lista de clientes\n"
					+ "3.Editar um cadastro de cliente\n" + "4.Deletar um Cliente\n"
					+ "__________________________________________\n\n"
					+ "\n______________Op��es Bebida_______________\n\n" + "5.Cadastro de nova bebida\n"
					+ "6.Visualizar a lista de bebidas\n" + "7.Editar uma bebida\n" + "8.Deletar uma bebida\n"
					+ "__________________________________________\n\n"
					+ "\n______________Op��es Pastel_______________\n\n" + "9.Cadastrar Pastel\n"
					+ "10.Visualizar a lista de past�is\n" + "11.Editar um pastel\n" + "12.Deletar um pastel\n"
					+ "__________________________________________\n\n"
					+ "\n__________Op��es Estabelecimento__________\n\n" + "13.Cadastrar novo estabelecimento\n"
					+ "14.Visualizar lista de " + "Estabelecimentos" + "\n15.Editar um estabelecimento"
					+ "\n16.Deletar um estabelecimento" + "\n__________________________________________\n\n"
					+ "\n_____________Op��es Estoque_______________\n\n" + "17.Edita Estoque"
					+ "\n18.Visualizar/filtrar estoque" + "\n19.Zerar Estoque"
					+ "\n__________________________________________\n\n"
					+ "\n______________Op��es Venda________________\n\n" + "20.Cadastrar venda"
					+ "\n21.Visualizar vendas" + "\n22.Editar uma venda" + "\n23.Deletar uma venda"
					+ "\n__________________________________________\n\n"
					+ "\n______________Op��es Filtros______________\n\n" + "24.Filtrar Past�is por sabor"
					+ "\n25.Filtro Estoque" + "\n26.Sair" + "\n__________________________________________\n\n");

		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public static void mensagemBoasVindas() {
		System.out.println("Bem Vindo, Aguarde alguns segundos...\nProcessando...");
		System.out.println("Sim... Isso � um delay programado pra ficar mais f�cil de ver o menu!");
	}

}