package algo3.pruebas;

import org.junit.Test;

import junit.framework.*;
import algo3.modelo.interactuables.*;
import algo3.modelo.vehiculos.*;


public class BacheTest extends TestCase{
	
	private Auto unAuto;
	private Bache unBache;
	private TodoTerreno unTodoTerreno;
	private Moto unaMoto;
	
	protected void setUp() throws Exception{
		super.setUp();
		
		unAuto = new Auto();
	
		unTodoTerreno = new TodoTerreno();
		
		unaMoto = new Moto();
		
		unBache = new Bache(); 
	}
	@Test
	public void test() {
		
		assertEquals(0, unAuto.movimientos());
		assertEquals(0, unTodoTerreno.movimientos());
		assertEquals(0, unaMoto.movimientos());
		
		unAuto.interactuar(unBache);
		unTodoTerreno.interactuar(unBache);
		unaMoto.interactuar(unBache);
		
		assertEquals(3, unAuto.movimientos());
		assertEquals(0, unTodoTerreno.movimientos());
		assertEquals(3, unaMoto.movimientos());
		
	
	}
	

}
