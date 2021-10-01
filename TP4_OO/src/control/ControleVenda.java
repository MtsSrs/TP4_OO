package control;

import java.util.ArrayList;

import modelo.Venda;

public class ControleVenda {
	private ArrayList<Venda> c;

    public ControleVenda(ControleDados d) {
        c = d.getVendas();
    }
	
	public String[] getClienteVenda() {
        String[] s = new String[this.c.size()];
        for(int i = 0; i < this.c.size(); i++) {
            s[i] = c.get(i).getClienteVenda().getNomeCliente();
        }
        return s;
    }
}
