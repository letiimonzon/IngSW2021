package tpFinal;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class ContarPalabrasTest {

	@Test
	public void contarPalabrasTest() {
		ContarPalabras pd = new ContarPalabras();
		Integer result= 3;
		AssertJUnit.assertEquals(result,pd.contarPalabras("hola         mundo" ));
		
	}
}
