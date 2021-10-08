package modelo;

/**
 * Possui os métodos para os testes unitários
 * @author Matheus Soares e Mateus Caltabiano
 * @version 1.0 (Out 2021)
 */
public class Valida {

	/**
	 * Valida o telefone nos seguintes aspectos:
	 * (1) Deve ter 9 números
	 * (2) Não pode possuir todos os números iguais
	 * @param tel String com o telefone
	 * @return boolean true ou false de acordo com o teste
	 */
	public boolean validaTel(String tel) {
		String numero = tel;
		boolean aux = true;
		
		if (numero.length() != 9) {
			aux = false;
		} else if (numero.equals("000000000") || numero.equals("111111111") || numero.equals("222222222")
				|| numero.equals("333333333") || numero.equals("444444444") || numero.equals("555555555")
				|| numero.equals("666666666") || numero.equals("777777777") || numero.equals("888888888")
				|| numero.equals("999999999")) {
			aux = false;
		}
		return aux;
	}

	/**
	 * Valida o DDD no seguinte aspecto:
	 * (1) Deve ter 3 ou 2 números
	 * @param dDD String com o DDD
	 * @return boolean true ou false de acordo com o teste
	 */
	public boolean validaDDD(String dDD) {
		String ddd = dDD;
		boolean aux = true;

		if (ddd.length() > 3) {
			aux = false;
		} else if (ddd.length() < 2) {
			aux = false;
		}

		return aux;
	}

	/**
	 * Valida o CPF nos seguintes aspectos:
	 * (1) Deve ter 11 números
	 * (2) Não pode possuir todos os números iguais
	 * @param cPF String com o CPF
	 * @return boolean true ou false de acordo com o teste
	 */
	public boolean validaCPF(String cPF) {
		String cpf = cPF;
		boolean aux = true;

		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999") || (cpf.length() != 11)) {
			aux = false;
		}

		return aux;
	}

	/**
	 * Valida o CEP no seguinte aspecto:
	 * (1) Deve ter 8 números
	 * @param cEP String com o CEP
	 * @return boolean true ou false de acordo com o teste
	 */
	public boolean validaCEP(String cEP) {
		String cep = cEP;
		boolean aux = true;
		if (cep.length() != 8) {
			aux = false;
		}
		return aux;
	}

}
