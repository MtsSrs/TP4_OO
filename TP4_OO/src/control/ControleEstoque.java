package control;

import test_application.Main;

public class ControleEstoque {
	public static void cadastrarEstoqueProduto() {
		System.out.println("\nDigite - 1 - para cadastrar pastéis \nDigite - 2 - para cadastrar bebidas\n");
		int num = Main.sc.nextInt();
		Main.sc.nextLine();
		if (num == 1) {
			System.out.println("Lista com nome e Id dos pastéis\n");
			ControlePastel.visualizarNomePastelId();

			System.out.println("\nDigite o número do item desejado para cadastrar uma nova\nquantidade");
			int idQuant = Main.sc.nextInt();
			Main.sc.nextLine();

			System.out.println("Digite quantas unidades serão adicionadas no estoque do\nitem: "
					+ Main.pasteis.get(idQuant).getNomeProduto());
			int estQuant = Main.sc.nextInt();
			Main.sc.nextLine();

			Main.estoque_pastel.set(idQuant, estQuant);

			System.out.println("Operação Concluída");
			return;
		}
		if (num == 2) {
			System.out.println("Lista com nome e Id das bebidas");
			ControleBebida.visualizarNomeBebidaId();

			System.out.println("\nDigite o número do item desejado para cadastrar uma nova\nquantidade");
			int idQuant = Main.sc.nextInt();
			Main.sc.nextLine();

			System.out.println("Digite quantas unidades serão adicionadas no estoque do\nitem: "
					+ Main.bebidas.get(idQuant).getNomeProduto());
			int estQuant = Main.sc.nextInt();
			Main.sc.nextLine();

			Main.estoque_bebida.set(idQuant, estQuant);

			System.out.println("Operação Concluída");
			return;
		} else {

			System.out.println("Erro");
			return;
		}
	}

	public static void visualizarEstoqueProduto() {
		System.out.println("\nDigite - 1 - para visualizar pastéis \nDigite - 2 - para visualizar bebidas\n");
		int num = Main.sc.nextInt();
		Main.sc.nextLine();
		if (num == 1) {
			for (int i = 0; i < Main.pasteis.size(); i++) {
				System.out.print(i + " - ");
				System.out.print(Main.pasteis.get(i).getNomeProduto());
				System.out.print(" - ");
				System.out.println(Main.estoque_pastel.get(i));
				System.out.println("___________________________________\n");

			}
			return;
		}
		if (num == 2) {
			for (int i = 0; i < Main.bebidas.size(); i++) {
				System.out.print(i + " - ");
				System.out.print(Main.bebidas.get(i).getNomeProduto());
				System.out.print(" - ");
				System.out.println(Main.estoque_bebida.get(i));
				System.out.println("___________________________________\n");
			}
			return;
		} else {
			System.out.println("Erro");
			return;
		}
	}

	public static void deletarEstoque() {
		System.out.println("\nDigite - 1 - para visualizar pastéis \nDigite - 2 - para visualizar bebidas\n");
		int num = Main.sc.nextInt();
		Main.sc.nextLine();
		if (num == 1) {
			for (int i = 0; i < Main.pasteis.size(); i++) {
				System.out.print(i + " - ");
				System.out.print(Main.pasteis.get(i).getNomeProduto());
				System.out.print(" - ");
				System.out.println(Main.estoque_pastel.get(i));
				System.out.println("___________________________________\n");
			}

			System.out.println("Digite o número do pastel desejado para zerar o estoque");
			int index = Main.sc.nextInt();
			Main.sc.nextLine();

			Main.estoque_pastel.set(index, 0);

			return;
		}
		if (num == 2) {
			for (int i = 0; i < Main.bebidas.size(); i++) {
				System.out.print(i + " - ");
				System.out.print(Main.bebidas.get(i).getNomeProduto());
				System.out.print(" - ");
				System.out.println(Main.estoque_bebida.get(i));
				System.out.println("___________________________________\n");
			}

			System.out.println("Digite o número da bebida desejada para zerar o estoque");
			int index = Main.sc.nextInt();
			Main.sc.nextLine();

			Main.estoque_bebida.set(index, 0);

			return;
		} else {
			System.out.println("Erro");
			return;
		}

	}
	
	public static void filtrarEstoque() {
		System.out.println("\nDigite - 1 - para visualizar pastéis \nDigite - 2 - para visualizar bebidas\n");
		int num = Main.sc.nextInt();
		Main.sc.nextLine();
		if (num == 1) {
			for (int i = 0; i < Main.pasteis.size(); i++) {
				System.out.print(i + " - ");
				System.out.print(Main.pasteis.get(i).getNomeProduto());
				System.out.print(" - ");
				System.out.println(Main.estoque_pastel.get(i));
				System.out.println("___________________________________\n");

			}
			return;
		}
		if (num == 2) {
			for (int i = 0; i < Main.bebidas.size(); i++) {
				System.out.print(i + " - ");
				System.out.print(Main.bebidas.get(i).getNomeProduto());
				System.out.print(" - ");
				System.out.println(Main.estoque_bebida.get(i));
				System.out.println("___________________________________\n");
			}
			return;
		} else {
			System.out.println("Erro");
			return;
		}
		
	}
}
