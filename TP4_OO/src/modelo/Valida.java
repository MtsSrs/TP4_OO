package modelo;

public class Valida {

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

	public boolean validaCPF(String CPF) {
		String cpf = CPF;
		boolean aux = true;

		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999") || (cpf.length() != 11)) {
			aux = false;
		}

		return aux;
	}

	public boolean validaCEP(String cEP) {
		String cep = cEP;
		boolean aux = true;
		if (cep.length() != 8) {
			aux = false;
		}
		return aux;
	}

}
