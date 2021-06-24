package tpFinal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class VistaContarPalabras {
 private String frase;
 private Integer result;
public String getFrase() {
	return frase;
}
public void setFrase(String frase) {
	this.frase = frase;
}
public Integer getResult() {
	return result;
}
public void setResult(Integer result) {
	this.result = result;
}
public VistaContarPalabras() {
	frase = "";
	result = 0;
}

public void clickBoton() {
	ContarPalabras pd = new ContarPalabras();
	result = pd.contarPalabras(frase);
	
}
 
}

