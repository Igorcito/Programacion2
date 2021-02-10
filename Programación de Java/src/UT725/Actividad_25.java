/**
 * 
 */
package UT725;

import java.util.ArrayList;
import java.util.Scanner;

import UT725.Cancion;
import UT725.Playlist;

/**
 * @author IGOR
 *
 */
public class Actividad_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner (System.in);
		
		//VARIABLES:
		int opcion;
		int posicion;
		//-canción-
		String titulo;
		String artista;
		int duracion;
		//-playlist-
		String nombre;
		ArrayList<Playlist> musica = new ArrayList<Playlist>();
		
		Playlist favoritas = new Playlist();
		
		System.out.println("Hola.");
		
		do {
			
				//MENÚ DE OPCIONES:
				System.out.println("¿Qué quieres hacer?: ");
				System.out.println(" ");
				System.out.println(" 1. AÑADIR una canción a la Playlist.            (Pulsa  1)");
				System.out.println(" 2. BUSCAR una canción por posición.             (Pulsa  2)");
				System.out.println(" 3. MOSTRAR cuántas canciones tiene la Playlist. (Pulsa  3)");
				System.out.println(" 4. MOSTRAR todas las canciones.                 (Pulsa  4)");
				System.out.println(" 5. MOSTRAR la duración total de la Playlist.    (Pulsa  5)");
				System.out.println(" 6. REPRODUCIR la Playlist.                      (Pulsa  6)");
				System.out.println(" 7. REPRODUCIR una canción.                      (Pulsa  7)");
				System.out.println(" 8. BORRAR todas las canciones.                  (Pulsa  8)");
				System.out.println(" 9. BORRAR una cancion por posición.             (Pulsa  9)");
				System.out.println("10. BUSCAR una canción por título.               (Pulsa 10)");
				System.out.println("11. BUSCAR una canción por artista.              (Pulsa 11)");
				System.out.println(" 0. SALIR.                                       (Pulsa  0)");
				System.out.println(" ");
				opcion = entrada.nextInt();
			
				//OPCIÓNES:
				switch(opcion) 
				{
					case 1: System.out.println("Vas a añadir una canción.");
							System.out.println("---------------------------");
							System.out.println(" ");
							System.out.println("¿Cuál es el título de la canción?");
							titulo = entrada2.nextLine();
							System.out.println("¿Cuál es el artista?");
							artista = entrada2.nextLine();
							System.out.println("¿Cuánto dura la canción?");
							duracion = entrada.nextInt();
							
							favoritas.anyadirCancion(titulo, artista, duracion);
							System.out.println("La canción ha sido añadida a la Playlist. ");   
							System.out.println(" ");
							System.out.println(" ");
							
							break;
							
							
					case 2: System.out.println("Vas a buscar una canción según su posicion en la Playlist.");
							System.out.println("----------------------------------------------------------");
							System.out.println(" ");
							System.out.println("¿Cuál es su posición?");
							posicion = entrada.nextInt();
							System.out.println("La canción de esa posición es: " + favoritas.obtenerCancion(posicion-1));
							System.out.println(" ");
							System.out.println(" ");
							
							break;
							
							
					case 3: System.out.println("La Playlist tiene " + favoritas.totalCanciones() + " canciones.");
							System.out.println(" ");
							System.out.println(" ");
							
							break;
							
							
					case 4: System.out.println("Las canciones de tu playlist son: ");
							System.out.println(favoritas.showPlaylist());
							System.out.println(" ");
							System.out.println(" ");
						
							break;
					
							
					case 5: System.out.println("La duración total de tu playlist es de: " + favoritas.totalDuracion() + " min.");
							System.out.println(" ");
							System.out.println(" ");
							
							break;
							
							
					case 6: System.out.println("Se está reproduciendo tu playlist: ");
							System.out.println(favoritas.playCancion());
							System.out.println(" ");
							System.out.println(" ");
							
							break;
							
							
					case 7: System.out.println("Vas a reproducir una canción de tu playlist:");
							System.out.println("--------------------------------------------");
							System.out.println("¿En qué posición está la canción que quieres reproducir?");
							posicion = entrada.nextInt();
							System.out.println(favoritas.reproducirCancion(posicion-1));
							System.out.println(" ");
							System.out.println(" ");
							
							break;
							
							
					case 8: favoritas.borrarCanciones();
							System.out.println("Has eliminado todas las canciones de la playlist.");
							System.out.println(" ");
							System.out.println(" ");
							
							break;
						
							
					case 9: System.out.println("Vas a eliminar una canción de tu playlist según su posición:");
							System.out.println("------------------------------------------------------------");
							System.out.println("¿En qué posición está la canción que quieres reliminar?");	
							posicion = entrada.nextInt();
							favoritas.borrarCancion(posicion-1);
							System.out.println("La canción ha sido eliminada de tu playlist:");
							System.out.println(" ");
							System.out.println(" ");
							
							break;
							
							
					case 10: System.out.println("Buscando canción por título:");
							 System.out.println("----------------------------");
							 System.out.println("¿Cuál es el título de tu canción?");	
							 titulo = entrada2.nextLine();
							 System.out.println("Se ha encontrado la canción: " + favoritas.encontrarTitulo(titulo));
							 System.out.println(" ");
							 System.out.println(" ");
							 
							break;
							
							
					case 11: System.out.println("Buscando canción por artista:");
					 		 System.out.println("-----------------------------");
					 		 System.out.println("¿Cuál es el artista que buscas?");	
					 		 artista = entrada2.nextLine();
					 		 System.out.println("Se han encontrado las canciones del artista: " + favoritas.encontrarArtista(artista));                       
					 		 System.out.println(" ");
					 		 System.out.println(" ");
					 		 
					 		 break;
					 		 
					 		 
				}
			
			}while(opcion != 0);
			
			System.out.println("Adios.");
	
		entrada.close();
		entrada2.close();
	}

}
