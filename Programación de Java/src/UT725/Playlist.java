/**
 * 
 */
package UT725;

import java.util.ArrayList;

/**
 * @author IGOR
 *
 */
public class Playlist {

	//---ATRIBUTOS:---
	public ArrayList<Cancion> playlist;
	public String nombre;

	
	//---CONSTRUCTOR VACIO:---
	public Playlist()
	{
		this.playlist = new ArrayList<Cancion>();
	}

	
	//---CONSTRUCTOR CON PARÁMETROS:---
	public Playlist(String nombre)
	{
		this.nombre = nombre;
		this.playlist = new ArrayList<Cancion>();
	}
	
	//---MÉTODOS:---
	
	//--- 1. Añadimos una canción a la playlist:---
	public void anyadirCancion(String titulo, String artista, int duracion)
	{
		playlist.add(new Cancion (titulo, artista, duracion));
	}
	
	//--- 2. Nos muestra qué canción hay en la posición que introducimos.
	public String obtenerCancion(int posicion)
	{
		return playlist.get(posicion).toString();
	}
	
	//--- 3. Nos muestra el número total de canciones que hay en la playlist:--- 
	public int totalCanciones()
	{	
		return playlist.size();
	}
	
	//--- 4. Nos muestra todas las canciones de la playlist:---
	public StringBuilder showPlaylist()
	{	
		StringBuilder Muestra = new StringBuilder();
		
		for(int i = 0; i < playlist.size(); i++)
		{
			Muestra.append(playlist.get(i).toString());
		}
		return Muestra;
	}
	
	//--- 5. Nos muestra la duración total de la playlist:---
	public int totalDuracion()
	{
		int totalDuracion = 0;
		
		for (Cancion C: playlist)
		{
			totalDuracion = totalDuracion + C.getDuracion();
		}
		return totalDuracion;
	}
	
	//--- 6. Reproduce nuestra playlist:---
	public StringBuilder playCancion()
	{	
		StringBuilder Play = new StringBuilder();
		
		for(int i = 0; i < playlist.size(); i++)
		{
			Play.append(playlist.get(i).reproducir());
			Play.append("\n");
		}
		return Play;
	}		

	//--- 7. Reproduce la canción de la posición que le hemos indicado:--
	public String reproducirCancion(int posicion)
	{
		return playlist.get(posicion).reproducir();
	}
		

	//--- 8. Borramos las canciones de la playlist:---
	public void borrarCanciones()
	{
		playlist.clear();
	}
	
	//--- 9. Borramos la canción de la posición que especifiquemos de nuestra playlist:---
	public boolean borrarCancion(int posicion)
	{ 
		boolean borrar = true;
			if(playlist.size() > 0)
			{
				if(playlist.size() >= posicion)
				{
					borrar = true;
					playlist.remove(posicion);
				}else {
					borrar = false;
				}
			}else {
				borrar = false;
			}
		return borrar;
	}
	
	//--- 10. Encontramos la canción que buscamos según el título.
	public Cancion encontrarTitulo(String titulo)
	{
		int posicion = 0;
		
		for (int i=0; i<playlist.size(); i++)
		{
			if (playlist.get(i).getTitulo().equals(titulo))
			{
				posicion = i;
			}
		}
		
		return playlist.get(posicion);
	}
	
	//--- 11. Encontramos la canción que buscamos según el artista.
	public ArrayList<Cancion> encontrarArtista(String artista)
	{
		ArrayList<Cancion> encArtista = new ArrayList<Cancion>();
		
		for (int i = 0; i < playlist.size(); i++)
		{
			if (playlist.get(i).getArtista().equals(artista))
			{
			   encArtista.add(new Cancion (playlist.get(i).getTitulo(), playlist.get(i).getArtista(), playlist.get(i).getDuracion()));
			}
		}
		return encArtista;
	}
	

}	









