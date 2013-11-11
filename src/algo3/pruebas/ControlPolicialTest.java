package algo3.pruebas;

import org.junit.Test;

import junit.framework.*;
import algo3.modelo.interactuables.*;
import algo3.modelo.vehiculos.*;


public class ControlPolicialTest extends TestCase{
	
	private Auto unAuto;
	private TodoTerreno unTodoTerreno;
	private Moto unaMoto;
	
	private ControlPolicial unControlPolicial;
	
	private int puntosAuto;
	private int puntosTodoTerreno;
	private int puntosMoto;
	
	protected void setUp() throws Exception{
		super.setUp();
		
		unAuto = new Auto();
		unTodoTerreno = new TodoTerreno();
		unaMoto = new Moto();
		
		unControlPolicial = new ControlPolicial();
		
		if (unControlPolicial.numeroActual()<50){puntosAuto = 3;}
		if (unControlPolicial.numeroActual()<30){puntosTodoTerreno =3;}
		if (unControlPolicial.numeroActual()<80){puntosMoto =3;}
	}
	@Test
	public void test() {
		
		assertEquals(0, unAuto.movimientos());
		assertEquals(0, unTodoTerreno.movimientos());
		assertEquals(0, unaMoto.movimientos());
		
		unAuto.interactuar(unControlPolicial);
		unTodoTerreno.interactuar(unControlPolicial);
		unaMoto.interactuar(unControlPolicial);
		
		assertEquals(puntosAuto, unAuto.movimientos());
		assertEquals(puntosTodoTerreno, unTodoTerreno.movimientos());
		assertEquals(puntosMoto, unaMoto.movimientos());
		
	
	}
	

}

