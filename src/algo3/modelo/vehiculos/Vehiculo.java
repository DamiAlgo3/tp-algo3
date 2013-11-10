package vehiculos;
import eventos.Evento;


public abstract class Vehiculo {
	
	private int movimientos;
	
	public abstract void interactuar(Evento unEvento);
	
	}
