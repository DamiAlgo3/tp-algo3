package algo3.modelo.interactuables;
import java.util.Random;


public class GeneradorAleatorio {
	
	
	private Random generadorAleatorio;
	private int numeroActual;
	
	public GeneradorAleatorio(){
		generadorAleatorio = new Random(System.currentTimeMillis());
		numeroActual = generadorAleatorio.nextInt(100);
	}
	
	public int generarNumeros(int hasta){
		numeroActual = generadorAleatorio.nextInt(hasta); 
		return numeroActual;
	}

	public int numeroActual(){return numeroActual;}

}
