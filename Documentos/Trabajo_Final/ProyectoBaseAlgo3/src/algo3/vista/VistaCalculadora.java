package algo3.vista;

import java.util.Observable;
import java.util.Observer;

import algo3.modelo.Calculadora;

/**
 * Implementa la vista de una calculadora.
 * Simplemente imprime por pantalla cada nuevo resultado.
 * @author algo3
 */
public class VistaCalculadora implements Observer {

	private Calculadora calc;
	
	/**
	 * Construye una nueva vista.
	 * @param calc La calculadora a observar.
	 */
	public VistaCalculadora(Calculadora calc) {
		this.calc = calc;
		calc.addObserver(this);
	}
	
	public void update(Observable arg0, Object arg1) {
		// si llaman a este metodo es porque la calculadora cambio el resultado
		System.out.println("Resultado : " + calc.getResultado());
	}

}
