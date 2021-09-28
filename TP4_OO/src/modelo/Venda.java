package modelo;


public class Venda {

	private int idVenda = 0;
	private Cliente clienteVenda;
	private Estoque estoqueVenda;
	private float precoVenda;
	private Pastel pastelVenda;
	private Bebida bebidaVenda;

	public Venda(int idVenda, Cliente clienteVenda, float precoVenda, Pastel pastelVenda, Bebida bebidaVenda) {
		this.idVenda = idVenda;
		this.clienteVenda = clienteVenda;
		this.precoVenda = precoVenda;
		this.pastelVenda = pastelVenda;
		this.bebidaVenda = bebidaVenda;
		
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

	public Pastel getPastelVenda() {
		return pastelVenda;
	}

	public void setPastelVenda(Pastel pastelVenda) {
		this.pastelVenda = pastelVenda;
	}

	public Bebida getBebidaVenda() {
		return bebidaVenda;
	}

	public void setBebidaVenda(Bebida bebidaVenda) {
		this.bebidaVenda = bebidaVenda;
	}

	@Override
	public String toString() {
		return "\nID da venda = " + idVenda + "\nCliente = " + clienteVenda.getNomeCliente()
				+ "\nPreço total = " + precoVenda + " reais";
	}

	public Estoque getEstoqueVenda() {
		return estoqueVenda;
	}

	public void setEstoqueVenda(Estoque estoqueVenda) {
		this.estoqueVenda = estoqueVenda;
	}

}