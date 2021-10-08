package modelo;

/**
 * Contém os parâmetros para o objeto bebida
 * @author Matheus Soares e Mateus Caltabiano
 * @version 1.0 (Out 2021)
 */
public class Bebida extends Produto {
	private String tipoBebida;
	private String volumeBebida;
	private int qtdBebida;

	/**
	 * Construtor para instanciação do objeto Bebida
	 * @param nomeProduto String para o nome do produto
	 * @param precoProduto float para o preço do produto
	 * @param idProduto int para o ID do produto
	 * @param descricaoProduto String para a descrição do produto
	 * @param caloriaProduto String para a quantidade de calorias do produto
	 * @param tipoBebida String para o tipo da bebida
	 * @param volumeBebida String para o volume da bebida
	 * @param qtdBebida int para a quantidade da bebida
	 */
	public Bebida(String nomeProduto, float precoProduto, int idProduto, String descricaoProduto, String caloriaProduto,
			String tipoBebida, String volumeBebida, int qtdBebida) {
		super(nomeProduto, precoProduto, idProduto, descricaoProduto, caloriaProduto);
		this.tipoBebida = tipoBebida;
		this.volumeBebida = volumeBebida;
		this.qtdBebida = qtdBebida;
	}

	public String getTipoBebida() {
		return tipoBebida;
	}

	public void setTipoBebida(String tipoBebida) {
		this.tipoBebida = tipoBebida;
	}

	public String getVolumeBebida() {
		return volumeBebida;
	}

	public void setVolumeBebida(String volumeBebida) {
		this.volumeBebida = volumeBebida;
	}

	public int getQtdBebida() {
		return qtdBebida;
	}

	public void setQtdBebida(int qtdBebida) {
		this.qtdBebida = qtdBebida;
	}

	@Override
	public String toString() {
		return "\nNome = " + nomeProduto + "\nPreço = " + precoProduto + "\nID = " + +idProduto + "\nDescrição = "
				+ descricaoProduto + "\nCalorias = " + caloriaProduto + "\nTipo = " + tipoBebida + "\nVolume = "
				+ volumeBebida + "ml\n";
	}

}
