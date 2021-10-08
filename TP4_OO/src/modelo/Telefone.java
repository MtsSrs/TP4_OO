package modelo;

/**
 * Contém os parâmetros para o objeto Telefone
 * @author Mateus Caltabiano e Matheus Soares
 * @version 1.0 (Out 2021)
 */
public class Telefone {

    private String ddd;
    private String numero;

    /**
	 * Contstrutor para instanciação do objeto Telefone
     * @param ddd String para o DDD do telefone
     * @param numero String para o número do telefone
     */
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

    @Override
    public String toString() {
        return ("(" + ddd + ") " + numero);
    }

}