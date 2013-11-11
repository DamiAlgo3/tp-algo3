package algo3.modelo.vehiculos;
import algo3.modelo.interactuables.*;


public class Moto extends Vehiculo {
	
	public void interactuar(Bache unBache){movimientos += 3;}
	public void interactuar(Piquete unPiquete){}
	public void interactuar(ControlPolicial unControlPolicial){
		if(unControlPolicial.numeroActual() < 80) { movimientos += 3;}
		}
	}
