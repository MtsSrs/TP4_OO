package control;

import java.util.ArrayList;

import modelo.Pastel;
//import test_application.Main;

public class ControlePastel {
	private ArrayList<Pastel> c;

	public ControlePastel(ControleDados d) {
		c = d.getPasteis();
	}

	public String[] getNomePastel() {
		String[] s = new String[this.c.size()];
		for (int i = 0; i < this.c.size(); i++) {
			s[i] = c.get(i).getNomeProduto();
		}
		return s;
	}

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
