package control;

import java.util.ArrayList;

import modelo.Cliente;

/**
 * Possui os métodos necessários para intermediar a classe Cliente entre modelo e view
 * @author Matheus Soares e Mateus Caltabiano
 * @version 1.0 (Out 2021)
 */
public class ControleCliente {
	
	private ArrayList<Cliente> c;

	/**
	 * Retira a ArrayList clientes do banco de dados
	 * @param d dados do banco de dados
	 */
	public ControleCliente(ControleDados d) {
		c = d.getClientes();
	}

	/**
	 * Retira apenas o nome dos clientes da ArrayList da classe Cliente
	 * @return string com os nomes dos clientes
	 */
	public String[] getNomeCliente() {
		String[] s = new String[this.c.size()];
		for(int i = 0; i < this.c.size(); i++) {
			s[i] = c.get(i).getNomeCliente();
		}
		return s;
	}
}