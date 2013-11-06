package eventos;
import vehiculos.Auto;
import vehiculos.Moto;
import vehiculos.TodoTerreno;


public interface Evento {
	
	public void resolver(Moto unaMoto);

	public void resolver(TodoTerreno unTodoTerreno);	
	
	public void resolver(Auto unAuto);

}