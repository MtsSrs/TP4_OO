package control;

import java.util.ArrayList;

import modelo.Estabelecimento;

/**
 * Possui os métodos necessários para intermediar a classe Estabelecimento entre modelo e view
 * @author Mateus Caltabiano e Matheus Soares
 * @version 1.0 (Out 2021)
 */
public class ControleEstabelecimento {
	private ArrayList<Estabelecimento> c;

	/**
	 * Retira a ArrayList estabelecimentos do banco de dados
	 * @param d dados do banco de dados
	 */
    public ControleEstabelecimento(ControleDados d) {
        c = d.getEstabelecimentos();
    }

    /**
	 * Retira apenas os endereços do estabelecimentos da ArrayList da classe Estabelecimento
	 * @return string com os endereços dos estabelecimentos
     */
	public String[] getEnderecoEstabelecimento() {
        String[] s = new String[this.c.size()];
        for(int i = 0; i < this.c.size(); i++) {
            s[i] = c.get(i).getEnderecoEstbelecimento();
        }
        return s;
    }
}