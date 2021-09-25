package modelo;

import java.util.ArrayList;

public class Dados {
    public ArrayList<Cliente> clientes = new ArrayList<>();
    public ArrayList<Bebida> bebidas = new ArrayList<>();
    public ArrayList<Pastel> pasteis = new ArrayList<>();
    public ArrayList<Integer> estoque_pastel = new ArrayList<>();
    public ArrayList<Integer> estoque_bebida = new ArrayList<>();
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
    public ArrayList<Integer> getEstoque_pastel() {
        return estoque_pastel;
    }
    public void setEstoque_pastel(ArrayList<Integer> estoque_pastel) {
        this.estoque_pastel = estoque_pastel;
    }
    public ArrayList<Integer> getEstoque_bebida() {
        return estoque_bebida;
    }
    public void setEstoque_bebida(ArrayList<Integer> estoque_bebida) {
        this.estoque_bebida = estoque_bebida;
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
            "Salgado", "10");
    Pastel Carne = new Pastel("Pastel de carne pequeno", (float) 13.99, 2, "Pastel recheado com carne", "149",
            "Salgado", "10");
    Pastel Chocolate = new Pastel("Pastel de chocolate médio", (float) 15.99, 3, "Pastel recheado com carne", "250",
            "Doce", "15");

    Estabelecimento Brasilia = new Estabelecimento("Brasília", "11111111", new Telefone("61", "111112222"));
    Estabelecimento Valparaiso = new Estabelecimento("Valparaíso", "22222222", new Telefone("61", "222221111"));

    this.getClientes().add(Mateus);
    this.getClientes().add(Matheus);
   
    
    Venda Venda1 = new Venda(1, clientes.get(0), (float) 13.44);
    Venda Venda2 = new Venda(2, clientes.get(1), (float) 44.13);
    
    
    this.getPasteis().add(Queijo);
    this.getPasteis().add(Carne);
    this.getPasteis().add(Chocolate);
    
    this.getEstabelecimentos().add(Brasilia);
    this.getEstabelecimentos().add(Valparaiso);
    
    this.getVendas().add(Venda1);
    this.getVendas().add(Venda2);

    this.getEstoque_pastel().add(10);
    this.getEstoque_pastel().add(20);
    this.getEstoque_pastel().add(30);
    this.getEstoque_bebida().add(40);
    this.getEstoque_bebida().add(50);
    this.getEstoque_bebida().add(60);

    }


}