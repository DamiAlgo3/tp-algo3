package algo3;

import algo3.modelo.Calculadora;
import algo3.vista.VistaCalculadora;

public class Principal {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		VistaCalculadora vistaCalc = new VistaCalculadora(calc);
		calc.sumar(1.5);
		calc.sumar(3);
		calc.memoriaGuardar();
		calc.restar(2);
		calc.sumarMemoria();
	}

}
