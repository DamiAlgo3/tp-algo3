package eventos;
import vehiculos.Auto;
import vehiculos.Moto;
import vehiculos.TodoTerreno;


public class Bache implements Evento {

	@Override
	public void resolver(Moto unaMoto) {
		unaMoto.setMovimientos(unaMoto.getMovimientos()+3);
		}

	@Override
	public void resolver(TodoTerreno unTodoTerreno) {
		unTodoTerreno.getMovimientos();
		}

	@Override
	public void resolver(Auto unAuto) {
		unAuto.setMovimientos(unAuto.getMovimientos()+3);
		}

}
