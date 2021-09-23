package modelo;

import test_application.Main;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static Telefone cadastrarTelefone(int i) {

        System.out.println("Digite o DDD do telefone - " + (i+1) + " - (apenas números): " );
        String ddd = Main.sc.nextLine();

        System.out.println("Digite o número do telefone " + (i+1) + " - (apenas números): " );
        String numero = Main.sc.nextLine();

        Telefone telefone = new Telefone(ddd, numero);

        return telefone;
    }

    @Override
    public String toString() {
        return ("(" + ddd + ") " + numero);
    }

}