package vista;

import java.time.LocalDate;
import java.util.Scanner;

import control.GestionEquiposYJugadores;

public class GestionEquiposYJugadoresCli {

	private GestionEquiposYJugadores gestion;
	private Scanner sc;
	
	
	public GestionEquiposYJugadoresCli() {
		
		gestion = new GestionEquiposYJugadores();
		sc = new Scanner(System.in);
		
	}
	
	public void menu() {
		int opcion = 0;

		do {
			opcion = pintarMenu();

			switch (opcion) {
			case 1:
				registrarEquipo();
				break;
			case 2:
				añadirJugadoresEquipo();
				break;
			case 3:
				consultarListaDeEquiposYJugadores();
				break;
			
			}

		} while (opcion != 4);
		
		System.out.println("Fin del programa");

		sc.close();
	}

	private int pintarMenu() {
		int opcion;

		System.out.println(" 1.- Registrar Equipo");
		System.out.println(" 2.- Añadir jugadores a equipo");
		System.out.println(" 3.- Consultar lista de equipos y jugadores");
		System.out.println(" 4.- Salir");
		

		System.out.print("Introduce una opción, 4 para salir: ");
		opcion = sc.nextInt();

		while (opcion < 1 || opcion > 4) {
			System.out.println("Opción incorrecta, validos valores de 1 a 4");
			System.out.print("Introduce una opción: ");
			opcion = sc.nextInt();
		}

		return opcion;
	}
	
	private void registrarEquipo() {
		System.out.println("Introduce el id");
	    String id = sc.next();
	    System.out.println("introduce el nombre");
	    String nombre = sc.next();
	    
	    System.out.println(gestion.registrarEquipo(id, nombre));
	    
	    sc.nextLine(); //Esto es para limpiar el scaner
	    
		
	}
	
	
	
	private void añadirJugadoresEquipo() {
		System.out.println("Introduce el id");
		String id = sc.next();
		System.out.println("Introduce el id Equipo");
		String idEquipo = sc.next();
		System.out.println("Introduce el nombre");
		String nombre = sc.next();
		System.out.println("Introduce los apellidos");
		String apellidos = sc.next();
		sc.nextLine();
		System.out.println("Introduce la fecha de nacimiento. Primero el año");
		int fechaAño = sc.nextInt();
		System.out.println("Ahora el mes de nacimiento");
		int fechaMes = sc.nextInt();
		System.out.println("Por último el día de nacimiento");
		int fechaDia = sc.nextInt();
		LocalDate fechaCompleta= (LocalDate.of(fechaAño, fechaMes, fechaDia));
		
		System.out.println("Introduce el email");
		String email = sc.next();
		System.out.println("Introduce el direccion");
		String direccion = sc.next();
		System.out.println("Introduce el nombre de usuario");
		String nombreUs = sc.next();
		
		System.out.println(gestion.añadirJugadoresEquipo(id, idEquipo, nombre, apellidos, fechaCompleta, email, direccion, nombreUs));
		
		sc.nextLine();
		
	}
	
	private void consultarListaDeEquiposYJugadores() {
		System.out.println(gestion.consultarListaDeEquiposYJugadores());
	}


}
