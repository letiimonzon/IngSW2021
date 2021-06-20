package tpFinal;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CalculadoraTest {

  @Test
  public void sumerTest() {
    Calculadora calculadora = new Calculadora();
    Integer result = 6;
    AssertJUnit.assertEquals(result, calculadora.sumer(3, 2));
  }
}
