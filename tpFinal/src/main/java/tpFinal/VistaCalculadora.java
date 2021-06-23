package tpFinal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class VistaCalculadora {
	private Integer nroA;
	private Integer nroB;
	private Integer resultado;
	
	

	public VistaCalculadora() {
		super();
		nroA = 0;
		nroB = 0;
		resultado = 0;
	}

	public void clickSumar() {
		Calculadora calculadora = new Calculadora();
		resultado = calculadora.sumar(nroA, nroB);
	}

	public Integer getNroA() {
		return nroA;
	}

	public void setNroA(Integer nroA) {
		this.nroA = nroA;
	}

	public Integer getNroB() {
		return nroB;
	}

	public void setNroB(Integer nroB) {
		this.nroB = nroB;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}

}
