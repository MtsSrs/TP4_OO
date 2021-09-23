package modelo;


public class Estabelecimento {

	private String enderecoEstabelecimento;
	private String cepEstabelecimento;
	private Telefone telefoneEstabelecimento;

	public Estabelecimento(String enderecoEstabelecimento, String cepEstabelecimento,
			Telefone telefoneEstabelecimento) {
		this.enderecoEstabelecimento = enderecoEstabelecimento;
		this.cepEstabelecimento = cepEstabelecimento;
		this.telefoneEstabelecimento = telefoneEstabelecimento;
	}

	public String getEnderecoEstbelecimento() {
		return enderecoEstabelecimento;
	}

	public void setEnderecoEstbelecimento(String enderecoEstbelecimento) {
		this.enderecoEstabelecimento = enderecoEstbelecimento;
	}

	public String getCepEstabelecimento() {
		return cepEstabelecimento;
	}

	public void setCepEstabelecimento(String cepEstabelecimento) {
		this.cepEstabelecimento = cepEstabelecimento;
	}

	public Telefone getTelefoneEstabelecimento() {
		return telefoneEstabelecimento;
	}

	public void setTelefoneEstabelecimento(Telefone telefoneEstabelecimento) {
		this.telefoneEstabelecimento = telefoneEstabelecimento;
	}


	@Override
	public String toString() {
		return "\nEndereco do estabelecimento = " + enderecoEstabelecimento
				+ "\nCEP do estabelecimento = " + cepEstabelecimento + "\nTelefone do estabelecimento = "
				+ telefoneEstabelecimento + "\n";
	}

}