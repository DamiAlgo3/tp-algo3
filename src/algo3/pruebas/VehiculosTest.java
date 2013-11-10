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
	
		unTodoTerreno = new TodoTerreno();
		
		unaMoto = new Moto();
		
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
