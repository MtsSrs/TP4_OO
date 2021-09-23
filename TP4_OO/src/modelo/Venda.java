package modelo;


public class Venda {

	private int idVenda = 0;
	private Cliente clienteVenda;
	private Estoque estoqueVenda;
	private float precoVenda;

	public Venda(int idVenda, Cliente clienteVenda, float precoVenda) {
		this.idVenda = idVenda;
		this.clienteVenda = clienteVenda;
		this.precoVenda = precoVenda;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public Cliente getClienteVenda() {
		return clienteVenda;
	}

	public void setClienteVenda(Cliente clienteVenda) {
		this.clienteVenda = clienteVenda;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}


	@Override
	public String toString() {
		return "Venda [\nID da venda = " + idVenda + "\nCliente = " + clienteVenda.getNomeCliente()
				+ "\nPreço total = " + precoVenda + " reais]";
	}

	public Estoque getEstoqueVenda() {
		return estoqueVenda;
	}

	public void setEstoqueVenda(Estoque estoqueVenda) {
		this.estoqueVenda = estoqueVenda;
	}

}