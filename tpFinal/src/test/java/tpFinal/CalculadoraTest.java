package tpFinal;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CalculadoraTest {

	@Test
	public void sumerTest() {
		Calculadora calculadora = new Calculadora();
		Integer result = 5;
		AssertJUnit.assertEquals(result, calculadora.sumar(3, 2));
	}
}
