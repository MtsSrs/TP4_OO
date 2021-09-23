package control;

import java.util.ArrayList;

import modelo.Estabelecimento;
import modelo.Telefone;
import test_application.Main;

public class ControleEstabelecimento {
	public static void cadastrarEstabelecimento() {

		System.out.println("Digite o número de estabelecimentos que serão cadastrados");
		int size = Main.sc.nextInt();
		Main.sc.nextLine();
		for (int i = 0; i < size; i++) {
			System.out.println("Digite o endereço do estabelecimento " + (i + 1));
			String enderecoEstabelecimento = Main.sc.nextLine();

			System.out.println("Digite o CEP do estabelecimento " + (i + 1));
			String cepEstabelecimento = Main.sc.nextLine();

			Telefone telefoneEstabelecimento = Telefone.cadastrarTelefone(i);

			Estabelecimento estabelecimento = new Estabelecimento(enderecoEstabelecimento, cepEstabelecimento,
					telefoneEstabelecimento);
			Main.estabelecimentos.add(estabelecimento);
		}
		System.out.println("Operação Concluida...Aguarde");
	}

	public static void visualizarEstabelecimentos() {
		for (int i = 0; i < Main.estabelecimentos.size(); i++) {
			System.out.print("\nID Estabelecimento - " + i + "\n");
			System.out.println(Main.estabelecimentos.get(i));
			System.out.println("__________________________________________");
		}
	}

	public static void editarEstabelecimento(ArrayList<Estabelecimento> estabelecimentos) {
		System.out.println("Digite o número do estabelecimento desejado");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();
		while (i > estabelecimentos.size()) {
			System.out.println("Não temos tantos estabelecimentos(ainda)\nDigite um novo número");
			i = Main.sc.nextInt();
			Main.sc.nextLine();
		}
		System.out.println("Digite o nome do estabelecimento:");
		String nomeEstabelecimento = Main.sc.nextLine();

		System.out.println("Digite o endereco do cliente:");
		String enderecoEstabelecimento = Main.sc.nextLine();

		Telefone telefoneEstabelecimento = Telefone.cadastrarTelefone(i);

		Estabelecimento estabelecimento = new Estabelecimento(nomeEstabelecimento, enderecoEstabelecimento,
				telefoneEstabelecimento);
		estabelecimentos.set(i, estabelecimento);
		System.out.println("Estabelecimento editado\n");
	}

	public static void deletarEstabelecimento(ArrayList<Estabelecimento> estabelecimentos) {
		System.out.println("Digite o número do estabelecimento desejado");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();
		estabelecimentos.remove(i);
		System.out.println("Estabelecimento totalmente removido\n");
	}
}
