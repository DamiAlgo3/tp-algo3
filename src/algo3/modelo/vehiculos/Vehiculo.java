package algo3.modelo.vehiculos;

import algo3.modelo.interactuables.Bache;
import algo3.modelo.interactuables.ControlPolicial;
import algo3.modelo.interactuables.Piquete;

public abstract class Vehiculo {
	
	protected int movimientos;
	
	public Vehiculo(){movimientos = 0;}
	
	public int movimientos(){return movimientos;}
	
	public abstract void interactuar(Bache unBache);
	public abstract void interactuar(Piquete unPiquete);
	public abstract void interactuar(ControlPolicial unControlPolicial);
	
	}
