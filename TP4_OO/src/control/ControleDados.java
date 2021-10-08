package control;

import java.util.ArrayList;

import modelo.*;

/**
 * Possui os métodos necessários para interpretar os dados do banco de dados
 * @author Mateus Caltabiano e Matheus Soares
 * @version 1.0 (Out 2021)
 */
public class ControleDados {
	private Dados d = new Dados();

	/**
	 * Inicializa o banco de dados
	 */
	public ControleDados() {
		d.bancoDados();
	}
	
	public Dados getDados() {
		return d;
	}
	
	public void setDados(Dados d) {
		this.d = d;
	}

	/**
	 * Retira a ArrayList de clientes do banco de dados
	 * @return retorna a ArrayList de clientes
	 */
	public ArrayList<Cliente> getClientes() {
		return this.d.getClientes();
	}
	
	/**
	 * Retira a ArrayList de bebidas do banco de dados
	 * @return retorna a ArrayList de bebidas
	 */
	public ArrayList<Bebida> getBebidas() {
		return this.d.getBebidas();
	}

	/**
	 * Retira a ArrayList de pasteis do banco de dados
	 * @return retorna a ArrayList de pasteis
	 */
	public ArrayList<Pastel> getPasteis() {
		return this.d.getPasteis();
	}

	/**
	 * Retira a ArrayList de estabelecimentos do banco de dados
	 * @return retorna a ArrayList de estabelecimentos
	 */
	public ArrayList<Estabelecimento> getEstabelecimentos() {
		return this.d.getEstabelecimentos();
	}

	/**
	 * Retira a ArrayList de vendas do banco de dados
	 * @return retorna a ArrayList de vendas
	 */
	public ArrayList<Venda> getVendas() {
		return this.d.getVendas();
	}
}
