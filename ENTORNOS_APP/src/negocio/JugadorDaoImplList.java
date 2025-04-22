package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entidades.Jugador;

public class JugadorDaoImplList implements JugadorDao {

	private List<Jugador> listaJugadores;

	private void cargarDatos() {

		listaJugadores.add(new Jugador("A1", "AAA", "Pepito", "Perez", LocalDate.of(1990, 6, 15), "pepito@gmail.com",
				"Calle pepe", "pepitoMajete"));
		listaJugadores.add(new Jugador("E2", "BBB", "Juan", "Gonzalez", LocalDate.of(1986, 9, 3), "juanito@gmail.com",
				"Calle juanchi", "Erjuanito"));
		listaJugadores.add(new Jugador("I3", "BBB", "Sara", "Sarita", LocalDate.of(1993, 3, 8), "sarita@gmail.com",
				"Calle sarys", "SaraSarita"));

	}

	public JugadorDaoImplList() {
		super();
		this.listaJugadores = new ArrayList<>();
		cargarDatos();

	}

	@Override
	public int insertOne(Jugador obj) {
		if (listaJugadores.contains(obj))
			return 0;
		
		listaJugadores.add(obj);
		
	    return 1;
		
	}

	@Override
	public int updateOne(Jugador obj) {
		int index = listaJugadores.indexOf(obj);
		if (index != -1) {
			listaJugadores.set(index, obj);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteOne(String objId) {
	
		for(Jugador ele:listaJugadores) {
			if(ele.getId().equals(objId)) {
			    listaJugadores.remove(ele);
			    return 1;
		}
			return 0;
		}
		
		


		return 0;
	}

	@Override
	public List<Jugador> findAll() {
		
		return listaJugadores;
	}

	@Override
	public Jugador findById(String objId) {
		
		for(Jugador ele: listaJugadores) {
			if (ele.getId().equals(objId))
				return ele;
		}
		
		return null;
	}

	@Override
	public Jugador findByNombreUsuario(String nombreUsuario) {
		
		for(Jugador ele: listaJugadores)
			if (ele.getNombre().equals(nombreUsuario))
				return ele;
		
		return null;
	}
	

}
