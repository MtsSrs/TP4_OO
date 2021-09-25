package control;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.Telefone;
import test_application.Main;
import view.TelaMenu;
import modelo.Dados;

public class ControleCliente {
	
	private ArrayList<Cliente> c;
	
	public ControleCliente(ControleDados d) {
		c = d.getClientes();
	}
	
	
	public static void cadastrarCliente() {

		System.out.println("\nDigite o número de clientes que serão cadastrados: ");
		int size = Main.sc.nextInt();
		Main.sc.nextLine();

		for (int i = 0; i < size; i++) {
			System.out.println("Digite o nome do cliente " + (i + 1));
			String nomeCliente = Main.sc.nextLine();

			System.out.println("Digite o endereco do cliente: " + (i + 1));
			String enderecoCliente = Main.sc.nextLine();

			System.out.println("Digite o CPF do cliente: " + (i + 1));
			String cpfCliente = Main.sc.nextLine();

			Telefone telefoneCliente = Telefone.cadastrarTelefone(i);

			Cliente cliente = new Cliente(nomeCliente, enderecoCliente, cpfCliente, telefoneCliente);
			Main.clientes.add(cliente);

		}
		System.out.println("Operação Concluida... Retornando ao menu... Aguarde");
	}

	public static void visualizarClientes() {
		for (int i = 0; i < Main.clientes.size(); i++) {
			System.out.print("\nID Cliente - " + i + "\n");
			System.out.println(Main.clientes.get(i));
			System.out.println("__________________________________________");
		}
	}

	public static void editarCliente(ArrayList<Cliente> clientes) {

		System.out.println("Digite o número do cliente desejado");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();
		while (i > clientes.size()) {
			System.out.println("Não temos tantos clientes(ainda)\nDigite um novo número");
			i = Main.sc.nextInt();
			Main.sc.nextLine();
		}

		System.out.println("Digite o novo nome do cliente:");
		String nomeCliente = Main.sc.nextLine();

		System.out.println("Digite o  novo endereco do cliente:");
		String enderecoCliente = Main.sc.nextLine();

		System.out.println("Digite o novo CPF do cliente:");
		String cpfCliente = Main.sc.nextLine();

		Telefone telefoneCliente = Telefone.cadastrarTelefone(i);

		Cliente cliente = new Cliente(nomeCliente, enderecoCliente, cpfCliente, telefoneCliente);
		clientes.set(i, cliente);
		System.out.println("\nCliente editado\n");
	}

	public static void visualizarNomeCliente() {
		for (int i = 0; i < Main.clientes.size(); i++) {
			System.out.print(i + " - ");
			System.out.println(Main.clientes.get(i).getNomeCliente());
			System.out.println("___");
		}
	}

	public static void deletarCliente(ArrayList<Cliente> clientes) {

		System.out.println("\nDigite o número do cliente desejado");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();

		clientes.remove(i);
		System.out.println("\nCliente totalmente removido\n");

	}
	
	public String[] getNomeCliente() {
		String[] s = new String[this.c.size()];
		for(int i=0; i<this.c.size(); i++) {
			s[i] = c.get(i).getNomeCliente();
		}
		return s;
	}
	
	
}
