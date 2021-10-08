package control;

import java.util.ArrayList;

import modelo.Venda;

/**
 * Possui os métodos necessários para intermediar a classe Venda entre modelo e view
 * @author Matheus Soares e Mateus Caltabiano
 * @version Version 1.0 (Out 2021)
 */
public class ControleVenda {
	private ArrayList<Venda> c;

	/**
	 * Retira a ArrayList vendas do banco de dados
	 * @param d dados do banco de dados
	 */
    public ControleVenda(ControleDados d) {
        c = d.getVendas();
    }

    /**
	 * Retira apenas os clientes das vendas da ArrayList da classe Vendas
     * @return
     */
	public String[] getClienteVenda() {
        String[] s = new String[this.c.size()];
        for(int i = 0; i < this.c.size(); i++) {
            s[i] = c.get(i).getClienteVenda().getNomeCliente();
        }
        return s;
    }
}
