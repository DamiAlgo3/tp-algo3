package vehiculos;
import eventos.Evento;


public class Moto extends Vehiculo {
	
	public void resolverEvento(Evento unEvento){
		unEvento.resolver(this);
		}
}
