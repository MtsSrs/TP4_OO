package control;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.Venda;
//import test_application.Main;

public class ControleVenda {
	private ArrayList<Venda> c;

    public ControleVenda(ControleDados d) {
        c = d.getVendas();
    }
//	public static void vendaCliente() {
//		int aux = 0, estoquePastel, estoqueBebida;
//		float preco1 = 0;
//		float preco2 = 0;
//
//		ControleCliente.visualizarNomeCliente();
//
//		System.out.println("\nDigite o número do cliente que realizou a compra");
//		int selecaoCliente = Main.sc.nextInt();
//
//		ControlePastel.visualizarNomePastelId();
//
//		do {
//			System.out.println("Digite o número do pastel comprado");
//			int selecaoPastel = Main.sc.nextInt();
//
//			System.out.println("Digite a quantidade comprada");
//			int quantidadePastel = Main.sc.nextInt();
//
//			estoquePastel = Main.estoquePastel.get(selecaoPastel) - quantidadePastel;
//
//			if (estoquePastel < 0) {
//				System.out.println("\n=>Desculpe mas não há pasteis o bastante no estoque<=\n=>Retornando ao Menu<=\n");
//				return;
//			} else {
//
//				preco1 = preco1 + quantidadePastel * Main.pasteis.get(selecaoPastel).getPrecoProduto();
//
//				Main.estoquePastel.set(selecaoPastel, estoquePastel);
//
//				System.out.println("Deseja cadastrar outro pastel na compra? 1-Sim/2-Não");
//				aux = Main.sc.nextInt();
//				Main.sc.nextLine();
//			}
//		} while (aux != 2);
//
//		ControleBebida.visualizarNomeBebidaId();
//		do {
//			System.out.println("Digite o número da bebida comprada");
//			int selecaoBebida = Main.sc.nextInt();
//
//			System.out.println("Digite a quantidade comprada");
//			int quantidadeBebida = Main.sc.nextInt();
//
//			estoqueBebida = Main.estoqueBebida.get(selecaoBebida) - quantidadeBebida;
//
//			if (estoqueBebida < 0) {
//				System.out.println("\n=>Desculpe mas não há bebidas o bastante no estoque\nretornando ao Menu<=\n");
//				return;
//			} else {
//				preco2 = preco2 + quantidadeBebida * Main.bebidas.get(selecaoBebida).getPrecoProduto();
//
//				Main.estoqueBebida.set(selecaoBebida, estoqueBebida);
//
//				System.out.println("Deseja cadastrar outra bebida na compra? 1-Sim/2-Não");
//				aux = Main.sc.nextInt();
//			}
//		} while (aux != 2);
//
//		Cliente clienteVenda = Main.clientes.get(selecaoCliente);
//
//		int idVenda = Main.vendas.size();
//
//		Venda venda = new Venda(idVenda, clienteVenda, (preco1 + preco2), Main.pasteis.get(0), Main.bebidas.get(0));
//		Main.vendas.add(venda);
//
//		System.out.println("operação concluida... retornando");
//	}
//
//	public static void visualizarVendas() {
//		if (Main.vendas.size() == 0) {
//			System.out.println("Não foram feitas vendas!\nCadastre uma venda nova ... Retornando ao menu");
//		} else {
//			for (int i = 0; i < Main.vendas.size(); i++) {
//				System.out.print("\nID Venda - " + i + "\n");
//				System.out.println(Main.vendas.get(i));
//				System.out.println("__________________________________________");
//			}
//		}
//
//	}
//
//	public static void editarVenda() {
//		System.out.println("Digite o número da venda desejada");
//		int i = Main.sc.nextInt();
//		Main.sc.nextLine();
//		while (i > Main.clientes.size()) {
//			System.out.println("Não temos tantas vendas(ainda)\nDigite um novo número");
//			i = Main.sc.nextInt();
//			Main.sc.nextLine();
//		}
//		ControlePastel.visualizarNomePastelId();
//
//		System.out.println("Digite o número do pastel cadastrado previamente na venda a ser editada");
//		int selecaoPastel = Main.sc.nextInt();
//
//		System.out.println("Digite a quantidade de pasteis cadastrados previamente na venda a ser editada");
//		int quantidadePastel = Main.sc.nextInt();
//		Main.estoquePastel.set(i, Main.estoquePastel.get(i) + quantidadePastel);
//
//		ControleBebida.visualizarNomeBebidaId();
//
//		System.out.println("Digite o número da bebida cadastrada previamente na venda a ser editada");
//		int selecaoBebida = Main.sc.nextInt();
//
//		System.out.println("Digite a quantidade de bebidas cadastradas previamente na venda a ser editada");
//		int quantidadeBebida = Main.sc.nextInt();
//		Main.estoqueBebida.set(i, Main.estoqueBebida.get(i) + quantidadeBebida);
//
//		int aux = 0, estoquePastel, estoqueBebida;
//		float preco1 = 0;
//		float preco2 = 0;
//		ControleCliente.visualizarNomeCliente();
//
//		System.out.println("Digite o número do cliente que realizou a compra");
//		int selecaoCliente = Main.sc.nextInt();
//
//		ControlePastel.visualizarNomePastelId();
//
//		do {
//			System.out.println("Digite o número do pastel comprado");
//			selecaoPastel = Main.sc.nextInt();
//
//			System.out.println("Digite a quantidade comprada");
//			quantidadePastel = Main.sc.nextInt();
//
//			estoquePastel = Main.estoquePastel.get(selecaoPastel) - quantidadePastel;
//
//			if (estoquePastel < 0) {
//				System.out.println("\n=>Desculpe mas não há pasteis o bastante no estoque, retornando ao Menu<=\n");
//				return;
//			} else {
//
//				preco1 = preco1 + quantidadePastel * Main.pasteis.get(selecaoPastel).getPrecoProduto();
//
//				Main.estoquePastel.set(selecaoPastel, estoquePastel);
//
//				System.out.println("Deseja cadastrar outro pastel na compra? 1-Sim/2-Não");
//				aux = Main.sc.nextInt();
//				Main.sc.nextLine();
//			}
//		} while (aux != 2);
//
//		ControleBebida.visualizarNomeBebidaId();
//		do {
//			System.out.println("Digite o número da bebida comprada");
//			selecaoBebida = Main.sc.nextInt();
//
//			System.out.println("Digite a quantidade comprada");
//			quantidadeBebida = Main.sc.nextInt();
//
//			estoqueBebida = Main.estoqueBebida.get(selecaoBebida) - quantidadeBebida;
//
//			if (estoqueBebida < 0) {
//				System.out.println("\n=>Desculpe mas não há bebidas o bastante no estoque, retornando ao Menu<=\n");
//				return;
//			} else {
//				preco2 = preco2 + quantidadeBebida * Main.bebidas.get(selecaoBebida).getPrecoProduto();
//
//				Main.estoqueBebida.set(selecaoBebida, estoqueBebida);
//
//				System.out.println("Deseja cadastrar outra bebida na compra? 1-Sim/2-Não");
//				aux = Main.sc.nextInt();
//			}
//		} while (aux != 2);
//
//		Cliente clienteVenda = Main.clientes.get(selecaoCliente);
//
//		int idVenda = Main.vendas.get(i).getIdVenda();
//
//		Venda venda = new Venda(idVenda, clienteVenda, (preco1 + preco2), Main.pasteis.get(0), Main.bebidas.get(0));
//		Main.vendas.set(i, venda);
//	}
//
//	public static void deletarVenda() {
//		visualizarVendas();
//		System.out.println("Digite o número da venda desejado");
//		int i = Main.sc.nextInt();
//		Main.sc.nextLine();
//		Main.vendas.remove(i);
//		System.out.println("Venda totalmente removida\n");
//	}
	
	public String[] getClienteVenda() {
        String[] s = new String[this.c.size()];
        for(int i = 0; i < this.c.size(); i++) {
            s[i] = c.get(i).getClienteVenda().getNomeCliente();
        }
        return s;
    }
}
