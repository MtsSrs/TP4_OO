package control;

import java.util.ArrayList;

import modelo.Pastel;
import test_application.Main;

public class ControlePastel {
	public static void cadastrarPastel() {
		System.out.println("Digite o n�mero de pasteis que ser�o cadastrados");
		int size = Main.sc.nextInt();
		Main.sc.nextLine();
		for (int i = 0; i < size; i++) {
			System.out.println("Digite o nome do Pastel " + (i + 1));
			String nomeProduto = Main.sc.nextLine();

			System.out.println("Digite o Pre�o do pastel " + (i + 1));
			float precoProduto = Main.sc.nextFloat();
			Main.sc.nextLine();

			System.out.println("Digite o id do pastel " + (i + 1));
			int idProduto = Main.sc.nextInt();
			Main.sc.nextLine();

			System.out.println("Digite a descri��o do pastel " + (i + 1));
			String descricaoProduto = Main.sc.nextLine();

			System.out.println("Digite a caloria do pastel " + (i + 1));
			String caloriaProduto = Main.sc.nextLine();

			System.out.println("Digite o sabor do pastel (Doce ou Salgado) " + (i + 1));
			String saborPastel = Main.sc.nextLine();

			System.out.println("Digite o comprimento do pastel " + (i + 1));
			String comprimentoPastel = Main.sc.nextLine();

			System.out.println("Digite a quantidade em estoque do pastel " + (i + 1));
			int estoquePastel = Main.sc.nextInt();
			Main.sc.nextLine();

			Pastel pasteis = new Pastel(nomeProduto, precoProduto, idProduto, descricaoProduto, caloriaProduto,
					saborPastel, comprimentoPastel);
			Main.estoque_pastel.add(estoquePastel);
			Main.pasteis.add(pasteis);

		}
		System.out.println("Pastel Cadastrado... Aguarde");
	}

	public static void visualizarPastel() {
		for (int i = 0; i < Main.pasteis.size(); i++) {
			System.out.print("Pastel - " + i + "\n");
			System.out.println(Main.pasteis.get(i));
			System.out.println("___________________________________\n");
		}
	}

	public static void editarPastel(ArrayList<Pastel> pasteis) {

		System.out.println("Digite o n�mero do pastel desejado");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();
		while (i > pasteis.size()) {
			System.out.println("N�o temos tantos past�is(ainda)\nDigite um novo n�mero");
			i = Main.sc.nextInt();
			Main.sc.nextLine();
		}

		System.out.println("Digite o nome do Pastel");
		String nomeProduto = Main.sc.nextLine();

		System.out.println("Digite o Pre�o do pastel");
		float precoProduto = Main.sc.nextFloat();
		Main.sc.nextLine();

		System.out.println("Digite o id do pastel");
		int idProduto = Main.sc.nextInt();
		Main.sc.nextLine();

		System.out.println("Digite a descri��o do pastel");
		String descricaoProduto = Main.sc.nextLine();

		System.out.println("Digite a caloria do pastel");
		String caloriaProduto = Main.sc.nextLine();

		System.out.println("Digite o sabor do pastel (Doce ou Salgaodo)");
		String saborPastel = Main.sc.nextLine();

		System.out.println("Digite o comprimento do pastel");
		String comprimentoPastel = Main.sc.nextLine();

		System.out.println("Digite a quantidade em estoque do pastel");
		int estoquePastel = Main.sc.nextInt();
		Main.sc.nextLine();

		Pastel pastel = new Pastel(nomeProduto, precoProduto, idProduto, descricaoProduto, caloriaProduto, saborPastel,
				comprimentoPastel);
		pasteis.set(i, pastel);
		Main.estoque_pastel.set(i, estoquePastel);
		System.out.println("Pastel editado\n");

	}

	public static void visualizarNomePastelId() {
		for (int i = 0; i < Main.pasteis.size(); i++) {
			System.out.print(i + " - ");
			System.out.println(Main.pasteis.get(i).getNomeProduto());
			System.out.println("___________________________________\n");
		}
	}

	public static void deletarPastel(ArrayList<Pastel> pasteis) {
		System.out.println("Digite o n�mero do pastel desejado");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();

		pasteis.remove(i);
		Main.estoque_pastel.remove(i);
		System.out.println("Pastel totalmente removido\n");
	}

	public static void filtrarPastel(ArrayList<Pastel> pasteis) {
		System.out.println("\nDigite o sabor (Salgado ou Doce)");
		String nome = Main.sc.nextLine();
		try {
			for (Pastel p : pasteis) {
				if (p.getSaborPastel().toUpperCase().equals(nome.toUpperCase())) {
					System.out.println("_________________________________________");
					System.out.println(p);
					System.out.println("_________________________________________");
				}
			}
		} catch (Exception e) {
			System.out.println("Sabor n�o encontrado");
		}
		return;
	}
}
