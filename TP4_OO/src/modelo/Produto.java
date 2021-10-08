package modelo;

/**
 * Contém os parâmetros para o objeto abstrato Produto
 * @author Mateus Caltabiano e Matheus Soares
 * @version 1.0 (Out 2021)
 */
public abstract class Produto {
	protected String nomeProduto;
	protected float precoProduto;
	protected int idProduto;
	protected String descricaoProduto;
	protected String caloriaProduto;

	/**
	 * Contstrutor do objeto abstrato Produto
	 * @param nomeProduto String para o nome do produto
	 * @param precoProduto float para o preço do produto
	 * @param idProduto int para o ID do produto
	 * @param descricaoProduto String para a descrição do produto
	 * @param caloriaProduto String para a quantidade de calorias do produto
	 */
	public Produto(String nomeProduto, float precoProduto, int idProduto, String descricaoProduto,
			String caloriaProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.idProduto = idProduto;
		this.descricaoProduto = descricaoProduto;
		this.caloriaProduto = caloriaProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public float getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getCaloriaProduto() {
		return caloriaProduto;
	}

	public void setCaloriaProduto(String caloriaProduto) {
		this.caloriaProduto = caloriaProduto;
	}

}
