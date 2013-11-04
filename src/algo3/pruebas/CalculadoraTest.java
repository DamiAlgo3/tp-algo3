package algo3.pruebas;

import algo3.modelo.Calculadora;
import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {

	
	public void testSuma() throws Exception {
		Calculadora calc = new Calculadora();
		calc.sumar(14.3);
		assertEquals("Falla suma inicial",14.3,calc.getResultado(),0.001);
		calc.sumar(3.2);
		assertEquals("Falla segunda suma",17.5,calc.getResultado(),0.001);
		calc.sumar(0);
		assertEquals("Falla sumar 0",17.5,calc.getResultado(),0.001);
	}
	
	public void testResta() throws Exception {
		Calculadora calc = new Calculadora();
		calc.restar(14.3);
		assertEquals("Falla resta inicial",-14.3,calc.getResultado(),0.001);
		calc.restar(3.2);
		assertEquals("Falla segunda resta",-17.5,calc.getResultado(),0.001);
		calc.restar(0);
		assertEquals("Falla restar 0",-17.5,calc.getResultado(),0.001);
	}

	// TODO: agregar el resto de los tests...
	
}
