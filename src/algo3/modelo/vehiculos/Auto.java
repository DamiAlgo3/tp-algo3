package vehiculos;
import eventos.Evento;


public class Auto extends Vehiculo {

	public void resolverEvento(Evento unEvento){
		unEvento.resolver(this);
		}
}
