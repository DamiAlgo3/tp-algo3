package vehiculos;
import eventos.Evento;


public class TodoTerreno extends Vehiculo {
	
	public void resolverEvento(Evento unEvento){
		unEvento.resolver(this);
		}

}
