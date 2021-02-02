/**
 * 
 */
package UT622;

/**
 * @author IGOR
 *
 */
public class Libro {
	
	//Atributos de la clase privados, no accesibles desde fuera de la clase.
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;

	//---CONSTRUCTOR VACIO:---
	public Libro()
	{
		
	}
	
	//---CONSTRUCTOR QUE INICIA LAS VARIABLES:---
	public Libro(String titulo, String autor, int ejemplares, int prestados)
	{
		setTitulo(titulo);
		setAutor(autor);
		setEjemplares(ejemplares);
		setPrestados(prestados);
	}
	
	//---GETTERS:---
	public String getTitulo()
	{ 
		return this.titulo;
	}
	
	public String getAutor()
	{ 
		return this.autor;
	}
	
	public int getEjemplares()
	{ 
		return this.ejemplares;
	}
	
	public int getPrestados()
	{ 
		return this.prestados;
	}

	
	//---SETTERS:---
	public void setTitulo(String titulo)
	{
		if (titulo == "")
		{
			System.out.println("No has introducido un título.");
		}else {
			this.titulo = titulo;
		}
	}
	
	public void setAutor(String autor)
	{
		if (autor == "")
		{
			System.out.println("No has introducido el autor.");
		}else {
			this.autor = autor;
		}
	}
	
	public void setEjemplares (int ejemplares)
	{
		if (ejemplares < 0)
		{
			this.ejemplares = 0;
		}else {
			this.ejemplares = ejemplares;
		}
	}
	
	public void setPrestados (int prestados)
	{
		if (prestados < 0)
		{
			this.prestados = 0;
		}else {
			this.prestados = prestados;
		}
	}
	
	
	//---MÉTODOS:---
	public boolean prestamo()
	{ 
		boolean pres = true;
		if (prestados < ejemplares)
		{
			prestados++;
			System.out.println("Préstamos del libro realizado. ¡Disfrútalo!");
			System.out.println(" ");
		}else{
			pres = false;
			System.out.println("Lo sentimos. No se ha podido realizar el préstamo por falta de ejemplares.");
			System.out.println(" ");
		}
		return pres;
	}
	
	public boolean devolucion()
	{
		boolean devo = true;
		if(prestados != 0)
		{
			prestados--;
			System.out.println("La devolución se ha realizado con éxito. Muchas gracias.");
		}else{
			devo = false;
			System.out.println("No se ha podido realizar la devolución. Ya tenemos todos los ejemplares.");
		}
		return devo;
	}

	@Override
	public String toString() {
		return "titulo: " + titulo + "\nautor: " + autor + "\nejemplares: " + ejemplares + "\nprestamos: " + prestados;
	}
	
}	
