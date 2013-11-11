
import algo3.modelo.interactuables.*;

public class Auto extends Vehiculo {

	public void interactuar(Bache unBache){movimientos += 3;}
	public void interactuar(Piquete unPiquete){}
	public void interactuar(ControlPolicial unControlPolicial){
		
		int aux = (int) (Math.random()*100);
		if(aux < 50) { movimientos += 3;}
		}
	
	
	}
