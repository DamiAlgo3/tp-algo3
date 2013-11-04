package algo3.modelo;

import java.util.Observable;

/**
 * Implementa una calculadora muy simple (solo suma y resta).
 * Tiene un resultado actual, al cual se le pueden ir haciendo operaciones.
 * Tambien tiene la posibilidad de guardar un numero en memoria y usarlo cuando se necesita.
 * @author algo3
 */
public class Calculadora extends Observable {
 
	private double resultado;
	private double memoria;
	
	public Calculadora() {
		this.resultado = 0;
		this.memoria = 0;
	}
	
	/**
	 * @return El resultado actual.
	 */
	public double getResultado() {
		return resultado;
	}
	
	/**
	 * Resetea la calculadora, haciendo que el resultado actual sea 0.
	 * Pero no borra la memoria.
	 */
	public void resetear() {
		this.resultado = 0;
	}
	
	/**
	 * Guarda el resultado actual en la memoria.
	 */
	public void memoriaGuardar() {
		this.memoria = this.resultado;
	}
	
	private void notificarObservadores() {
		this.setChanged();
		this.notifyObservers();
	}
	
	/**
	 * Suma un numero al resultado actual.
	 * @param numero
	 */
	public void sumar(double numero) {
		this.resultado += numero;
		notificarObservadores();
	}

	/**
	 * Resta un numero al resultado actual.
	 * @param numero
	 */
	public void restar(double numero) {
		this.resultado -= numero;
		notificarObservadores();
	}

	/**
	 * Suma la memoria al resultado actual.
	 */
	public void sumarMemoria() {
		this.resultado += memoria;
		notificarObservadores();
	}

	/**
	 * Resta la memoria al resultado actual.
	 */
	public void restarMemoria() {
		this.resultado -= memoria;
		notificarObservadores();
	}
	
}
