package control;

import java.util.ArrayList;

import modelo.Pastel;

/**
 * Possui os métodos necessários para intermediar a classe Venda entre modelo e view
 * @author Matheus Soares e Mateus Caltabiano
 * @version 1.0 (2021)
 */
public class ControlePastel {
	private ArrayList<Pastel> c;

	/**
	 * Retira a ArrayList pasteis do banco de dados
	 * @param d dados do banco de dados
	 */
	public ControlePastel(ControleDados d) {
		c = d.getPasteis();
	}

	/**
	 * Retira apenas os nomes dos pasteis da ArrayList da classe Pastel
	 * @return string com os nomes dos pastéis
	 */
	public String[] getNomePastel() {
		String[] s = new String[this.c.size()];
		for (int i = 0; i < this.c.size(); i++) {
			s[i] = c.get(i).getNomeProduto();
		}
		return s;
	}

	/**
	 * Retira apenas os pastéis de sabor Salgado da ArrayList da classe Pastel
	 * @return string com os pastéis de sabor Salgado
	 */
	public String[] getSaborPastelSalgado() {
		ArrayList<String> pastelList = new ArrayList<String>();
		String[] f = new String[pastelList.size()];
		String sabor = "salgado";
		int j = 0;
		try {
			for (int i = 0; i < this.c.size(); i++) {
				if (c.get(i).getSaborPastel().toUpperCase().equals(sabor.toUpperCase())) {
						pastelList.add(c.get(i).getNomeProduto()); 	
					}	
			}
			f = new String[pastelList.size()];
			for(int i = 0; i < pastelList.size(); i++) {
				f[j] = pastelList.get(i);
				j++;
			}
		} catch (Exception e) {
		}
		return f;
	}

	/**
	 * Retira apenas os pastéis de sabor Doce da ArrayList da classe Pastel
	 * @return string com os pastéis de sabor Doce
	 */
	public String[] getSaborPastelDoce() {
		ArrayList<String> pastelList = new ArrayList<String>();
		String[] f = new String[pastelList.size()];
		String sabor = "doce";
		int j = 0;
		try {
			for (int i = 0; i < this.c.size(); i++) {
				if (c.get(i).getSaborPastel().toUpperCase().equals(sabor.toUpperCase())) {
						pastelList.add(c.get(i).getNomeProduto()); 	
					}	
			}
			f = new String[pastelList.size()];
			for(int i = 0; i < pastelList.size(); i++) {
				f[j] = pastelList.get(i);
				j++;
			}
		} catch (Exception e) {
		}
		return f;
	}
}
