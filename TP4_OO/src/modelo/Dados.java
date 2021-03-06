package modelo;

import java.util.ArrayList;

/**
 * Possui o banco de dados e os m?todos para retirar os dados
 * @author Mateus Caltabiano e Matheus Soares
 * @version 1.0 (Out 2021)
 */
public class Dados {
    public ArrayList<Cliente> clientes = new ArrayList<>();
    public ArrayList<Bebida> bebidas = new ArrayList<>();
    public ArrayList<Pastel> pasteis = new ArrayList<>();
    public ArrayList<Estabelecimento> estabelecimentos = new ArrayList<>();
    public ArrayList<Venda> vendas = new ArrayList<>();


    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }
    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }
    public ArrayList<Pastel> getPasteis() {
        return pasteis;
    }
    public void setPasteis(ArrayList<Pastel> pasteis) {
        this.pasteis = pasteis;
    }
    public ArrayList<Estabelecimento> getEstabelecimentos() {
        return estabelecimentos;
    }
    public void setEstabelecimentos(ArrayList<Estabelecimento> estabelecimentos) {
        this.estabelecimentos = estabelecimentos;
    }
    public ArrayList<Venda> getVendas() {
        return vendas;
    }
    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    /**
     * Cont?m os dados pr?-registrados para proporcionar um melhor teste do programa
     */
public void bancoDados() {

    Cliente mateus = new Cliente("Mateus", "Bras?lia", "12358479651", new Telefone("61", "123456789"));
    Cliente matheus = new Cliente("Matheus", "Valpara?so", "74589652147", new Telefone("61", "987654321"));
    Cliente mariana = new Cliente("Mariana", "Asa norte", "10287496321", new Telefone("38", "956555444"));
    Cliente alcina = new Cliente("Alcina", "C?u Azul", "01284579541", new Telefone("61", "5486231974"));
    Cliente mauro = new Cliente("Mauro", "Lago Sul", "45126874562", new Telefone("61", "246781320"));

    Pastel queijo = new Pastel("Pastel de queijo pequeno", (float) 13.99, 1, "Pastel recheado com queijo", "215",
            "Salgado", "10", 40);
    Pastel carne = new Pastel("Pastel de carne pequeno", (float) 13.99, 2, "Pastel recheado com carne", "149",
            "Salgado", "10", 50);
    Pastel chocolate = new Pastel("Pastel de chocolate m?dio", (float) 15.99, 3, "Pastel recheado com chocolate", "250",
            "Doce", "15", 60);
    Pastel romeuEjulieta = new Pastel("Pastel Romeu & Julietta m?dio", (float) 21.99, 4, "Pastel recheado com queijo e goiabada", "255",
            "Doce", "15", 70);
    Pastel portuguesa = new Pastel("Pastel Portuguesa grande", (float) 25.99, 5, "Pastel recheado com presunto, queijo, ovo, ervilha e cebola", "436",
            "Salgado", "20", 80);
    
    bebidas.add(new Bebida("?gua", (float) 4.99, 1, "Uma garrafa de ?gua", "0", "?gua", "500", 10));
	bebidas.add(new Bebida("Coca-cola", (float) 7.99, 2, "Uma lata de Coca-cola", "85", "Refrigerante", "300", 20));
	bebidas.add(new Bebida("Coca-cola light", (float) 7.99, 3, "Uma lata de Coca-cola light", "2", "Refrigerante",
			"300", 30));
	bebidas.add(new Bebida("Iced Tea de P?ssego", (float) 9.99, 4, "Um copo de ch? gelado sabor P?ssego", "58", "Ch? Gelado",
			"250", 40));
	bebidas.add(new Bebida("Caldo de cana", (float) 4.99, 5, "Um copo de caldo de cana", "269", "Suco",
			"300", 50));
	

    Estabelecimento brasilia = new Estabelecimento("Bras?lia", "11111111", new Telefone("61", "111112222"));
    Estabelecimento valparaiso = new Estabelecimento("Valpara?so", "22222222", new Telefone("61", "222221111"));
    Estabelecimento goi?nia = new Estabelecimento("Goi?nia", "33333333", new Telefone("62", "333331456"));
    Estabelecimento pirenopolis = new Estabelecimento("Piren?polis", "44444444", new Telefone("62", "365471249"));
    Estabelecimento gama = new Estabelecimento("Gama", "55555555", new Telefone("61", "365451574"));
    
    this.getClientes().add(mateus);
    this.getClientes().add(matheus);
    this.getClientes().add(mariana);
    this.getClientes().add(alcina);
    this.getClientes().add(mauro);
    
    this.getPasteis().add(queijo);
    this.getPasteis().add(carne);
    this.getPasteis().add(chocolate);
    this.getPasteis().add(romeuEjulieta);
    this.getPasteis().add(portuguesa);
    
    Venda venda1 = new Venda(0, clientes.get(0), (float) 18.98, pasteis.get(0), bebidas.get(0));
    Venda venda2 = new Venda(1, clientes.get(1), (float) 21.98, pasteis.get(1), bebidas.get(1));
    Venda venda3 = new Venda(2, clientes.get(2), (float) 23.98, pasteis.get(2), bebidas.get(2));
    Venda venda4 = new Venda(3, clientes.get(3), (float) 31.98, pasteis.get(3), bebidas.get(3));
    Venda venda5 = new Venda(4, clientes.get(4), (float) 30.98, pasteis.get(4), bebidas.get(4));
    
    this.getEstabelecimentos().add(brasilia);
    this.getEstabelecimentos().add(valparaiso);
    this.getEstabelecimentos().add(goi?nia);
    this.getEstabelecimentos().add(pirenopolis);
    this.getEstabelecimentos().add(gama);
    
    this.getVendas().add(venda1);
    this.getVendas().add(venda2);
    this.getVendas().add(venda3);
    this.getVendas().add(venda4);
    this.getVendas().add(venda5);

    }


}