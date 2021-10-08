package modelo;

/**
 * Contém os parâmetros para o objeto Estoque
 * @author Mateus Caltabiano e Matheus Soares
 * @version 1.0 (Out 2021)
 */
public class Estoque {

	private Produto produto[];
	private int quantidade;

	/**
	 * Construtor para instanciação do objeto Estoque
	 * @param produto Produto para o produto do estoque
	 * @param quantidade int para a quantidade do produto em estoque 
	 */
	public Estoque(Produto[] produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}


	public Produto[] getProduto() {
		return produto;
	}

	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
