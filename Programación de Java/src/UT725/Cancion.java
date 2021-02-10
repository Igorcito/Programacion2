/**
 * 
 */
package UT725;

/**
 * @author IGOR
 *
 */
public class Cancion {

	
		//---ATRIBUTOS:---
		private String titulo;
		private String artista;
		private int duracionMinutos;
	
	
		//---CONSTRUCTOR VACIO:---
		public Cancion()
		{
			
		}
		
		
		//---CONSTRUCTOR CON PARÁMETROS:---
		public Cancion(String titulo, String artista, int duracionMinutos)
		{
			setTitulo(titulo);
			setArtista(artista);
			setDuracion(duracionMinutos);
		}
		
		
		//---GETTERS:---
		public String getTitulo()
		{ 
			return this.titulo;
		}
		
		public String getArtista()
		{ 
			return this.artista;
		}
		
		public int getDuracion()
		{ 
			return this.duracionMinutos;
		}

		
		//---SETTERS:---
		public void setTitulo(String titulo)
		{
			this.titulo = titulo;
		}
		
		public void setArtista(String artista)
		{
			this.artista = artista;
		}
		
		public void setDuracion (int duracionMinutos)
		{
			this.duracionMinutos = duracionMinutos;
		}
		
		
		//---MÉTODOS:---
		public String reproducir()
		{ 
			return "Reproduciendo: " + titulo + ".";
		}
		
		@Override
		public String toString()
		{
			return "Titulo: " + titulo + " - Artista: " + artista + " - Duración: " + duracionMinutos + "\n";
		}
	
}

