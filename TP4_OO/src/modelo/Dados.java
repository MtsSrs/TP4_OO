package modelo;

import java.util.ArrayList;

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
public void bancoDados() {

    Cliente Mateus = new Cliente("Mateus", "Brasília", "11111111111", new Telefone("61", "123456789"));
    Cliente Matheus = new Cliente("Matheus", "Valparaíso", "22222222222", new Telefone("61", "987654321"));

    Pastel Queijo = new Pastel("Pastel de queijo pequeno", (float) 13.99, 1, "Pastel recheado com queijo", "215",
            "Salgado", "10", 40);
    Pastel Carne = new Pastel("Pastel de carne pequeno", (float) 13.99, 2, "Pastel recheado com carne", "149",
            "Salgado", "10", 50);
    Pastel Chocolate = new Pastel("Pastel de chocolate médio", (float) 15.99, 3, "Pastel recheado com chocolate", "250",
            "Doce", "15", 60);
    
    bebidas.add(new Bebida("Água", (float) 4.99, 1, "Uma garrafa de água", "0", "Água", "500", 10));
	bebidas.add(new Bebida("Coca-cola", (float) 7.99, 2, "Uma lata de Coca-cola", "85", "Refrigerante", "300", 20));
	bebidas.add(new Bebida("Coca-cola light", (float) 7.99, 3, "Uma lata de Coca-cola light", "2", "Refrigerante",
			"300", 30));

    Estabelecimento Brasilia = new Estabelecimento("Brasília", "11111111", new Telefone("61", "111112222"));
    Estabelecimento Valparaiso = new Estabelecimento("Valparaíso", "22222222", new Telefone("61", "222221111"));

    this.getClientes().add(Mateus);
    this.getClientes().add(Matheus);
   
    this.getPasteis().add(Queijo);
    this.getPasteis().add(Carne);
    this.getPasteis().add(Chocolate);
    
    Venda Venda1 = new Venda(0, clientes.get(0), (float) 18.98, pasteis.get(0), bebidas.get(0));
    Venda Venda2 = new Venda(1, clientes.get(1), (float) 21.98, pasteis.get(1), bebidas.get(1));
    
    this.getEstabelecimentos().add(Brasilia);
    this.getEstabelecimentos().add(Valparaiso);
    
    this.getVendas().add(Venda1);
    this.getVendas().add(Venda2);

    }


}