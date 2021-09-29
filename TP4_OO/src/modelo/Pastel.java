package modelo;


public class Pastel extends Produto {
	private String saborPastel;
	private String comprimentoPastel;
	private int qtdPastel;

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