package test;


import vehiculos.*;
import org.junit.Test;
import junit.framework.*;
import eventos.*;


public class VehiculosTest extends TestCase{
	
	private Auto unAuto;
	private Evento unEvento;
	private TodoTerreno unTodoTerreno;
	private Moto unaMoto;
	
	protected void setUp() throws Exception{
		super.setUp();
		
		unAuto = new Auto();
		unAuto.setMovimientos(2);
		
		unTodoTerreno = new TodoTerreno();
		unTodoTerreno.setMovimientos(2);
		
		unaMoto = new Moto();
		unaMoto.setMovimientos(2);
		
		unEvento = new Bache(); 
	}
	@Test
	public void test() {
		
		assertEquals(2, unAuto.getMovimientos());
		assertEquals(2, unTodoTerreno.getMovimientos());
		assertEquals(2, unaMoto.getMovimientos());
		
		unAuto.resolverEvento(unEvento);
		unTodoTerreno.resolverEvento(unEvento);
		unaMoto.resolverEvento(unEvento);
		
		assertEquals(5, unAuto.getMovimientos());
		assertEquals(2, unTodoTerreno.getMovimientos());
		assertEquals(5, unaMoto.getMovimientos());
		
	
	}

}
