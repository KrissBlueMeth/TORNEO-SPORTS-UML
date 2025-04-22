package test;

import java.time.LocalDate;
import control.GestionEquiposYJugadores;
import entidades.Equipo;
import entidades.Jugador;
import negocio.EquipoDao;
import negocio.EquipoDaoImplList;
import negocio.JugadorDao;
import negocio.JugadorDaoImplList;

public class MainTest {
		
    private static JugadorDao jDao = new JugadorDaoImplList();
    private static EquipoDao eDao = new EquipoDaoImplList();
    private static GestionEquiposYJugadores gEJ = new GestionEquiposYJugadores();
    
    
    
    public static void main(String[] args) {
    	
    	System.out.println(gEJ.consultarListaDeEquiposYJugadores());
        System.out.println(gEJ.añadirJugadoresEquipo("U001", "AAA", "Ana", "García", LocalDate.of(1995, 12, 1), "ana.garcia@example.com", "C/blabla", "Anita55"));
        System.out.println(gEJ.registrarEquipo("ZZZ", "LosGuachis"));
             System.out.println(gEJ.consultarListaDeEquiposYJugadores());
             System.out.println(gEJ.añadirJugadoresEquipo("U001", "AAA", "Ana", "García", LocalDate.of(1995, 12, 1), "ana.garcia@example.com", "C/blabla", "Anita55"));
             System.out.println(gEJ.consultarListaDeEquiposYJugadores());
        }





	private static void findAll() {
		System.out.println("Lista de Jugadores: "
				+ "**********************************");
		for(Jugador ele: jDao.findAll()) {
			System.out.println(ele);
		}
		
		System.out.println("Lista de Equipos: "
				+ "************************************");
		for(Equipo ele: eDao.findAll()) {
			System.out.println(ele);
		}
//		List<Jugador> aux1 = jDao.findAll();
//		List<Equipo> aux2 = eDao.findAll();
//		System.out.println("\nLista de jugadores: \n" + aux1);
//		System.out.println("\nLista de equipos: \n" + aux2);
	}
}
