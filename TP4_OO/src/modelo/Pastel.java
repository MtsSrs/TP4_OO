package modelo;

/**
 * Contém os parâmetros para o objeto Pastel
 * @author Matheus Soares e Mateus Caltabiano
 * @version 1.0 (Out 2021)
 */
public class Pastel extends Produto {
	private String saborPastel;
	private String comprimentoPastel;
	private int qtdPastel;

	/**
	 * Contstrutor para instanciação do objeto Pastel
	 * @param nomeProduto String para nome do produto
	 * @param precoProduto float para o preço do produto
	 * @param idProduto int para o ID do produto
	 * @param descricaoProduto String para a descrição do produto
	 * @param caloriaProduto String para a quantidade de calorias do produto
	 * @param saborPastel String para o sabor do Pastel
	 * @param comprimentoPastel String para o comprimento do pastel
	 * @param qtdPastel int para a quantidade de pastel
	 */
	public Pastel(String nomeProduto, float precoProduto, int idProduto, String descricaoProduto, String caloriaProduto,
			String saborPastel, String comprimentoPastel, int qtdPastel) {
		super(nomeProduto, precoProduto, idProduto, descricaoProduto, caloriaProduto);
		this.saborPastel = saborPastel;
		this.comprimentoPastel = comprimentoPastel;
		this.qtdPastel = qtdPastel;
	}

	public String getSaborPastel() {
		return saborPastel;
	}

	public void setSaborPastel(String saborPastel) {
		this.saborPastel = saborPastel;
	}

	public String getComprimentoPastel() {
		return comprimentoPastel;
	}

	public void setComprimentoPastel(String comprimentoPastel) {
		this.comprimentoPastel = comprimentoPastel;
	}

	public int getQtdPastel() {
		return qtdPastel;
	}



	public void setQtdPastel(int qtdPastel) {
		this.qtdPastel = qtdPastel;
	}

	@Override
	public String toString() {
		return "\nSabor do pastel = " + saborPastel + "\nComprimento do pastel = " + comprimentoPastel
				+ " cm\nNome do produto = " + nomeProduto + "\nPreço do produto = R$ " + precoProduto
				+ "\nID do produto = " + idProduto + "\nDescrição do produto = " + descricaoProduto
				+ "\nValor calórico = " + caloriaProduto + " kcal\n";
	}

}