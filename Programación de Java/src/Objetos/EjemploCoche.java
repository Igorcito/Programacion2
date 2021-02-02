/**
 * 
 */
package Objetos;

/**
 * @author IGOR
 *
 */
public class EjemploCoche {
	
	//ATRIBUTOS O PROPIEDADES:
	String color; //Es un string porque "Rojo, azul..." es una cadenad e carácteres.
	String matricula;
	int kilometros; // Es un int porque es un número entero.
	Boolean reservado; //Esto lo creamos imaginando que el coche es de renting, para saber si está reservado o no.
	
	public EjemploCoche(String color, String matricula, int km) //No pondemos el boolean porque por defecto está disponible (Reservado = False).
	{
		this.color = color;
		this.matricula = matricula;
		this.kilometros = km;
	}
	//Métodos
	public boolean reservar()
	{
		//COSAS
		return true;
	}
	
	//Métodos
	public boolean entregar()
	{
		//COSAS
		return true;
	}
	
}
