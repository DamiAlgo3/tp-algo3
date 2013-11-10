package vehiculos;
import eventos.Evento;


public abstract class Vehiculo {
	
	private int movimientos;
	
	public Vehiculo(){movimientos = 0;}
	
	public abstract void interactuar(Evento unEvento);
	
	}
