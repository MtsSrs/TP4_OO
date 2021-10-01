package control;

import java.util.ArrayList;

import modelo.Cliente;

public class ControleCliente {
	
	private ArrayList<Cliente> c;
	
	public ControleCliente(ControleDados d) {
		c = d.getClientes();
	}

	public String[] getNomeCliente() {
		String[] s = new String[this.c.size()];
		for(int i = 0; i < this.c.size(); i++) {
			s[i] = c.get(i).getNomeCliente();
		}
		return s;
	}
}