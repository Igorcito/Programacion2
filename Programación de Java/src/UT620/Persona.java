/**
 * 
 */
package UT620;

/**
 * @author IGOR
 * Unidad 6 Ejercicio 20: Clase persona con atributos privados.
 */
public class Persona {
	//Atributos de la clase privados, no accesibles desde fuera de la clase.
	private String nombre;
	private String apellidos;
	private int anioNacimiento;
	private int mesNacimiento;
	private int diaNacimiento;
	private char sexo;
	
	//Constructor Vacio.
	public Persona()
	{
		
	}
	
	//CONTRUCTOR QUE INICIA LAS VARIABLES:
	public Persona(String nombre, String apellidos, int anio, int mes, int dia, char sexo) 
	{
		setNombre(nombre);
		setApellidos(apellidos);
		setAnio(anio);
		setMes(mes);
		setDia(dia);
		setSexo(sexo);
	}
	
	// GETTERS PÚBLICOS para los atributos (privados):
	public String getNombre()
	{ 
		return this.nombre;
	}
	
	public String getApellidos()
	{ 
		return this.apellidos;
	}
	
	public int getanioNacimiento()
	{ 
		return this.anioNacimiento;
	}
	
	public int getmesNacimiento()
	{ 
		return this.mesNacimiento;
	}
	
	public int getdiaNacimiento()
	{ 
		return this.diaNacimiento;
	}
	
	public char getSexo()
	{ 
		return this.sexo;
	}
	
	public int getEdad() {
		int edad = java.time.LocalDate.now().getYear() - this.anioNacimiento;
		return edad;
	}
	
	// SETTERS PÚBLICOS:
	public void setNombre(String nombre)
	{
		//Convierto el nombre a palabra con la primera en mayúscula.
		nombre = toUpperPrimeraLetra(nombre);
		
		//Si es menor que 4, uso "sin especificar".
		if(nombre.length() < 4 )
			nombre = "Sin especificar";
		
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		//Convertir apellidos en nombres propios:
		apellidos = convertirNombresPropios(apellidos);
		
		//Si es menor que 4, usamos sin especificar:
		if(apellidos.length() < 4 )
			apellidos="Sin especificar";
		
		this.apellidos = apellidos;
	}
	/* Si el año es menor a 1900 y mayor a 2020 ponemos por defecto
	 * el año 2000 como año de nacimiento. Si no, es el año que especifiquemos.
	 */
	public void setAnio(int anio) {
		if (anio < 1900 || anio > 2020) {
			this.anioNacimiento = 2000;
		}else {
			this.anioNacimiento = anio;
		}
	}
	
	/* Si el mes es menor que 1 y mayor que 12 ponemos por defecto
	 * 1 como mes de nacimiento. Si no, es el mes que especifiquemos.
	 */
	public void setMes(int mes) {
		if (mes < 1 || mes > 12) {
			this.mesNacimiento = 1;
		}else {
			this.mesNacimiento = mes;
		}
	}
	
	/* Si el día es menor que 1 y mayor que 31 ponemos por defecto
	 * 1 como día de nacimiento. Si no, es el día que especifiquemos.
	 */
	public void setDia(int dia) {
		if (dia < 1 || dia > 31) {
			this.diaNacimiento = 1;
		}else {
			this.diaNacimiento = dia;
		}
	}
	
	/* Si el sexo no es H(hombre) o M(mujer), por defecto
	 * ponemos X.
	 */
	public void setSexo(char sexo) {
		if (sexo != 'H' && sexo != 'M') {
			sexo = 'X';
		}
		this.sexo = sexo;
	}
	
	//Mostraremos un mensaje con la edad actual.
	public String mostrarEdad() {
		return "En la actualidad tengo "+getEdad()+" años. \n";
	}
	//Mostramos un mensaje saludando y diciendo: nombre y apellidos + fecha de nacimiento.
	public String saludar() {
		return "Hola. Soy " + this.nombre + " " + this.apellidos + " y nací el " + this.diaNacimiento + "/" + this.mesNacimiento + "/" + this.anioNacimiento + ".";
	}

	private String toUpperPrimeraLetra(String palabra) {
		String npropio = palabra.toLowerCase();
		String letra = palabra.substring(0,1).toUpperCase();
		npropio = letra + npropio.substring(1);
		return npropio;
	}

	private String convertirNombresPropios(String nombrespropios) {
		//Convierto los apellidos en un array de strings separandolo por espacios
		String[] array_propios = nombrespropios.split(" ");
				
		//Convierto cada elemento del array , en una palabra con la primera en mayusculas
		for (int i=0;i<array_propios.length;i++)
			array_propios[i] = toUpperPrimeraLetra(array_propios[i]);
				
		//Creo la cadena de apellidos ya formateada concatenando los apellidos del array
		String nombres_formateado = "";
		for (int i=0;i<array_propios.length;i++)
			nombres_formateado = nombres_formateado + array_propios[i] +" ";
		
		return nombres_formateado;
	}
}
