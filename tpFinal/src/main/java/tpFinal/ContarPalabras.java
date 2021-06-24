package tpFinal;

import java.util.StringTokenizer;

public class ContarPalabras {
	public Integer contarPalabras(String frase) {
		StringTokenizer st = new StringTokenizer(frase);
		return st.countTokens();
	}

}
