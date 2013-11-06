package vehiculos;
import eventos.Evento;


public abstract class Vehiculo {
	
	private int movimientos;
	
	public int getMovimientos(){return movimientos;}
	public void setMovimientos(int movimientos){this.movimientos = movimientos;}
	
	public abstract void resolverEvento(Evento unEvento);
	
	}
