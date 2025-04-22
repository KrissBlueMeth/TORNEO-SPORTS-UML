import vista.GestionEquiposYJugadoresCli;

public class Main { //Esta clase necesita la vista (GestionEquiposYJugadoresCli). Es el hilo de ejecución de la aplicación. 
//es como un index. Desde el main se debe poder usar toda la aplicación. ES EL HILO PRINCIPAL DE TODA LA APP.
	public static void main(String[] args) {
		
		GestionEquiposYJugadoresCli gej = new GestionEquiposYJugadoresCli();;	
		
		gej.menu();	
			

	}
	
	
	

}
