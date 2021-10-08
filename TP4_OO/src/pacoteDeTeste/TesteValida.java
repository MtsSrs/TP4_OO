package pacoteDeTeste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import modelo.Valida;

/**
 * Possui os resultados dos testes unitários
 * @author Matheus Soares e Mateus Caltabiano
 * @version 1.0 (Out 2021)
 */
public class TesteValida {
	Valida v = new Valida();
	
	@Test
	public void testTel() {
	assertTrue(v.validaTel("930481298"));	
	assertTrue(v.validaTel("893832913"));
	assertFalse(v.validaTel("999999999"));
	assertFalse(v.validaTel("321"));
	}
	
	@Test
	public void testDDD() {
	assertTrue(v.validaDDD("061"));
	assertTrue(v.validaDDD("51"));
	assertFalse(v.validaDDD("0"));
	assertFalse(v.validaDDD("1111"));
	}
	
	@Test
	public void testCPF() {
	assertTrue(v.validaCPF("19832193810"));
	assertTrue(v.validaCPF("90390387312"));
	assertFalse(v.validaCPF("9318"));
	assertFalse(v.validaCPF("99999999999"));
	}
	
	@Test
	public void testCEP() {
	assertTrue(v.validaCEP("64342432"));
	assertTrue(v.validaCEP("77777777"));
	assertFalse(v.validaCEP("3921"));
	assertFalse(v.validaCEP("921833"));
	}

}
