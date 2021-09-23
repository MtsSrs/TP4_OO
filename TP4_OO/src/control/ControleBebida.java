package control;

import java.util.ArrayList;

import modelo.Bebida;
import test_application.Main;

public class ControleBebida {
	public static void cadastrarBebida() {
		System.out.println("Digite o número de bebidas que serão cadastadas");
		int size = Main.sc.nextInt();
		Main.sc.nextLine();
		for (int i = 0; i < size; i++) {
			System.out.println("Digite o nome da bebida " + (i + 1));
			String nomeProduto = Main.sc.nextLine();

			System.out.println("Digite o preço da bebida " + (i + 1));
			float precoProduto = Main.sc.nextFloat();

			System.out.println("Digite o ID da bebida " + (i + 1));
			int idProduto = Main.sc.nextInt();
			Main.sc.nextLine();

			System.out.println("Digite a descrição da bebida " + (i + 1));
			String descricaoProduto = Main.sc.nextLine();

			System.out.println("Digite as calorias da bebida " + (i + 1));
			String caloriaProduto = Main.sc.nextLine();

			System.out.println("Digite o tipo da bebida " + (i + 1));
			String tipoBebida = Main.sc.nextLine();

			System.out.println("Digite o volume da bebida " + (i + 1));
			String volumeBebida = Main.sc.nextLine();

			System.out.println("Digite a quantidade em estoque da bebida " + (i + 1));
			int estoqueBebida = Main.sc.nextInt();
			Main.sc.nextLine();

			Bebida bebida = new Bebida(nomeProduto, precoProduto, idProduto, descricaoProduto, caloriaProduto,
					tipoBebida, volumeBebida);
			Main.estoque_bebida.add(estoqueBebida);
			Main.bebidas.add(bebida);

		}
		System.out.println("Bebida Cadastrada.... Retornando");
	}

	public static void visualizarBebidas() {
		for (int i = 0; i < Main.bebidas.size(); i++) {
			System.out.print("\nBebida - " + i + "\n");
			System.out.println(Main.bebidas.get(i));
			System.out.println("__________________________________________");
		}
	}

	public static void visualizarNomeBebidaId() {
		for (int i = 0; i < Main.bebidas.size(); i++) {
			System.out.print("\nBebida - " + i + "\n");
			System.out.println(Main.bebidas.get(i).getNomeProduto());
			System.out.println("__________________________________________");
		}
	}

	public static void editarBebida(ArrayList<Bebida> bebidas) {
		System.out.println("Digite o número da bebida desejada");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();
		while (i > bebidas.size()) {
			System.out.println("Não temos tantas bebidas(ainda)\nDigite um novo número");
			i = Main.sc.nextInt();
			Main.sc.nextLine();
		}

		System.out.println("Digite o nome da bebida");
		String nomeProduto = Main.sc.nextLine();

		System.out.println("Digite o preço da bebida");
		float precoProduto = Main.sc.nextFloat();

		System.out.println("Digite o ID da bebida");
		int idProduto = Main.sc.nextInt();
		Main.sc.nextLine();

		System.out.println("Digite a descrição da bebida");
		String descricaoProduto = Main.sc.nextLine();

		System.out.println("Digite as calorias da bebida");
		String caloriaProduto = Main.sc.nextLine();

		System.out.println("Digite o tipo da bebida");
		String tipoBebida = Main.sc.nextLine();

		System.out.println("Digite o volume da bebida");
		String volumeBebida = Main.sc.nextLine();

		System.out.println("Digite a quantidade em estoque da bebida");
		int estoqueBebida = Main.sc.nextInt();
		Main.sc.nextLine();

		Bebida bebida = new Bebida(nomeProduto, precoProduto, idProduto, descricaoProduto, caloriaProduto, tipoBebida,
				volumeBebida);

		bebidas.set(i, bebida);
		Main.estoque_bebida.set(i, estoqueBebida);
		System.out.println("Bebida editada\n");
	}

	public static void deletarBebida(ArrayList<Bebida> bebidas) {
		System.out.println("Digite o número da bebida desejada");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();

		bebidas.remove(i);
		Main.estoque_bebida.remove(i);
		System.out.println("Bebida totalmente removida\n");
	}
}
