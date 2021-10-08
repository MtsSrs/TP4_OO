package modelo;

/**
 * Contém os parâmetros para o objeto Estabelecimento
 * @author Matheus Soares e Mateus Caltabiano
 * @version 1.0 (Out 2021)
 */
public class Estabelecimento {

	private String enderecoEstabelecimento;
	private String cepEstabelecimento;
	private Telefone telefoneEstabelecimento;

	/**
	 * Contstrutor para instanciação do objeto Estabelecimento
	 * @param enderecoEstabelecimento String para o endereço do estabelecimento
	 * @param cepEstabelecimento String para o CEP do estabelecimento
	 * @param telefoneEstabelecimento Telefone para o telefone do estabelecimento
	 */
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