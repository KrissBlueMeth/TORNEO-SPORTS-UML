# Sistema de Gestión de Torneos de eSports 
## Autor
Cristina Salazar Guijarro
KrissBlueMeth

## Descripción del Proyecto
(https://github.com/KrissBlueMeth/TORNEO-ESPORTS-UML.git)

Este proyecto implementa un sistema de gestión de torneos de eSports utilizando UML para el modelado y Java para la implementación. Forma parte de la actividad evaluable del tercer trimestre de la asignatura de Entornos de Desarrollo y he utilizado draw.io para realizar el diagrama de casos de uso y el de clases. Además he creado el proyecto en Java para poder comprobar si funcionaría correctamente. 

## Diagramas UML 

### Diagrama de Casos de Uso 
![Diagrama de casos de uso](diagrams/GestionDeEquiposYJugadores-useCase.png) 

### Diagrama de Clases 
![Diagrama de clases](diagrams/clases.png) AQUI HAY QUE METER EL DE CLASES

## Estructura del Proyecto

torneo-esports-uml/ ├── src/ 
│ ├── es/empresa/torneo/ #ESTO LO TENGO QUE CAMBIAR CUANDO AÑADA EL PROYECTO DE JAVA
│ │ ├── modelo/ 
│ │ ├── control/ 
│ │ ├── vista/ 
│ │ ├── Main.java 
├── diagrams/
│ ├── GestionDeEquiposYJugadores-useCase.png 
│ ├── clases.png #ESTO LO TENGO QUE CAMBIAR CUANDO AÑADA EL DIAGRAMA CLASES
├── README.md 
├── .gitignore
├── LICENSE (opcional) 

## Instalación y Ejecución 
1. Clonar el repositorio:
 `git clone https://github.com/KrissBlueMeth/TORNEO-ESPORTS-UML.git´
  
2. Compilar y ejecutar el proyecto:
`cd src javac es/empresa/torneo/Main.java java es.empresa.torneo.Main`

 ## Justificación del diseño 
 Un ADMIN accede a los casos de uso. Los casos de uso "Registrar equipo", "Añadir jugadores a un equipo" y "consultar lista de equipos y jugadores" los he contemplado como casos de usos independientes (se pueden utilizar de manera independiente, por ejemplo: puedo crear un equipo sin necesidad de añadir ningún jugador en ese momento al equipo. O puedo añadir jugadores sin meterlos obligatoriamente dentro de un equipo). He añadido un nuevo caso de uso: "Registrar Jugador" ya que me parecía importante para el correcto funcionamiento del proyecto. 
En cuanto a las clases, serían 2: equipo y jugador. Ambas tienen metódos en común como "registrar nuevo equipo- registrar nuevo jugador"  # FALTA POR EXPLICAR CUANDO TENGA EL DIAGRAMA DE CASOS
 
 ## Conclusiones Sobre el aprendizaje obtenido.
