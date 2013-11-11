package algo3.modelo.interactuables;

public class ControlPolicial implements Interactuable {
	
	private GeneradorAleatorio unGeneradorAleatorio;
	public ControlPolicial(){unGeneradorAleatorio = new GeneradorAleatorio();}
	
	public int generarNumero(){return unGeneradorAleatorio.generarNumeros(100);}
	public int numeroActual(){return unGeneradorAleatorio.numeroActual();}
	
	
}
