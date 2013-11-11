package algo3.modelo.vehiculos;
import algo3.modelo.interactuables.*;


public class TodoTerreno extends Vehiculo {
	
	public void interactuar(Bache unBache){}
	public void interactuar(Piquete unPiquete){}
	public void interactuar(ControlPolicial unControlPolicial){
		if(unControlPolicial.numeroActual() < 30) { movimientos += 3;}
		}
	}
