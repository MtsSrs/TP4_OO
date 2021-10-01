package control;

import java.util.ArrayList;

import modelo.Estabelecimento;

public class ControleEstabelecimento {
	private ArrayList<Estabelecimento> c;

    public ControleEstabelecimento(ControleDados d) {
        c = d.getEstabelecimentos();
    }
	
	public String[] getEnderecoEstabelecimento() {
        String[] s = new String[this.c.size()];
        for(int i = 0; i < this.c.size(); i++) {
            s[i] = c.get(i).getEnderecoEstbelecimento();
        }
        return s;
    }
}