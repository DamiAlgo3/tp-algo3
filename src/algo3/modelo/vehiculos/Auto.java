package algo3.modelo.vehiculos;
import algo3.modelo.interactuables.*;

public class Auto extends Vehiculo {

	public void interactuar(Bache unBache){movimientos += 3;}
	public void interactuar(Piquete unPiquete){}
	public void interactuar(ControlPolicial unControlPolicial){
		if(unControlPolicial.numeroActual() < 50) { movimientos += 3;}
		}
	}
