package modelo;


public class Cliente {

	private String nomeCliente;
	private String enderecoCliente;
	private String cpfCliente;
	private Telefone telefoneCliente;

	public Cliente(String nomeCliente, String enderecoCliente, String cpfCliente, Telefone telefoneCliente) {
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		this.cpfCliente = cpfCliente;
		this.telefoneCliente = telefoneCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public Telefone getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(Telefone telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}


	@Override
	public String toString() {
		return "\nNome do cliente = " + nomeCliente + "\nEndereço do cliente = " + enderecoCliente
				+ "\nCPF do cliente = " + cpfCliente + "\nTelefone do cliente = " + telefoneCliente + "\n";
	}
}