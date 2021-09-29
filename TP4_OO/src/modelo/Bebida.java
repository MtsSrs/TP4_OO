package modelo;

public class Bebida extends Produto {
	private String tipoBebida;
	private String volumeBebida;
	private int qtdBebida;

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
