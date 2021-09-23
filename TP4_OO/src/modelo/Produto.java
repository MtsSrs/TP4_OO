package modelo;

public abstract class Produto {
	protected String nomeProduto;
	protected float precoProduto;
	protected int idProduto;
	protected String descricaoProduto;
	protected String caloriaProduto;

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
