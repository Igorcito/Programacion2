/**
 * 
 */
package UT620;

/**
 * @author IGOR
 *
 */
public class Pruebaactividad20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Persona igor = new Persona();
			igor.setNombre("igor");
			System.out.println(igor.getNombre());
			igor.setApellidos("boullosa garcia");
			System.out.println(igor.getApellidos());
			igor.setAnio(1991);
			igor.setMes(9);
			igor.setDia(30);
			igor.setSexo('H');
			igor.saludar();
			
			System.out.println("Sexo: " + igor.getSexo());
			System.out.println(igor.saludar());
			System.out.println(igor.mostrarEdad());
			
			Persona invento = new Persona ("PEPE", "lopez garcia", 8000, 34, -3, 'G');
			System.out.println(invento.saludar());
	}	
}
