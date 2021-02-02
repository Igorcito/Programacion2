/**
 * 
 */
package UT621;

/**
 * @author IGOR
 *
 */
public class Contador {
	
	//Atributos de la clase privados, no accesibles desde fuera de la clase.
	private int cont;
	
	//Constructor Vacio.
	public Contador()
	{
		
	}
	//CONTRUCTOR QUE INICIA LAS VARIABLES:
	public Contador(int cont) 
	{
		setCont(cont);
	}
	
	public Contador(Contador Copia) {
		setCont(Copia.getCont());
	}
	
	//GETTERS & SETTERS:
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		if (cont < 0) {
			this.cont = 0;
		}else {
			this.cont = cont;
		}
	}
	//MÉTODOS:
	public void incrementar() {
		cont++;
	}
	
	public void decrementar() {
		cont--;
		if (cont < 0) {
			cont = 0;
		}
	}
}
