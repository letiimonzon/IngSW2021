package tpFinal;

import java.util.StringTokenizer;

public class ContarPalabras {
	public Integer contarPalabras(String frase) {
		StringTokenizer st = new StringTokenizer(frase);
		return st.countTokens();
	}
//	public Integer sumar(Integer a, Integer b) {
//	return a + b;
//}

}
