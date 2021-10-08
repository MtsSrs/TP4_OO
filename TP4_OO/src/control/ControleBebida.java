package control;

import java.util.ArrayList;

import modelo.Bebida;

/**
 * Possui os métodos necessários para intermediar a classe Bebida entre modelo e view
 * @author Mateus Caltabiano e Matheus Soares
 * @version 1.0 (Out 2021)
 */
public class ControleBebida {
	private ArrayList<Bebida> c;
	
	/**
	 * Retira a ArrayList bebidas do banco de dados
	 * @param d dados do banco de dados
	 */
	 public ControleBebida(ControleDados d) {
	        c = d.getBebidas();
	    }
	 
	 /**
	  * Retira apenas os nomes das bebidas da ArrayList da classe Bebida
	  * @return string com os nomes das bebidas
	  */
	public String[] getNomeBebida() {
        String[] s = new String[this.c.size()];
        for(int i=0; i<this.c.size(); i++) {
            s[i] = c.get(i).getNomeProduto();
        }
        return s;
    }
}